package com.ragsharma.carsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ragsharma.carsservice.entities.CarsEntity;
import com.ragsharma.carsservice.service.CarsService;

@RestController
public class CarsController {

	@Autowired
	private CarsService carsservice;

	@RequestMapping(method = RequestMethod.GET, value = "/allcars")
	public List<CarsEntity> getAllCars() {
		return carsservice.findAllCars();
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addcars")
	public void addCar(@RequestBody CarsEntity carentity) {
		carsservice.createCar(carentity);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/car/{id}")
	public CarsEntity getCarById(@PathVariable int id) {
		return carsservice.findCarById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/updatecars/{id}")
	public String updateCarById(@PathVariable int id, CarsEntity carentity ) {
		carsservice.updateCar(id, carentity);
		return "Updated Successfully";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deletecar/{id}")
	public String deteteCar(@PathVariable int id) {
		
		carsservice.deleteCar(id);
		return "Deleted Successfully!";
				
	}

}
