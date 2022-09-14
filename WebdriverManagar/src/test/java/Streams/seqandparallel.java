package Streams;

import java.util.stream.Stream;

public class seqandparallel {

	public static void main(String[] args) {
		
		
		// 1
		Stream<String> of = Stream.of("Vijay","Naveen","Tom","Mathews");
		//of.forEach(System.out::println);
		
		// 2
		System.out.println("***************");
		of.parallel().forEach(System.out::println);
		
		//3
		
		Stream<String> of1 = Stream.of("sra123","vijay567","naresh890","a4");
		of1.map(s->s.replace("[^a-zA-Z]", "")).mapToInt(Integer::parseInt).forEach(System.out::println);
		
	}
	
}
