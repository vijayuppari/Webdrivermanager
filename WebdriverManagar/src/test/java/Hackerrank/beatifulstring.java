package Hackerrank;

public class beatifulstring {
	
	// 99100101: its a beautiful string.. 99...100..101
	//920919: its not beautiful.. 9..20(10).. its not
	
	public static void main(String[] args) {
		
		seperatenumbers("99100101");
		seperatenumbers("920919");
	}
	
	public static void seperatenumbers(String s){
		
		String substring="";
		boolean isvalid=false;
		for(int i=1;i<=s.length()/2;i++){
			substring=s.substring(0,i);
			Long num=Long.parseLong(substring);
			String validstring=substring;
			while(validstring.length()<s.length()){
				validstring+=Long.toString(++num);
			}
			if(s.equals(validstring)){
				isvalid=true;
				break;
			}
		}
		System.out.println(isvalid ? " YES " + substring: "NO");
	}

}
