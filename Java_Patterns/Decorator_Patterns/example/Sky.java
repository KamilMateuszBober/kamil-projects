package example;

import decorator.pattern.SkyTv.CartoonNetwork;
import decorator.pattern.SkyTv.Discovery;
import decorator.pattern.SkyTv.ESPN;
import decorator.pattern.SkyTv.SatelliteTV;
import decorator.pattern.SkyTv.SkyTV;

public class Sky {
	public static void main(String[] args) {
		
		SatelliteTV satelliteTV = new CartoonNetwork(new Discovery(new ESPN(new SkyTV())));
	
		satelliteTV.show(205);
		System.out.println(satelliteTV.subscriptionPrice());
	}
}
