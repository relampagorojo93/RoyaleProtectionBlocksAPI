package royale.RoyaleProtectionBlocks.Plugin.API.Services.Protections.Objects;

import java.util.List;

import royale.RoyaleProtectionBlocks.Plugin.API.Interfaces.Protections.IProtection;
import royale.RoyaleProtectionBlocks.Plugin.API.Objects.SimpleLocation.SimpleLocationArea;

public class CachedQuery<T extends IProtection> {

	private SimpleLocationArea simpleLocationArea;
	private List<T> protections;
	private long lastRequest;
	private boolean expired = false;

	public CachedQuery(SimpleLocationArea simpleLocationArea, List<T> protections, long lastRequest) {
		this.simpleLocationArea = simpleLocationArea;
		this.protections = protections;
		this.lastRequest = lastRequest;
	}

	public SimpleLocationArea getSimpleLocationArea() {
		return this.simpleLocationArea;
	}

	public List<T> getProtections() {
		return this.protections;
	}

	public long getLastRequest() {
		return this.lastRequest;
	}

	public CachedQuery<T> setLastRequest(long lastRequest) {
		this.lastRequest = lastRequest;
		return this;
	}

	public boolean isExpired() {
		return this.expired;
	}

	public CachedQuery<T> setExpired(boolean expired) {
		this.expired = expired;
		return this;
	}

}