package royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.BlockReason;
import royale.RoyaleProtectionBlocks.Plugin.API.Exceptions.RoyaleProtectionBlocksException;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.ProtectionBlocks.IProtectionBlock;
import royale.RoyaleProtectionBlocks.Plugin.API.Objects.SimpleLocation;
import royale.RoyaleProtectionBlocks.Plugin.API.Objects.SimpleLocation.SimpleLocationArea;

public interface IProtection {

	public abstract String getProtectionId();

	public abstract String getDisplayName();

	public abstract String getDisplayNameWithoutFormat();

	public abstract UUID getOwnerUuid();

	public abstract long getCreatedDate();

	public abstract String getOwnerName();

	public abstract long getOwnerLastPlayed();

	public abstract double getPrice();

	public abstract boolean isPublicAccess();

	public abstract boolean isForSale();

	public abstract void updateOwnerData();

	public abstract boolean isOwnerOnline();

	public abstract Location getBukkitLocation();

	public abstract int getPriority();

	public abstract boolean isBlocked();

	public abstract boolean isDeleted();

	public abstract BlockReason getBlockReason();

	public abstract long getGuardExpirationDate();

	public abstract boolean isGuardActive();

	public abstract boolean isMainOwner(UUID uuid);

	public abstract boolean isOwner(UUID uuid);

	public abstract boolean isMember(UUID uuid);

	public abstract boolean isBanned(UUID uuid);

	public abstract void addMemberAndSave(UUID memberUuid) throws RoyaleProtectionBlocksException;

	public abstract void removeMemberAndSave(UUID memberUuid) throws RoyaleProtectionBlocksException;

	public abstract void addOwnerAndSave(UUID ownerUuid) throws RoyaleProtectionBlocksException;

	public abstract void removeOwnerAndSave(UUID ownerUuid) throws RoyaleProtectionBlocksException;

	public abstract void addBannedAndSave(UUID bannedUuid) throws RoyaleProtectionBlocksException;

	public abstract void removeBannedAndSave(UUID bannedUuid) throws RoyaleProtectionBlocksException;

	public abstract boolean kickPlayer(Player player) throws RoyaleProtectionBlocksException;

	public abstract void setHome(Location location) throws Exception;

	public abstract void teleport(Player player, boolean ignoreCost, boolean ignoreUnsafeWarning)
			throws RoyaleProtectionBlocksException;

	public abstract void rename(String displayName) throws RoyaleProtectionBlocksException;

	public abstract void setPriority(int priority) throws RoyaleProtectionBlocksException;

	public abstract void hideBlock();

	public abstract void showBlock();

	public abstract boolean isBlockShown();

	public abstract void setParentProtectionAndSave(IProtection parentProtection)
			throws RoyaleProtectionBlocksException;

	public abstract void unsetParentProtectionAndSave() throws RoyaleProtectionBlocksException;

	public abstract IProtection getParentProtection();

	public abstract List<IProtection> getChildProtections();

	public abstract List<IProtection> getChildProtectionsRecursively();

	public abstract List<IProtection> getChildProtectionsRecursively(List<IProtection> list);

	public abstract boolean isInside(SimpleLocation location, boolean includeBorder);

	public abstract boolean isInside(SimpleLocationArea locationArea, boolean includeBorder);

	public abstract boolean isInsideAny(SimpleLocation location, boolean includeBorder);

	public abstract boolean isInsideAny(SimpleLocationArea locationArea, boolean includeBorder);

	public abstract SimpleLocationArea getProtectionArea();

	public abstract SimpleLocationArea getProtectionAreaWithoutBorder();

	public abstract void setGuardExpirationDateAndSave(long guardExpirationDate);

	public abstract void removeGuardExpirationDateAndSave();

	public abstract IProtectionBlock getProtectionBlock();

	public abstract String getProtectionBlockId();

	public abstract IProtectionFlags getFlags();

	public abstract void blockAndSave(BlockReason blockReason);

	public abstract void unblockAndSave();

	public abstract void setOwnerUuidAndSave(UUID ownerUuid);

	public abstract void setPriceAndSave(double price);

	public abstract void setPublicAccessAndSave(boolean publicAccess) throws RoyaleProtectionBlocksException;

	public default void teleport(Player player) throws RoyaleProtectionBlocksException {
		teleport(player, false, false);
	}

	public default void performAllProtections(CatchableConsumer<IProtection> perform) throws Throwable {
		try {
			perform.accept(this);
			getChildProtections().forEach(child -> {
				try {
					child.performAllProtections(perform);
					perform.accept(child);
				} catch (Throwable e) {
					throw new RuntimeException(e);
				}
			});
		} catch (RuntimeException e) {
			if (e.getCause() != null) {
				throw e.getCause();
			}
			throw e;
		}
	}

	public default boolean checkAnyMatchAllProtections(CatchableFunction<IProtection, Boolean> check) throws Throwable {
		try {
			if (check.apply(this)) {
				return true;
			}
			return getChildProtections().stream().anyMatch(child -> {
				try {
					return child.checkAnyMatchAllProtections(check);
				} catch (Throwable e) {
					throw new RuntimeException(e);
				}
			});
		} catch (RuntimeException e) {
			if (e.getCause() != null) {
				throw e.getCause();
			}
			throw e;
		}
	}

	public default boolean checkAllMatchAllProtections(CatchableFunction<IProtection, Boolean> check) throws Throwable {
		try {
			if (!check.apply(this)) {
				return false;
			}
			return getChildProtections().stream().allMatch(child -> {
				try {
					return child.checkAllMatchAllProtections(check);
				} catch (Throwable e) {
					throw new RuntimeException(e);
				}
			});
		} catch (RuntimeException e) {
			if (e.getCause() != null) {
				throw e.getCause();
			}
			throw e;
		}
	}

	public static interface CatchableConsumer<T> {

		public void accept(T obj) throws Throwable;

	}

	public static interface CatchableFunction<T, R> {

		public R apply(T obj) throws Throwable;

	}

}
