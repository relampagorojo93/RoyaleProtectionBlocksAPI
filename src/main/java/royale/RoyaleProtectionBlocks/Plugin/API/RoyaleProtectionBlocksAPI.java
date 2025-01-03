package royale.RoyaleProtectionBlocks.Plugin.API;

import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.PlayerInteractionsService;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.ProtectionsService;

public abstract class RoyaleProtectionBlocksAPI {

	private static RoyaleProtectionBlocksAPI instance;

	public RoyaleProtectionBlocksAPI() {
		RoyaleProtectionBlocksAPI.instance = this;
	}

	public abstract PlayerInteractionsService getPlayerInteractionsService();

	public abstract ProtectionsService<?> getProtectionsService();

	public static RoyaleProtectionBlocksAPI getInstance() {
		return instance;
	}

}
