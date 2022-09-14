package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ustglobalinterviewquestions {
	
	public static void main(String[] args) {
		
		
		
		// Print words which are starts with "S"
		List<String> asList = Arrays.asList("sravani","satish","Nani","Harish","Durga");
		List<String> collect = asList.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
		System.out.println(collect);
		
		// Group by gender
		
		List<Employee> lsemployee = new ArrayList<Employee>();
		lsemployee.add(new Employee("vijay", "Comedy", "Male"));
		lsemployee.add(new Employee("Sravani", "Thriller", "FeMale"));
		lsemployee.add(new Employee("Harish", "SiFi", "Male"));
		lsemployee.add(new Employee("Junnu", "Horror", "FeMale"));
		
		
		Map<String, List<Employee>> collect2 = lsemployee.stream().collect(Collectors.groupingBy(Employee::getGender));
		collect2.forEach((k,v)-> System.out.println(k+v));
		
		// Let print duplicate words count
		
		String str="program testing program";
		Map<String,Integer> hmap = new HashMap<String, Integer>();
		String[] words = str.split(" ");
		for(String word:words){
			Integer wordcount = hmap.get(word);
			if(wordcount==null){
				wordcount=0;
			}
			hmap.put(word, wordcount+1);
		}
		hmap.forEach((k,v)-> System.out.println(k + "__> " +v));
		
		// Create Custom functional interface
		
		ustfunctionalinterface ufinterface = ()->{
			System.out.println("I am from custom functional interface");	
		};
		ufinterface.display();
		
		
		
		
		
	}

}
