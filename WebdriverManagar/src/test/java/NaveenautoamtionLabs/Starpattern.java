package NaveenautoamtionLabs;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Starpattern {
	
	public static void main(String[] args) {
		
		//Stream.generate(()->2).limit(5).forEach(System.out::println);
		/*Optional<Integer> reduce = Stream.generate(()->2).limit(5).reduce((c,e)->c+e);
		System.out.println(reduce);*/
		//IntStream.range(1, 10).forEach(System.out::println);
		
		/*for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(" *");
			}
			System.out.println(" ");
		}*/
		
		int count=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count+ " ");
				count++;
			}
			System.out.println(" ");
		}
		
		
	
		
	}

}
