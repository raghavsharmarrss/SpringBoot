package com.ragsharma.carsservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragsharma.carsservice.customexceptionhandeling.CarNotFoundException;
import com.ragsharma.carsservice.entities.CarsEntity;
import com.ragsharma.carsservice.repository.CarsRepository;

@Service
public class CarsService {

	@Autowired
	CarsRepository carsrepo;

	public List<CarsEntity> findAllCars() {
		
		ArrayList<CarsEntity> carsentitylist = new ArrayList<CarsEntity>();		
		carsrepo.findAll().forEach(carsentitylist::add);
		return carsentitylist;
	}

	public void createCar(CarsEntity carentity) {
		carsrepo.save(carentity);
	}
	
	public CarsEntity findCarById(int id) {
		Optional<CarsEntity> op = carsrepo.findById(id);
		if(!op.isPresent()) {
			throw new CarNotFoundException("car "+id+" not found");
		}
		else {
			return op.get();
		}
	}
	
	public void updateCar(int id,CarsEntity carentity) {
		carsrepo.save(carentity);
	}
	
	public void deleteCar(int id) {
		carsrepo.deleteById(id);
	}

}
