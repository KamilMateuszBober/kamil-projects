package arraylist.edu_1;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		Addres addres_1 = new Addres(	"Craigmore house",
										"Cloville Road",
										"High Wycombe",
										"buckinghamshre",
										"HP11 2SX");
		Addres addres_2 = new Addres(	"3",
										"Rowlift Road",
										"High Wycombe",
										"buckinghamshre",
										"HP12 3LD");
		Addres addres_3 = new Addres(	"71",
										"Southfield Rd",
										"High Wycombe",
										"buckinghamshre",
										"HP12 5LB");
		Addres addres_4 = new Addres(	"13",
										"GREEN STREET",
										"High Wycombe",
										"buckinghamshre",
										"HP11 2RA");
		
		Person person_1 = new Person("Kamil", addres_1);
		Person person_2 = new Person("Kamil_2", addres_3);
		

		ArrayList<Person> first_list = new ArrayList<>();
		
		first_list.add(person_1);
		first_list.add(person_2);
		
		for (Person person_x  : first_list ) {
			System.out.println("Person Name: " +person_x.getName()+"\n Postal code: "+person_x.getAddres().getPostal_code()+"\n\n");
		}
		
	}

}
