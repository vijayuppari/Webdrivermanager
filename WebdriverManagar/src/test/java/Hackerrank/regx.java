package Hackerrank;

public class regx {
	public static void main(String[] args) {
		
		
		 // Validate IP Address
		// 250-255...... ::: 25[0-5]
		// 200-249......:::: 2[0-4]
		// 0-199...........::::
		
		
		// validate Word Duplicate
		
		// Ex : Goodbye bye bye world world world
		
		//  "\b(\w+)(\W+\1\b)+";
		
		// Here \b : bounded word
		// Here \w: Any word
		// Here +: once or more times
		// {1,2}: its occurs at least 1 time but less than 2 times
		
		// ?: once or non times
		// \d : any digit
		
		
		// tag-content-extractor
		
		/*import java.io.*;
		import java.util.*;
		import java.text.*;
		import java.math.*;
		import java.util.regex.*;

		public class Solution{
			public static void main(String[] args){
				
				Scanner in = new Scanner(System.in);
				int testCases = Integer.parseInt(in.nextLine());
				while(testCases>0){
					String line = in.nextLine();
		            boolean matchfound= false;
					Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
		           Matcher match= pattern.matcher(line);
		           while(match.find()){
		               System.out.println(match.group(2));
		               matchfound=true;
		           }
		            if(!matchfound){
		                System.out.println("None");
		            }
		          	
					
					testCases--;
				}
			}
		}
*/



		
	}
	
	public static void regexmater(String match){
		
		//String regxexpression ="(25[0-5]|2[0-4]\d|[01]?\d{1,2})\.(25[0-5]|2[0-4]\d|[01]?\d{1,2})\.(25[0-5]|2[0-4]\d|[01]?\d{1,2})\.(25[0-5]|2[0-4]\d|[01]?\d{1,2})"
		
		//Pattern.compile(regex)
		
		
	}
}
