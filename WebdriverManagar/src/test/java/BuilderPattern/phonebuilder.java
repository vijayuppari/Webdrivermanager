package BuilderPattern;

public class phonebuilder {
	
	private String OS;
	private int ram;
	private int size;
	private double processor;
	private int price;
	
	public phonebuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	public phonebuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public phonebuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public phonebuilder setProcessor(double processor) {
		this.processor = processor;
		return this;
	}
	public phonebuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	
	public Phone getphone(){
		return new Phone(OS, ram, size, processor, price);
	}
	
}
