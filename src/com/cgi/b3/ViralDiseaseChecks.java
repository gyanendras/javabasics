package com.cgi.b3;

public interface ViralDiseaseChecks {
	int MIN_AGE = 3;
	
	boolean checkForCovid();
	boolean checkforFlu();
	
	default boolean checkForVaccination() {
		// more code
		return true;
	}

}
