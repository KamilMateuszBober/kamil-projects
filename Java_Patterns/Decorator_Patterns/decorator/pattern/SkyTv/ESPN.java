package decorator.pattern.SkyTv;

public class ESPN extends ChanellDeorator{

	public ESPN(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if(channelNumber>100 && channelNumber <200) {
			System.out.println("Enjoy Football match");
		}else {
			this.getSateliteTV().show(channelNumber);
		}
		
	}

	@Override
	public int subscriptionPrice() {
		
		return this.getSateliteTV().subscriptionPrice()+7;
	}

}
