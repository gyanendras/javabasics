package com.cgi.b3;

public  class  Person extends Human{
	
	String name;
	
	public Person(String bloodgroup, String birthmark) {
		super(bloodgroup, birthmark);
		
	}

	
	
	String introduce() {
		return "I am a person My name is " + name;
	}

	@Override
	public String getMedicalInfo() {
		
		return bloodgroup;
	}
	
	

}
