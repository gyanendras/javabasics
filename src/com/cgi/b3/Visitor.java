package com.cgi.b3;

public class Visitor extends Person implements ViralDiseaseChecks {

	public Visitor(String bloodgroup, String birthmark) {
		super(bloodgroup, birthmark);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkForCovid() {

		return true;
	}

	@Override
	public boolean checkforFlu() {

		return false;
	}

}
