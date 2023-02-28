package Naveen.Java8.concepts;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.sym.Name;
import com.google.common.base.Optional;

public class UserImplOptional {
	
	public static void main(String[] args) {
		
		 User user = new User("vijay", 35, Arrays.asList("1","2"));
		
		
		 // We use Of is for if we feel any null value in the expected results
			/*
			 * Optional<String> Nameof = Optional.of(user.getNae());
			 * System.out.println(Nameof);
			 */
		 
		 Optional<String> NamefromNullable = Optional.fromNullable(user.getNae());
		
			/*
			 * if( NamefromNullable.isPresent()) {
			 * System.out.println(NamefromNullable.get()); }
			 */
		 
		
		 
		 
		 
		 
		
	}
	


}
