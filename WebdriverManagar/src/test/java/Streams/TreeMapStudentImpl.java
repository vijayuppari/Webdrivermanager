package Streams;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapStudentImpl {
	
	public static void main(String[] args) {
		
		//addingstudents();
		useTreeMapmethods();
		
		
	}
	
	public static void addingstudents(){
		
		TreeMap<Integer, StudentTreemap> tmap= new TreeMap<>();
		
		// Creating Students
		StudentTreemap s1= new StudentTreemap(100, "Vijay", "ECE");
		StudentTreemap s2= new StudentTreemap(200, "Harish", "CSE");
		StudentTreemap s3= new StudentTreemap(300, "Venu", "EEE");
		StudentTreemap s4= new StudentTreemap(150, "Vishnu", "MPC");
		
		
		// Adding to the Map
		tmap.put(1, s1);
		tmap.put(4, s2);
		tmap.put(3, s3);
		tmap.put(2, s4);
		
		// Traversing :: Print all details of Map
		for(Entry<Integer, StudentTreemap> entrySet:tmap.entrySet()){
			Integer key = entrySet.getKey();
			StudentTreemap value = entrySet.getValue();
			System.out.println("Key " + key + " Details");
			System.out.println("Student ID is " + value.getStudentid() + " Student Name is " + value.getStudentname() + 
					" Student Department is " + value.getStudentdepartment());
		}
		
			
	}

	
	public static void useTreeMapmethods(){
		
		TreeMap<Integer, String> tmap= new TreeMap<>();
		
		tmap.put(200, "Hari");
		tmap.put(400, "Vijay");
		tmap.put(300, "Amit");
		tmap.put(500, "Harish");
		
		// Descinding Order
		System.out.println("Descending Order of Map " + tmap.descendingMap().toString());
		
		// HeadMap
		System.out.println("Heading Order of Map " + tmap.headMap(400,true));
		
		// TailMap
		System.out.println("Tailing Order of Map " + tmap.tailMap(400,true));
	}
}
