package royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections;

import java.util.Collection;

import org.bukkit.entity.Player;

import royale.RoyaleProtectionBlocks.Plugin.API.Exceptions.RoyaleProtectionBlocksException;

public interface IProtectionFlags {

	public void resetFlags();

	public void resetFlags(Player executor);

	public void resetFlags(Collection<String> flagsToReset);

	public void resetFlags(Player executor, Collection<String> flagsToReset);

	public void setFlag(FlagModificationRequestInput<?> input) throws RoyaleProtectionBlocksException;

	public Object getFlagValue(FlagRetrieveRequestInput input) throws RoyaleProtectionBlocksException;

	public String getFlagValueAsString(FlagRetrieveRequestInput input) throws RoyaleProtectionBlocksException;

	public static class FlagModificationRequestInput<T> {

		private Player executor;
		private String flagId;
		private T value;
		private boolean discordMessage;

		public FlagModificationRequestInput(String flagId, T value) {
			this(null, flagId, value);
		}

		public FlagModificationRequestInput(Player executor, String flagId, T value) {
			this.executor = executor;
			this.flagId = flagId;
			this.value = value;
		}

		public FlagModificationRequestInput<T> setDiscordMessage(boolean discordMessage) {
			this.discordMessage = discordMessage;
			return this;
		}

		public Player getExecutor() {
			return this.executor;
		}

		public String getFlagId() {
			return this.flagId;
		}

		public Object getValue() {
			return this.value;
		}

		public boolean isDiscordMessage() {
			return this.discordMessage;
		}

		public static <T> FlagModificationRequestInput<T> inst(String flagId, T value) {
			return new FlagModificationRequestInput<>(flagId, value);
		}

		public static <T> FlagModificationRequestInput<T> inst(Player executor, String flagId, T value) {
			return new FlagModificationRequestInput<>(executor, flagId, value);
		}

	}

	public static class FlagRetrieveRequestInput {

		private Player executor;
		private String flagId;

		public FlagRetrieveRequestInput(String flagId) {
			this(null, flagId);
		}

		public FlagRetrieveRequestInput(Player executor, String flagId) {
			this.executor = executor;
			this.flagId = flagId;
		}

		public Player getExecutor() {
			return this.executor;
		}

		public String getFlagId() {
			return this.flagId;
		}

		public static FlagRetrieveRequestInput inst(String flagId) {
			return new FlagRetrieveRequestInput(flagId);
		}

		public static FlagRetrieveRequestInput inst(Player executor, String flagId) {
			return new FlagRetrieveRequestInput(executor, flagId);
		}

	}

}
