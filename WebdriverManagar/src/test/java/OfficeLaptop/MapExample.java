package OfficeLaptop;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MapExample {
	
	public static void main(String[] args) {
		intermediate();
		
	}
	
	
	public static void intermediate(){
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5);
		
		// Sum of numbers in an Array using Sum
		/*int sum = asList.stream().mapToInt(i->i).sum();
		System.out.println(sum);*/
		
		// Sum of numbers in an Array using reduce
		/*Integer reduce = asList.stream().reduce(0,Integer::sum);
		System.out.println(reduce);*/
		
		// Sum of numbers in an Array using specified range
		/*int sum=asList.stream().limit(4).mapToInt(i->i).sum();
		System.out.println(sum);*/
		
		// 
		//String s[]= {"vijay","nanihari","Junnunitya", "sravani"};
		List<String> words = Arrays.asList("GFG", "Geeks", "vijakumaruppari","for",
                "GeeksQuiz", "GeeksforGeeks","Geeksforvijayuppari");
		Optional<String> reduce = words.stream().reduce((word1, word2)->word1.length()>word2.length()? word1:word2);
		reduce.ifPresent(System.out::println);
		//String string = reduce.get();
		//System.out.println(string);
		//System.out.println(reduce.get());
		
		
	}

}
