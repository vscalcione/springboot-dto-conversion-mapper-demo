package it.vscalcione.springboot.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.vscalcione.springboot.demoapplication.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{
	
}
