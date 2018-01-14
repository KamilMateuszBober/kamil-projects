package collection.second.theatre.binarysearch;

public class Main {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("OLIMP", 8, 12);
//		theatre.getSeat();

		if(theatre.reserveSeat("H11")) {
			System.out.println("please pay");
		}else {
			System.out.println("sorry, seat is taken");
		}
		
		if(theatre.reserveSeat("H11")) {
			System.out.println("please pay");
		}else {
			System.out.println("sorry, seat is taken");
		}
	}

}
