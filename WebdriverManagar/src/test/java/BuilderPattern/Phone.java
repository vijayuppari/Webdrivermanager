package BuilderPattern;

public class Phone {
	
	private String OS;
	private int ram;
	private int size;
	private double processor;
	private int price;
	
	public Phone(String oS, int ram, int size, double processor, int price) {
		super();
		OS = oS;
		this.ram = ram;
		this.size = size;
		this.processor = processor;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [OS=" + OS + ", ram=" + ram + ", size=" + size + ", processor=" + processor + ", price=" + price
				+ "]";
	}
	
	
	
	
	
	
	
	

}
