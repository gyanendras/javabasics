package com.cgi.b3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.cgi.b3.Student.Week;

public class CollectionExamples {
	
	Student simi = new Student("O+","moleOnEar","Simi", 2);
	Student sonu = new Student("O+","moleOnEar","Sonu", 3);
	Student monu = new Student("O+","moleOnEar", "Monu", 4, Week.SAT);
	Student pat = new Student("O+","moleOnEar", "Pat", 5, Week.MON);


	LinkedList<Student> testArrayList(){
		LinkedList<Student> al = new LinkedList<>();
		al.add(simi);
		al.add(sonu);
		al.add(monu);
		return al;
		
	}
	
	public static void main(String[] args) {
		CollectionExamples ce = new CollectionExamples();
		List<Student> al = ce.testArrayList();
		
		for(int i =0;i<al.size();++i) {
		//System.out.println(al.get(i).introduce());
		}
		
		for(Student s:al) {
			// System.out.println(s.introduce());
		}
		
		Iterator<Student> it = al.iterator();
		
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st.introduce());
		}

	}

}
