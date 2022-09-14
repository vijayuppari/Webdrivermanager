package Factorydesginpattern;

public class operatingsystemfactory {
	
	public OS getinstance(String str){
		if(str.equals("Open"))
			return new Andriod();
		else if(str.equals("Close"))
			return new IOS();
		else
			return new windows();
		
	}

}
