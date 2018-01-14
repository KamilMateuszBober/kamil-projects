package pass.by.reference;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// part 1
		Square s1 = new Square(10);
		Square s2;
		
		
		s2=s1;
		
		s1.setLength_of_the_side(12);
		
		System.out.println("s1 = "+s1.getLength_of_the_side()+" / s2 = "+s2.getLength_of_the_side()+"\n");
		
		
		// part 2 deep copy
		Square s3 = new Square(1);
		
		s3.setLength_of_the_side(s1.getLength_of_the_side());
		
		System.out.println("s3 = "+s3.getLength_of_the_side());
		s2.setLength_of_the_side(8);
		System.out.println("s1 = "+s1.getLength_of_the_side()+" / s2 = "+s2.getLength_of_the_side());
		System.out.println("s3 = "+s3.getLength_of_the_side()+"\n");
		
		// part 3
		
		
		Square s4 = (Square) s3.clone();
		
		s3.setLength_of_the_side(11);
		System.out.println("s1 = "+s1.getLength_of_the_side()+" / s2 = "+s2.getLength_of_the_side()+" / s3 = "+s3.getLength_of_the_side()+" / s4 = "+s4.getLength_of_the_side()+"\n");
		
	}
}
