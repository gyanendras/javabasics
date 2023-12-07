package com.cgi.b3;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.sound.midi.Patch;

import com.cgi.b3.Student.Week;

public class Driver {
	static Student pat = new Student("O+", "moleOnEar", "Pat", 5, Week.MON);

	public static void main(String[] args) {

		Person p = new Student("O+", "moleOnEar", "sally", 6, Week.WED);
		Student std = new Student("O+", "moleOnEar");
		Person p1 = new Person("O+", "moleOnEar");
		Person p2 = new Professor("O+", "moleOnEar");
		Object obj = new Person("O+", "moleOnEar");
		Object obj2 = new Event();
		Object obj3 = new String();

		System.out.println(pat.introduce(true)); // Polymorphism- method overloading , static polymorphism - same method
													// name, diff params
		System.out.println(pat.introduce());

		// Dynamic polymorphism is execution of method from parent class variable ,
		// depending on what object is stored in it.
		System.out.println(p1.introduce());
		System.out.println(p.introduce());
		System.out.println(p2.introduce());

		Event ev1 = new Event();
		Event ev3 = ev1;
		System.out.println(ev1.getEventDate());
		ev1.setEventDate(LocalDate.of(2023, 12, 25));
		System.out.println(ev1.getEventDate());
		Event ev2 = new Event("New Year", LocalDate.of(2023, 12, 31), LocalTime.MIDNIGHT);
		System.out.println(ev2.getEventDate());

		System.out.println(ev2.equals(ev1));
		System.out.println(ev2 == ev1);

		System.out.println(ev3.equals(ev1));
		System.out.println(ev3 == ev1);

		System.out.println(ev1.hashCode());
		System.out.println(ev2.hashCode());
		System.out.println(ev3.hashCode());

		System.out.println(ev1.toString());
		System.out.println(ev2.toString());
		System.out.println(ev3.toString());

		Visitor per1 = new Visitor("O+", "moleOnEar");
		int x = per1.MIN_AGE;
		per1.checkForVaccination();
		
		if (per1.checkForCovid()) {// allow permission}

		}
		
		ViralDiseaseChecks vr = new Student("O+","moleOnEar");
		ViralDiseaseChecks vr1 = new Visitor("O+", "moleOnEar");
		vr.checkForCovid();

	}
}
