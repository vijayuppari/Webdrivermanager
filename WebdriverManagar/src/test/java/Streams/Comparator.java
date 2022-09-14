package Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Comparator {
	
	public static void main(String[] args) {
		
		
		List<StudentTreemap> ls= new ArrayList<StudentTreemap>();
		ls.add(new StudentTreemap(100, "Vikky", "Bank"));
		ls.add(new StudentTreemap(400, "Sandeep", "IT"));
		ls.add(new StudentTreemap(200, "Dileep", "Non IT"));
		ls.add(new StudentTreemap(300, null, "Teaching"));
		ls.add(new StudentTreemap(300, "Linga", "Teaching"));
		
		
		// It will print the null values as well
		java.util.Comparator<StudentTreemap> comparing = java.util.Comparator.comparing(StudentTreemap::getStudentid);
		Collections.sort(ls,comparing);
		for(StudentTreemap s:ls){
			System.out.println("ID " + s.getStudentid() + " Name " + s.getStudentname() +
					" Department " + s.getStudentdepartment());		
		}
		
		System.out.println("Igoreing Null *******************");
		
		// Print  null values list first and Last
		ls.removeIf(Objects::isNull);
		java.util.Comparator<StudentTreemap> comparingignorenull = java.util.Comparator.comparing(StudentTreemap::getStudentname,java.util.Comparator.nullsLast(String::compareTo));
		Collections.sort(ls,comparingignorenull);
		for(StudentTreemap s:ls){
			System.out.println("ID " + s.getStudentid() + " Name " + s.getStudentname() +
					" Department " + s.getStudentdepartment());		
		}
		
	}

}
