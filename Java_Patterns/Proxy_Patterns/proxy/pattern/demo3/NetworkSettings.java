package proxy.pattern.demo3;

public class NetworkSettings {
	
	public InternetServiceProvider getInternet(){
		return new InternetProxy();
	}

	public InternetServiceProvider getInternetServiceProvider() {
		return new Sky();
	}

}
