package factory.pattern.mobile;

public class Sony implements Mobile {
	
	private int ramSize;
	private String processor;
	
	public Sony(int ramSize, String processor) {
		this.ramSize = ramSize;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Sony [ramSize=" + ramSize + ", processor=" + processor + "]";
	}
	
	
}
