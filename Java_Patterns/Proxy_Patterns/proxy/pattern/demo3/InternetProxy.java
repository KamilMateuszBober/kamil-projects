package proxy.pattern.demo3;

import java.util.Calendar;

public class InternetProxy implements InternetServiceProvider {

	/**
	 * A proxy method to do logging and filtering
	 */
	@Override
	public String getResorce(String site) {
		this.logRequest(site);
		if(this.isBlocked(site)){
			return "This site is blocked as per company policy";
		}
		NetworkSettings networkSettings = new NetworkSettings();
		return networkSettings.getInternetServiceProvider().getResorce(site);
	}

	private void logRequest(String site){
		System.out.println(Calendar.getInstance().getTime()+" Request for - "+site);
	}
	
	private boolean isBlocked(String site){
		switch (site) {
		case "www.google.com":
			return false;
		case "www.gaming.com":
			return true;
		default:
			return true;
		}
	}



}
