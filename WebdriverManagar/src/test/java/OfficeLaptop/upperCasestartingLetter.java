package OfficeLaptop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class upperCasestartingLetter {
	
	
	public static void main(String[] args) {
		
		String arr[]= new String[]{"vijay","naresh","sravani","naresh"};
		changeFirstLettertoCapital(arr);
		
		/*String s="vijay";
		System.out.println(s.substring(0,s.length()-1));*/
		
	}
	
	
	public static void changeFirstLettertoCapital(String arr[]){
		
		List<String> listofvalues = Arrays.asList(arr);
		// Change Complete String to UpperCase
		List<String> toUppercase = listofvalues.stream().map(ele->ele.toUpperCase()).collect(Collectors.toList());
		toUppercase.forEach(System.out::println);
		System.out.println("***************************");
		// Change First Character to Capital Letter in Each String
		List<String> collect = listofvalues.stream().map(ele->ele.substring(0, 1).toUpperCase()+ele.substring(1)).collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("***************************");
		// Total Number of elements in the Array
		long totalelementsinArray =listofvalues.stream().count();
		System.out.println(totalelementsinArray);
		System.out.println("***************************");
		// Distinct Elements
		listofvalues.stream().distinct().forEach(System.out::println);
		
		
		
		
	
		
	}

}
