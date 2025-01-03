package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects;

import org.bukkit.entity.Player;

public abstract class PlayerRequestInput {

	private Player player;

	public PlayerRequestInput(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return this.player;
	}

}
