package royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions;

import java.io.Serializable;

import royale.RoyaleProtectionBlocks.Plugin.API.Exceptions.RoyaleProtectionBlocksException;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Inventories.OpenProtectionManagementInventoryRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Inventories.OpenProtectionRemovalInventoryRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionCreationRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionHideBlockRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionKickRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionMergeRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionPriorityChangeRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionPurchaseRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionRemovalRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionRenameRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionSellRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionSetHomeRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionShowBlockRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionSplitRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionSwitchSettingRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionTeleportHomeRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionTogglePublicAccessRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.ProtectionTransferRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Banneds.ProtectionBannedAddRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Banneds.ProtectionBannedRemoveRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Members.ProtectionMemberAddRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Members.ProtectionMemberRemoveRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Owners.ProtectionOwnerAddRequestInput;
import royale.RoyaleProtectionBlocks.Plugin.API.Services.PlayerInteractions.Objects.Protections.Owners.ProtectionOwnerRemoveRequestInput;

public abstract class PlayerInteractionsService {

	public abstract void openProtectionManagementInventoryRequest(OpenProtectionManagementInventoryRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionCreationRequest(ProtectionCreationRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void openProtectionRemovalInventoryRequest(OpenProtectionRemovalInventoryRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionRemovalRequest(ProtectionRemovalRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionMemberAddRequest(ProtectionMemberAddRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionMemberRemoveRequest(ProtectionMemberRemoveRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionOwnerAddRequest(ProtectionOwnerAddRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionOwnerRemoveRequest(ProtectionOwnerRemoveRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionBannedAddRequest(ProtectionBannedAddRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionBannedRemoveRequest(ProtectionBannedRemoveRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract boolean protectionKickRequest(ProtectionKickRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionSetHomeRequest(ProtectionSetHomeRequestInput input) throws Exception;

	public abstract void protectionTeleportHomeRequest(ProtectionTeleportHomeRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionRenameRequest(ProtectionRenameRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionPriorityChangeRequest(ProtectionPriorityChangeRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionHideBlockRequest(ProtectionHideBlockRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionShowBlockRequest(ProtectionShowBlockRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionMergeRequest(ProtectionMergeRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionSplitRequest(ProtectionSplitRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionTransferRequest(ProtectionTransferRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionSellRequest(ProtectionSellRequestInput input) throws RoyaleProtectionBlocksException;

	public abstract void protectionPurchaseRequest(ProtectionPurchaseRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract void protectionTogglePublicAccessRequest(ProtectionTogglePublicAccessRequestInput input)
			throws RoyaleProtectionBlocksException;

	public abstract <T extends Serializable> void protectionSwitchSettingRequest(
			ProtectionSwitchSettingRequestInput<T> input) throws RoyaleProtectionBlocksException;

}
