package NaveenautoamtionLabs;

public class capitalizeWord {
	
	
	
	public static String capitalizethword(String str){
		
		if(str==null){
			return str;
		}
		
		if(str.length()==1){
			return str.toUpperCase();
		}
		
		String[] splitted = str.split("\\s");
		
		String result = "";
		for(String s:splitted){
			
			String firstletter = s.substring(0, 1).toUpperCase();
			String restofstring =s.substring(1);
			result=result+firstletter+restofstring+ " ";
		}
		
		return result.trim();

	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(capitalizethword("vijay kumar uppari"));
		System.out.println(capitalizethword("123"));
		System.out.println(capitalizethword("n"));
		System.out.println(capitalizethword("n n n"));
		System.out.println(capitalizethword("123 vijay kumar uppari 456"));
	}

}
