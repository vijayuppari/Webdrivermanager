package Java2blog;

public class Arrayrotation {
	
	public static void main(String[] args) {
		
		System.out.println(arrotation("Vijaykumar","kumarVijay"));
		System.out.println(arrotation("Vijaykumar","kumarvijay"));
		
	}
	
	
	
	public static boolean arrotation(String str, String rotation){
		
		String str2=str+str;
		if(str2.contains(rotation)){
			return true;
		}
		else
			return false;
	}

}
