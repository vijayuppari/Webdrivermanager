package Adaptorpattern;

public class writeassignment {
	
	private	Pen p;	
	
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeassign(String str){
		
		p.write(str);
	}

}
