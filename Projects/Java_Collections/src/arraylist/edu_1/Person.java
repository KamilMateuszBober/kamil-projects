package arraylist.edu_1;

public class Person {

	private String Name;
	private Addres addres;
	
	public Person(String name, Addres addres) {
		super();
		Name = name;
		this.addres = addres;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Addres getAddres() {
		return addres;
	}

	public void setAddres(Addres addres) {
		this.addres = addres;
	}
	
	
	
}
