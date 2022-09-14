package NaveenautoamtionLabs;

public class ReplaceJunkandSpecialChars {
	
	
	public static void main(String[] args) {
		
		String str="#$@%@@%@VIJAYKumar (*";
		String str1 =str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str1);
		
	}

}
