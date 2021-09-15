package it.vscalcione.springboot.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.vscalcione.springboot.demoapplication.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{
	
}
