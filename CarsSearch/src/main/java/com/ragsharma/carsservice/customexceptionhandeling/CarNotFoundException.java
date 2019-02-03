package com.ragsharma.carsservice.customexceptionhandeling;

public class CarNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CarNotFoundException(String ex) {
		super(ex);
	}	
}
