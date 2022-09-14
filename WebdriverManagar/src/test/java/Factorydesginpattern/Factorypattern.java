package Factorydesginpattern;

public class Factorypattern {
	
	public static void main(String[] args) {
		
		operatingsystemfactory obj = new operatingsystemfactory();
		OS getinstance1 = obj.getinstance("Open");
		getinstance1.spec();
		
	}

}
