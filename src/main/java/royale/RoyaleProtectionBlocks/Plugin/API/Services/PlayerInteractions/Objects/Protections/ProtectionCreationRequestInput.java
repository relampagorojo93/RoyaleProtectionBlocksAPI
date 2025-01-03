package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.ProtectionBlocks.IProtectionBlock;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionCreationRequestInput extends PlayerRequestInput {

	private UUID ownerUuid;
	private IProtectionBlock protectionBlock;
	private Location location;

	public ProtectionCreationRequestInput(Player player, UUID ownerUuid, IProtectionBlock protectionBlock,
			Location location) {
		super(player);
		this.ownerUuid = ownerUuid;
		this.protectionBlock = protectionBlock;
		this.location = location;
	}

	public UUID getOwnerUuid() {
		return this.ownerUuid;
	}

	public IProtectionBlock getProtectionBlock() {
		return this.protectionBlock;
	}

	public Location getLocation() {
		return this.location;
	}

	public static ProtectionCreationRequestInput inst(Player player, UUID ownerUuid, IProtectionBlock protectionBlock,
			Location location) {
		return new ProtectionCreationRequestInput(player, ownerUuid, protectionBlock, location);
	}

}
