package com.cgi.b3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {
	
	private String eventName;
	private LocalDate eventDate;
	private LocalTime eventTime;
	private String venueName;
	private int totalSeats;
	private int availableSeats;
	private float ticketPrice;
	enum eventType {Movie, Sports, Concert};
	
	Event(){
		eventName = "defaultEvent";
		eventDate = LocalDate.now();
		eventTime = LocalTime.now();
		venueName = "defaultVenue";
		totalSeats=0;
		availableSeats=0;
		ticketPrice=0.0f;
		
		
	}
	
	Event(String eventName,LocalDate eventDate,LocalTime eventTime  ){
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		
	}
	
	public LocalDate getEventDate() {
		return eventDate;
	}
	
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
	
	

}
