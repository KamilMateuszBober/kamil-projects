package proxy.pattern.demo3;

public class Sky implements InternetServiceProvider {

	@Override
	public String getResorce(String site) {
		
		switch(site) {
		case "www.google.com":
			return "Google -site";
		case "www.3C.com":
			return " W3C - site";
		default:
			return "No resource found";
		}
	}

}
