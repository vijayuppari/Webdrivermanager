package Lambda;

public class Lambdamap {
	
	private String epname;
	private String empid;
	private int empsala;
	
	
	
	public Lambdamap(String epname, String empid, int empsala) {
		super();
		this.epname = epname;
		this.empid = empid;
		this.empsala = empsala;
	}
	
	
	public String getEpname() {
		return epname;
	}
	public void setEpname(String epname) {
		this.epname = epname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public int getEmpsala() {
		return empsala;
	}
	public void setEmpsala(int empsala) {
		this.empsala = empsala;
	}


	@Override
	public String toString() {
		return "Lambdamap [epname=" + epname + ", empid=" + empid + ", empsala=" + empsala + "]";
	}
	
	
	

}
