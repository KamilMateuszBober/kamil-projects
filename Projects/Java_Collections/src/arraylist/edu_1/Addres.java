package arraylist.edu_1;

public class Addres {

	private String first_Line_of_address;
	private String secound_Line_of_address;
	private String city;
	private String county;
	private String postal_code;
	public Addres(String first_Line_of_address, String secound_Line_of_address, String city, String county,
			String postal_code) {
		this.first_Line_of_address = first_Line_of_address;
		this.secound_Line_of_address = secound_Line_of_address;
		this.city = city;
		this.county = county;
		this.postal_code = postal_code;
	}
	public String getFirst_Line_of_address() {
		return first_Line_of_address;
	}
	public void setFirst_Line_of_address(String first_Line_of_address) {
		this.first_Line_of_address = first_Line_of_address;
	}
	public String getSecound_Line_of_address() {
		return secound_Line_of_address;
	}
	public void setSecound_Line_of_address(String secound_Line_of_address) {
		this.secound_Line_of_address = secound_Line_of_address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	
	
	
	
}
