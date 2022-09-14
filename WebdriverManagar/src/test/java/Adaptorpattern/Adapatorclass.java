package Adaptorpattern;

public class Adapatorclass implements Pen{
	
	Pilotpen pp = new Pilotpen();
			
	
	@Override
	public void write(String str) {
		pp.mark(str);
		
	}

}
