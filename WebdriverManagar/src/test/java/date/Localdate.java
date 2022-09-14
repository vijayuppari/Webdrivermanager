package date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Localdate {
	
	public static void main(String[] args) {
		
		// Find Current time as per System
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		// Find Specific date and time
		
		LocalDate now2 = LocalDate.now(ZoneId.of("America/Chicago"));
		System.out.println(now2);
		
		// Change date format as per user
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(now.format(ofPattern));
		
		// Yesterday date
		
		System.out.println(LocalDate.now().minusDays(1));
		
		// Tomorrow date
		System.out.println(LocalDate.now().plusDays(1));
	}

}
