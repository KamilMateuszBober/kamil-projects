package decorator.pattern.SkyTv;

public abstract class ChanellDeorator implements SatelliteTV {
	
	private SatelliteTV satelliteTV;
	
	
	public ChanellDeorator(SatelliteTV satelliteTV) {
		this.satelliteTV = satelliteTV;
	}
	
	
	public SatelliteTV getSateliteTV() {
		return this.satelliteTV;
	}
}
