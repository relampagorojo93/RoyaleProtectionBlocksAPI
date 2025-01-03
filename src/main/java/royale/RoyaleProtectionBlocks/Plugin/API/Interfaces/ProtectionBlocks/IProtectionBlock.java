package royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.ProtectionBlocks;

import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import royale.RoyaleProtectionBlocks.Plugin.API.Enums.ItemType;

public interface IProtectionBlock {

	public String getId();

	public int getBlocksX();

	public int getBlocksY();

	public int getBlocksZ();

	public ItemStack getItem();

	public ItemType getItemType();

	public ItemStack generateItem();

	public boolean isSameType(Block block);

	public boolean isSameType(ItemStack item);

	public String getPermission();

	public Double getPrice();

	public boolean isForSale();

}
