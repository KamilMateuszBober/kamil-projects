package collection.second.theatre.binarysearch;

public class Seat  implements Comparable<Seat>{

	private final String seatNumber;
	private boolean reserved = false;
	
	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	
	public String getSeatNumber() {
		return seatNumber;
	}


	public boolean reserve() {
		if(!this.reserved) {
			this.reserved =true;
			System.out.println("seat" + seatNumber+"reserved");
			return true;
		}else {
			return false;
		}
	}
	
	public boolean cancel() {
		if(this.reserved) {
			this.reserved = false;
			System.out.println("seat" + seatNumber+"canceled");
			return true;
		}else {
			return false;
		}
		
	}


	@Override
	public int compareTo(Seat seat) {
		return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
	}

}
