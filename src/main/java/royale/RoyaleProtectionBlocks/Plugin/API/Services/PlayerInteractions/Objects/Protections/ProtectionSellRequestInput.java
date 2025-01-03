package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class ProtectionSellRequestInput extends PlayerRequestInput {

	private IProtection protection;
	private double price;

	public ProtectionSellRequestInput(Player player, IProtection protection, double price) {
		super(player);
		this.protection = protection;
		this.price = price;
	}

	public IProtection getProtection() {
		return this.protection;
	}

	public double getPrice() {
		return this.price;
	}

	public static ProtectionSellRequestInput inst(Player player, IProtection protection, double price) {
		return new ProtectionSellRequestInput(player, protection, price);
	}

}
