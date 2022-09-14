package NaveenautoamtionLabs;

public class Stringreplace {
	
	public static void main(String[] args) {
		
		String rev="";
		String str="test@23";
		String s12[] =str.split("@");
		for(int i=s12[0].length()-1;i>=0;i--){
			char charAt = s12[0].charAt(i);
			rev=rev+charAt;
		}
		System.out.println(rev+s12[1]);
	}
	
	
	

}
