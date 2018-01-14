package pass.by.reference;

public class Square implements Cloneable{

	private int length_of_the_side =0;

	
	
	public Square(int length_of_the_side) {
		this.length_of_the_side = length_of_the_side;
	}

	public int getLength_of_the_side() {
		return length_of_the_side;
	}

	public void setLength_of_the_side(int new_length_of_the_side) {
		this.length_of_the_side = new_length_of_the_side;
		
		
	}
	
	
	public Square clone() throws CloneNotSupportedException{
		
		return (Square) super.clone();
	}
	
	
}
