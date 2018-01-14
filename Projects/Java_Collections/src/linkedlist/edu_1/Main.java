package linkedlist.edu_1;

public class Main {

	public static void main(String[] args) {
		
	
		
		LinkList linkList = new LinkList();
		linkList.insertFirstLink(" book 1", 3);
		linkList.insertFirstLink(" book 2", 3);
		linkList.insertFirstLink(" book 3", 3);
		linkList.insertFirstLink(" book 4", 3);
		linkList.insertFirstLink(" book 5", 3);
		
		linkList.display();
		linkList.removeFirst();
		System.out.println("___________________________________________________________________");
		linkList.display();
		System.out.println(linkList.find(" book 9"));
		System.out.println("___________________________________________________________________");
		linkList.removeLink(" book 2");
		linkList.display();
		
	}

}
