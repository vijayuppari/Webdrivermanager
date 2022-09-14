package OfficeLaptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class moviecollection {
	
	
	public static ArrayList<movies> getmovies(){
		
		ArrayList<movies> aslist= new ArrayList<>();
		aslist.add(new movies("Venky", "Comedy"));
		aslist.add(new movies("Chiru", "SCIFI"));
		aslist.add(new movies("Pawan", "Romance"));
		aslist.add(new movies("Prabhas", "Pathological"));
		//aslist.add(new movies("Chiru", "Entr"));
		return aslist;	
		
	
		
	}
	
	
	public static void main(String[] args) {


		
			List<movies> getmovies12 = getmovies();
			
			Map<String, String> collect2 = getmovies12.stream().sorted(Comparator.comparing(movies::getName)).collect(Collectors.toMap(movies::getName, movies::getGenere));
			
			collect2.forEach((k,v)->System.out.println( k+ " " +v));
			
			
			
			
			
			
			
			
			
			
			
			
		
			// Sort Based on HeroName
			/*getmovies12.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
			System.out.println(getmovies12);
			System.out.println("*************************");*/
			
			// Sort Based on Genere
			/*getmovies12.sort((e1,e2)->e1.getGenere().compareTo(e2.getGenere()));
			System.out.println(getmovies12);
			System.out.println("*************************");*/
			
			// Through Streams
			/*Map<String, String> collect = getmovies12.stream().collect(Collectors.toMap(movies::getName, movies::getGenere));
			System.out.println(collect);
			System.out.println("*************************");*/
			
			// If any key is repeated: get first record
			/*Map<String, String> collect2 = getmovies12.stream().collect(Collectors.toMap(movies::getName, movies::getGenere,(oldvalue, Newvalue)->oldvalue));
			System.out.println(collect2);
			System.out.println("*************************");*/
			
			// If any key is repeated: get second record
			/*Map<String, String> collect3 = getmovies12.stream().collect(Collectors.toMap(movies::getName, movies::getGenere,(oldvalue, Newvalue)->Newvalue));
			System.out.println(collect3);
			System.out.println("*************************");*/
			
			/*Map<String, String> collect = getmovies12.stream().sorted(Comparator.comparing(movies::getName)).collect(Collectors.toMap(movies::getName, movies::getGenere));
			collect.forEach((k,v)-> System.out.println(k + " "+ v));*/
			
			//getmovies12.stream().sorted(Comparator.naturalOrder());
	
		
		
			
			
	}

}
