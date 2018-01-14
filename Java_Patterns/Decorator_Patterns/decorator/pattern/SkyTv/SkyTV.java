package decorator.pattern.SkyTv;

public class SkyTV implements SatelliteTV {

	@Override
	public void show(int channelNumber) {
		if(channelNumber<100 ) {
			System.out.println("Basic News Channels");
		}else {
			System.out.println("You are not subscribed - please subscribe");
		}
	}

	@Override
	public int subscriptionPrice() {
		
		return 100;
	}

}
