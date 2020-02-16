package Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lambdamapclient {
	
	public static void main(String[] args) {
		
		Map<Integer,Lambdamap> lmap= new HashMap<Integer, Lambdamap>();
		lmap.put(100, new Lambdamap("vijay", "180920", 50000));
		lmap.put(200, new Lambdamap("Sandeep", "191920", 9000));
		lmap.put(300, new Lambdamap("Harsih", "1910920", 80000));
		lmap.put(400, new Lambdamap("Karinsh", "0920", 59000));
		
		lmap.forEach((k,v)->System.out.println(k+"\t"+v));
		
	}

}
