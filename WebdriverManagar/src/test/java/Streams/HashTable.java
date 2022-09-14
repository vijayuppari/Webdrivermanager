package Streams;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashTable {
	
	public static void main(String[] args) {
		
		
		// HashTable is Synchronized and TreeMap and hashMaps are non Synchronized
		// HashMap accept one null key where as TreeMap and hashTable wont accept
		// HashMap bucket size is 16 whereas hashTable bucket size is 11
		// HashMap and HashTable doesnt maintain any order wheres as TreeMap maintains order
		
		useHashTablemethods();
	}
	
	public static void useHashTablemethods(){
		
		Hashtable<Integer, String> htable= new Hashtable<>();
		
		htable.put(200, "Hari");
		htable.put(400, "Vijay");
		htable.put(300, "Amit");
		htable.put(500, "Harish");
		
		// getDefault Order
		System.out.println(htable.getOrDefault(300, "Student Name not Found"));
		
		System.out.println(htable.getOrDefault(700, "Student Name not Found"));
		
		// PutifAbsent
		htable.putIfAbsent(800, "Nani");
		System.out.println("Updated hashTable " + htable);
		
		htable.putIfAbsent(800, "Nani");
		System.out.println("Updated hashTable " + htable);
	}

}
