package it.vscalcione.springboot.demoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.vscalcione.springboot.demoapplication.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}