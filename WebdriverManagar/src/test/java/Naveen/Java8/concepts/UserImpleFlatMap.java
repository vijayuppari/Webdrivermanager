package Naveen.Java8.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserImpleFlatMap {
	
	public static void main(String[] args) {
		
		
		List<User> users = Arrays.asList(
				new User("vijay", 35, Arrays.asList("1","2","3")),
				new User("Peter", 75, Arrays.asList("6","7")),
				new User("Ram", 46, Arrays.asList("4","5","9")),
				new User("vijay", 35, Arrays.asList("10")));
		
		
		Optional<String> res = users.stream().map(user->user.getPhonenumbers().stream()).flatMap(s->s.filter(phoneNum->phoneNum.equals("5")))
		.findAny();
		res.ifPresent(System.out::println);
		
	}

}
