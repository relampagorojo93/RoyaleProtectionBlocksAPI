package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionChangeDisplayItemRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private ItemStack newDisplayItem;

	public ProtectionChangeDisplayItemRequestInput(Player player, IProtection protection, ItemStack newDisplayItem) {
		super(player);
		this.protection = protection;
		this.newDisplayItem = newDisplayItem;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public ItemStack getNewDisplayItem() {
		return this.newDisplayItem;
	}

	public static ProtectionChangeDisplayItemRequestInput inst(Player player, IProtection protection,
			ItemStack newDisplayItem) {
		return new ProtectionChangeDisplayItemRequestInput(player, protection, newDisplayItem);
	}

}
