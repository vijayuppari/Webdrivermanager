package Hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeconversion {
	
	public static void main(String[] args) throws ParseException {
		
		DateFormat date= new SimpleDateFormat("HH:mm");
		SimpleDateFormat dates= new SimpleDateFormat("hh:mm a");
		Date parse = dates.parse("10:30 PM");
		System.out.println(dates.format(parse) + "  " + date.format(parse));
	}

}
