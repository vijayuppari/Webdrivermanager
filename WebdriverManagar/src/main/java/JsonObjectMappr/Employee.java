package JsonObjectMappr;

public class Employee {
	
	private int empid;
	private String empname;
	private String project;
	private String designation;
	
	public Employee(){
		
	}
	

	public Employee(int empid, String empname, String project, String designation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.project = project;
		this.designation = designation;
	}



	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	

}
