package Streams;

public class Employee {
	
	private String name;
	private String genere;
	private String gender;
	
	
	public Employee(String name, String genere, String gender) {
		super();
		this.name = name;
		this.genere = genere;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", genere=" + genere + ", gender=" + gender + "]";
	}


	
	

}
