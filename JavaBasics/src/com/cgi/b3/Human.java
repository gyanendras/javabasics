package com.cgi.b3;

public abstract class Human {
	protected String bloodgroup;
	protected String birthmark;
	
	public Human(String bloodgroup, String birthmark) {
		super();
		this.bloodgroup = bloodgroup;
		this.birthmark = birthmark;
	}
	
	
	public abstract String getMedicalInfo();
	

}
