package BuilderPattern;

public class Shop {
	
	public static void main(String[] args) {
		
		/*Phone p= new Phone("SAMSUNG", 2, 10, 11.90, 890);
		System.out.println(p);*/
		
		phonebuilder setOS = new phonebuilder().setOS("Iphone").setRam(5);
		System.out.println(setOS.getphone());
		
		phonebuilder sedge= new phonebuilder().setOS("Edge").setSize(6);
		System.out.println(sedge.getphone());
		
	}

}
