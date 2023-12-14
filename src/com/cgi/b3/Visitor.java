package com.cgi.b3;

import com.cgi.b3.exceptions.NotCheckedForCovidException;

public class Visitor extends Person implements ViralDiseaseChecks {

	public Visitor(String bloodgroup, String birthmark) {
		super(bloodgroup, birthmark);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkForCovid() throws NotCheckedForCovidException {
		if(true) throw new NotCheckedForCovidException();
		return true;
	}

	@Override
	public boolean checkforFlu() {

		return false;
	}

}
