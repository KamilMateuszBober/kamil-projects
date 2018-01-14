package linkedlist.edu_1;

public class Link {

	public String bookName;
	public int milionsSold;
	
	public Link next;

	public Link(String bookName, int milionsSold) {
		this.bookName = bookName;
		this.milionsSold = milionsSold;
	}
	
	public void display() {
		System.out.println(bookName+": "+milionsSold+",000,000");
	}
	
	public String toString(){
		return bookName;
	 }


}
