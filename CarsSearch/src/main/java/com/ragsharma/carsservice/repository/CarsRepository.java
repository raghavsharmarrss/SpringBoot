package com.ragsharma.carsservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ragsharma.carsservice.entities.CarsEntity;

@Repository
public interface CarsRepository extends JpaRepository<CarsEntity, Integer> {
	
	List<CarsRepository> findByNumber(int id);

}
