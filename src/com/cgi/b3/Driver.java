package com.cgi.b3;

import javax.sound.midi.Patch;

import com.cgi.b3.Student.Week;

public class Driver {
	static Student pat = new Student("Pat", 5, Week.MON);

	public static void main(String[] args) {
		
		Person p = new Student("sally", 6, Week.WED);
		Person p1 = new Person();
		Person p2 = new Professor();
		
		
		
		System.out.println(pat.introduce(true)); // Polymorphism- method overloading , static polymorphism - same method name, diff params
		System.out.println(pat.introduce());
		
		//Dynamic polymorphism is execution of method from parent class variable , depending on what object is stored in it.
		System.out.println(p1.introduce());
		System.out.println(p.introduce());
		System.out.println(p2.introduce());

	}

}
