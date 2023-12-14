package com.cgi.b3.exceptions;

public class NotCheckedForCovidException extends Exception {
	public NotCheckedForCovidException() {
		super("Person is not checked for Covid");
	}

}
