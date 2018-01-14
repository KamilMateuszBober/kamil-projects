package proxy.pattern.demo3;


import javax.swing.JOptionPane;

public class Browser {
	/**
	 * Send a request to InternetServiceProvider
	 * @param site
	 */
	public void sendRequest(){
		String site = JOptionPane.showInputDialog("Enter the site URL");
		String response = this.getInternetProvider().getResorce(site);
		this.loadResponse(response);
	}
	/**
	 * Prints the output from InternetServiceProvider
	 * @param response
	 */
	private void loadResponse(String response){
		System.out.println(response);
	}
	
	/**
	 * Gets the network settings for InternetServiceProvider to use.
	 * @return InternetServiceProvider
	 */
	private InternetServiceProvider getInternetProvider(){
		return new NetworkSettings().getInternet();
	}
}