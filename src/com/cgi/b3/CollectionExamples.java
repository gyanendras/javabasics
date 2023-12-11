package com.cgi.b3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.cgi.b3.Student.Week;

public class CollectionExamples {

	Student simi = new Student("O+", "moleOnEar", "Simi", 2);
	Student sonu = new Student("O+", "moleOnEar", "Sonu", 3);
	Student monu = new Student("O+", "moleOnEar", "Monu", 4, Week.SAT);
	Student pat = new Student("O+", "moleOnEar", "Pat", 5, Week.MON);
	List<Student> al = new LinkedList<>();

	List<Student> testArrayList() {

		al.add(simi);
		al.add(simi);
		al.add(simi);
		al.add(sonu);
		al.add(monu);
		al.add(pat);
		return al;

	}

	public static void main(String[] args) {
		CollectionExamples ce = new CollectionExamples();
		List<Student> al = ce.testArrayList();

		for (int i = 0; i < 5; ++i) {
			al.add(new Student("O+", "moleOnEar", "Name" + i, i));
		}

		Set<Student> al1 = new TreeSet<>(ce.testArrayList());

		// Collections.sort(al);

		for (int i = 0; i < al.size(); ++i) {
			// System.out.println(al.get(i).introduce());
		}

		for (Student s : al1) {
			// System.out.println(s.introduce());
		}

		Iterator<Student> it = al1.iterator();

		while (it.hasNext()) {
			Student st = it.next();
			System.out.println(st.introduce());
		}

		Map<Student, Event> mp = new HashMap<>();
		mp.put(ce.simi, new Event("Music", LocalDate.of(2023, 12, 31), LocalTime.MIDNIGHT));
		mp.put(ce.sonu, new Event("Sports", LocalDate.of(2023, 01, 02), LocalTime.of(10, 30)));
		mp.put(ce.monu, new Event("Concert", LocalDate.of(2023, 01, 03), LocalTime.of(11, 30)));

		System.out.println(mp.get(ce.monu).getEventName());

		Set<Student> keys = mp.keySet();
		for (Student st : keys) {
			System.out.println(st.introduce());

		}
		
		Collection<Event> evs = mp.values();
		for(Event ev:evs) {
			System.out.println(ev.getEventName());
		}
		
	}

}
