package com.cgi.b3;

public class Professor extends Person {
	String name;

	// Method overriding the method of parent class with same name and parameters.
		String introduce() {
			return "I am a Professor My Name is " + name ;
		}
}
