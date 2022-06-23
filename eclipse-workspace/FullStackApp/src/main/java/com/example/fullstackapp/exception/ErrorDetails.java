package com.example.fullstackapp.exception;

import java.util.Date;

public class ErrorDetails {
	// criar alguns atributos
	private Date timestamp;
	private String message;
	private String details;
	
	//getters
	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}
	
	public String getDetails() {
		return details;
	}

	// constructor
	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}	
	

}
