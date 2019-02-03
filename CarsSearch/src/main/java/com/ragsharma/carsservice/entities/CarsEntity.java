package com.ragsharma.carsservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class CarsEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private int number;
	
	private String company;
	
	private String model;
	
	private int topspeed;
	
	public CarsEntity() {
		super();
	}
	
	public CarsEntity(String company, String model, int topspeed) {
		super();
		this.company = company;
		this.model = model;
		this.topspeed = topspeed;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getTopspeed() {
		return topspeed;
	}
	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}
	
	@Override
	public String toString() {
		return "CarsEntity [number=" + number + ", company=" + company + ", model=" + model + ", topspeed=" + topspeed
				+ "]";
	}
	
	

}
