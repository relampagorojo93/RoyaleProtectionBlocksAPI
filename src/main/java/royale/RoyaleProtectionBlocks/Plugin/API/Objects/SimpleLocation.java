package royale.RoyaleProtectionBlocks.Plugin.API.Objects;

import java.util.function.BiFunction;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class SimpleLocation {

	private static final BiFunction<SimpleLocation, SimpleLocation, Boolean> HIGHER_OR_EQUAL_THAN_CHECKING = (loc1,
			loc2) -> loc1.getX() >= loc2.getX() && loc1.getY() >= loc2.getY() && loc1.getZ() >= loc2.getZ();
	private static final BiFunction<SimpleLocation, SimpleLocation, Boolean> LOWER_OR_EQUAL_THAN_CHECKING = (loc1,
			loc2) -> loc1.getX() <= loc2.getX() && loc1.getY() <= loc2.getY() && loc1.getZ() <= loc2.getZ();

	private String worldName;
	private double x;
	private double y;
	private double z;

	public SimpleLocation(String worldName, double x, double y, double z) {
		this.worldName = worldName;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getWorldName() {
		return this.worldName;
	}

	public double getX() {
		return this.x;
	}

	public SimpleLocation setX(double x) {
		this.x = x;
		return this;
	}

	public double getY() {
		return this.y;
	}

	public SimpleLocation setY(double y) {
		this.y = y;
		return this;
	}

	public double getZ() {
		return this.z;
	}

	public SimpleLocation setZ(double z) {
		this.z = z;
		return this;
	}

	public SimpleLocation add(double x, double y, double z) {
		this.x += x;
		this.y += y;
		this.z += z;
		return this;
	}

	public SimpleLocation substract(double x, double y, double z) {
		this.x -= x;
		this.y -= y;
		this.z -= z;
		return this;
	}

	public SimpleLocation clone() {
		return new SimpleLocation(worldName, x, y, z);
	}

	public Location toLocation() {
		World world = Bukkit.getWorld(worldName);
		return world != null ? new Location(Bukkit.getWorld(worldName), x, y, z) : null;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (!(obj instanceof SimpleLocation)) {
			return false;
		}

		SimpleLocation loc = (SimpleLocation) obj;
		return loc.getWorldName().equals(this.getWorldName()) && loc.getX() == this.getX() && loc.getY() == this.getY()
				&& loc.getZ() == this.getZ();
	}

	public static SimpleLocation of(Location location) {
		return new SimpleLocation(location.getWorld().getName(), location.getX(), location.getY(), location.getZ());
	}

	public static class SimpleLocationArea {

		private String worldName;
		private SimpleLocation minLocation;
		private SimpleLocation maxLocation;

		public SimpleLocationArea(String worldName, SimpleLocation minLocation, SimpleLocation maxLocation) {
			this.worldName = worldName;
			this.minLocation = minLocation;
			this.maxLocation = maxLocation;
		}

		public String getWorldName() {
			return this.worldName;
		}

		public SimpleLocation getMinLocation() {
			return this.minLocation;
		}

		public void setMinLocation(SimpleLocation minLocation) {
			this.minLocation = minLocation;
		}

		public SimpleLocation getMaxLocation() {
			return this.maxLocation;
		}

		public void setMaxLocation(SimpleLocation maxLocation) {
			this.maxLocation = maxLocation;
		}

		public SimpleLocationArea(String worldName, Location location1, Location location2) {
			this.worldName = worldName;
			this.minLocation = new SimpleLocation(worldName, Math.min(location1.getX(), location2.getX()),
					Math.min(location1.getY(), location2.getY()), Math.min(location1.getZ(), location2.getZ()));
			this.maxLocation = new SimpleLocation(worldName, Math.max(location1.getX(), location2.getX()),
					Math.max(location1.getY(), location2.getY()), Math.max(location1.getZ(), location2.getZ()));
		}

		public boolean isInside(SimpleLocation location) {
			return HIGHER_OR_EQUAL_THAN_CHECKING.apply(location, minLocation)
					&& LOWER_OR_EQUAL_THAN_CHECKING.apply(location, maxLocation)
					&& getWorldName().equals(location.getWorldName());
		}

		public boolean isInside(SimpleLocationArea locationArea) {
			return HIGHER_OR_EQUAL_THAN_CHECKING.apply(locationArea.getMaxLocation(), minLocation)
					&& LOWER_OR_EQUAL_THAN_CHECKING.apply(locationArea.getMinLocation(), maxLocation)
					&& getWorldName().equals(locationArea.getWorldName());
		}

		public boolean isAllInside(SimpleLocation location) {
			return HIGHER_OR_EQUAL_THAN_CHECKING.apply(location, minLocation)
					&& LOWER_OR_EQUAL_THAN_CHECKING.apply(location, maxLocation)
					&& getWorldName().equals(location.getWorldName());
		}

		public boolean isAllInside(SimpleLocationArea locationArea) {
			return HIGHER_OR_EQUAL_THAN_CHECKING.apply(locationArea.getMinLocation(), minLocation)
					&& LOWER_OR_EQUAL_THAN_CHECKING.apply(locationArea.getMaxLocation(), maxLocation)
					&& getWorldName().equals(locationArea.getWorldName());
		}

		public SimpleLocationArea clone() {
			return new SimpleLocationArea(worldName, minLocation.clone(), maxLocation.clone());
		}

		public static SimpleLocationArea of(SimpleLocation location1, SimpleLocation location2) {
			return new SimpleLocationArea(location1.getWorldName(), location1, location2);
		}

		public static SimpleLocationArea of(Location location1, Location location2) {
			return new SimpleLocationArea(location1.getWorld().getName(), location1, location2);
		}

	}

}
