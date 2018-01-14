package factory.pattern.mobile;

public class Iphone implements Mobile {

	private int ramSize;
	private String processor;
	private String GPU;
	
	public Iphone(int ramSize, String processor, String GPU) {
		super();
		this.ramSize = ramSize;
		this.processor = processor;
		this.GPU = GPU;
	}

	@Override
	public String toString() {
		return "Iphone [ramSize=" + ramSize + ", processor=" + processor + ", GPU=" + GPU + "]";
	}
	
	
}
