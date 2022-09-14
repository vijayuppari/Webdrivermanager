package NaveenautoamtionLabs;

public class GetwordscountinCapitalizedSring {
	
	
	public static void main1(String[] args) {
		
		wordscount("VijayKumarUppariSravanijunnu");
		
	}
	
	// Using normal for loop
	public static void wordscount(String str){
		
		int count=0;
		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i)>'A' && str.charAt(i)<'Z'){
				count++;
			}
		}
		System.out.println(count);
	}
	
	// Using Streams:
	
	public static void main(String[] args) {
		
		String str="VijayKumarUppariSravanijunnu";
		long count = str.chars().filter(ele->Character.isUpperCase(ele)).count();
		System.out.println(count);
		
	}

}
