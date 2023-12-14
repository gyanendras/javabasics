package com.cgi.b3;

import com.cgi.b3.exceptions.NotCheckedForCovidException;

public interface ViralDiseaseChecks {
	int MIN_AGE = 3;
	
	boolean checkForCovid() throws NotCheckedForCovidException;
	boolean checkforFlu();
	
	default boolean checkForVaccination() {
		// more code
		return true;
	}

}
