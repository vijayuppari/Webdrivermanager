package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Studentimpl {
	
	public static void main(String[] args) {
		
		
		List<Student> studentlist = Arrays.asList(
				new Student(10, "Junnu"),
				new Student(30, "Sravani"),
				new Student(5, "Siri"),
				new Student(40, "Vjay")
				);
		
		// Approach 1
		Student sFilter = studentlist.stream().filter(e->"Siri".equals(e.getsName())).findAny().orElse(null);
		//System.out.println(sFilter.getsName() + " " + sFilter.getsAge());
		
		// Approach 2
		
		String name = studentlist.stream().filter(e->"Junnu".equals(e.getsName())).map(Student::getsName).findAny().orElse(null);
		//System.out.println(name);
		
		// Approach 3
		
		List<String> collect = studentlist.stream().map(Student::getsName).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
