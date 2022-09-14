package OfficeLaptop;

public class movies {
	
	private String name;
	private String genere;
	
	
	
	
	public movies(String name, String genere) {
		super();
		this.name = name;
		this.genere = genere;
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


	@Override
	public String toString() {
		return "movies [name=" + name + ", genere=" + genere + "]";
	}
	
	
	

}
