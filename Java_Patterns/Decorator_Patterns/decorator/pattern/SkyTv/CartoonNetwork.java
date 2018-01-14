package decorator.pattern.SkyTv;

public class CartoonNetwork extends ChanellDeorator{

	public CartoonNetwork(SatelliteTV satelliteTV) {
		super(satelliteTV);
	}

	@Override
	public void show(int channelNumber) {
		if(channelNumber>300 && channelNumber <400) {
			System.out.println("Enjoy cartoon");
		}else {
			this.getSateliteTV().show(channelNumber);
		}
		
	}

	@Override
	public int subscriptionPrice() {
		
		return this.getSateliteTV().subscriptionPrice()+6;
	}


}
