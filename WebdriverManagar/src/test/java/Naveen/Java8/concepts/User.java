package Naveen.Java8.concepts;

import java.util.List;

public class User {
	
	private String nae;
	private int age;
	private List<String> phonenumbers;
	
	
	public User(String nae, int age, List<String> phonenumbers) {
		super();
		this.nae = nae;
		this.age = age;
		this.phonenumbers = phonenumbers;
	}
	
	
	public String getNae() {
		return nae;
	}
	public void setNae(String nae) {
		this.nae = nae;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(List<String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	
	

}
