package decorator.pattern.SkyTv;

public class Discovery extends ChanellDeorator{

	
	
	public Discovery(SatelliteTV satelliteTV) {
		super(satelliteTV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show(int channelNumber) {
		if(channelNumber>200 && channelNumber <300) {
			System.out.println("yea DOcumentary ");
		}else {
			this.getSateliteTV().show(channelNumber);
		}
		
	}

	@Override
	public int subscriptionPrice() {
		
		return this.getSateliteTV().subscriptionPrice()+10;
	}


}
