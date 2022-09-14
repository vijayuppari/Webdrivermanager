package Adaptorpattern;

public class school {
	
	public static void main(String[] args) {
		
		Pen pp1= new Adapatorclass();
		
		writeassignment aw= new writeassignment();
		aw.setP(pp1);
		aw.writeassign("I am tired to write assignment");
		
	}

}
