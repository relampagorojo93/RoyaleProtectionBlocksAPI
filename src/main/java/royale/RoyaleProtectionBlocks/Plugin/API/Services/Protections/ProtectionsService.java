package royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.block.Block;

import royale.RoyaleProtectionBlocks.Plugin.API.Exceptions.RoyaleProtectionBlocksException;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.ProtectionBlocks.IProtectionBlock;
import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Objects.SimpleLocation;
import royale.RoyaleProtectionBlocks.Plugin.API.Objects.SimpleLocation.SimpleLocationArea;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects.CachedQuery;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects.ProtectionCreationData;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects.ProtectionRemovalData;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects.ProtectionTransferData;

public interface ProtectionsService<T extends IProtection> {

	/*
	 * Transfer methods
	 */

	public void transfer(ProtectionTransferData protectionTransferData) throws RoyaleProtectionBlocksException;

	/*
	 * Create/delete methods
	 */

	public T create(ProtectionCreationData protectionCreationData) throws RoyaleProtectionBlocksException;

	public void delete(ProtectionRemovalData protectionRemovalData) throws RoyaleProtectionBlocksException;

	/*
	 * Search methods
	 */

	public T findProtectionById(String id);

	public T findProtectionByLocation(Location location);

	public Stream<T> findProtectionsByLocation(Location location);

	public Stream<T> findProtectionsByLocation(Location location, boolean includeBorder);

	public Stream<T> findProtectionsByArea(Location location1, Location location2);

	public Stream<T> findProtectionsByArea(Location location1, Location location2, boolean includeBorder);

	public T findProtectionBySourceBlock(Block sourceBlock);

	public List<T> findProtectionsByOwner(UUID owner);

	public T findProtectionBySourceLocation(Location sourceLocation);

	public T findProtectionParentByLocation(Location location);

	public Stream<T> findProtectionParentsByLocation(Location location);

	public Stream<T> findProtectionParentsByLocation(Location location, boolean includeBorder);

	public Stream<T> findProtectionParentsByArea(Location location1, Location location2);

	public Stream<T> findProtectionParentsByArea(Location location1, Location location2, boolean includeBorder);

	public Stream<T> findProtectionParentsByArea(SimpleLocationArea locationArea);

	public Stream<T> findProtectionParentsByArea(SimpleLocationArea locationArea, boolean includeBorder);

	public Stream<T> findAllowedParentProtectionsByPlayer(OfflinePlayer pl);

	public Stream<T> findAllowedParentProtectionsByPlayerUuid(UUID uuid);

	public Stream<T> findProtectionsByProtectionBlock(IProtectionBlock protectionBlock);

	public Stream<T> findProtectionsByProtectionBlockId(String protectionBlockId);

	public CachedQuery<T> query(SimpleLocation location, boolean includeBorder);

	public CachedQuery<T> query(SimpleLocationArea locationArea, boolean includeBorder);

}
