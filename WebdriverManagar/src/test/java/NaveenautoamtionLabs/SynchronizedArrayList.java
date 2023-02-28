package NaveenautoamtionLabs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class SynchronizedArrayList {
	
	public static void main(String[] args) {
		
		
		List<String> synchronizedlist = Collections.synchronizedList(new ArrayList<String>());
		synchronizedlist.add("Vijay");
		synchronizedlist.add("Hari");
		synchronizedlist.add("Nani");
		
		// Explicit Synchronization required
		
		synchronized (synchronizedlist) {
		Iterator<String> iterator = synchronizedlist.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
		}
		
		
		CopyOnWriteArrayList<String> copyandarraylist= new CopyOnWriteArrayList<String>();
		copyandarraylist.add("Naveen");
		copyandarraylist.add("Sameer");
		copyandarraylist.add("Sravani");
			Iterator<String> iterator = copyandarraylist.iterator();
			while(iterator.hasNext()){
				String next = iterator.next();
				System.out.println(next);
			}
	}
	
	

}
