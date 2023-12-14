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
	
	
	public String toString() {
		return " Name is " + eventName + " \n Date is " + eventDate + "\n time is " + eventTime;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalTime getEventTime() {
		return eventTime;
	}

	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
