package com.team4.catalogbackend.dao;

import com.team4.catalogbackend.model.Domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DomainRepository extends JpaRepository<Domain, Long> {
	
	@Query("SELECT d.domainId , d.domainName FROM Domain d where d.isEnabled = true")
	List<Object> findAllActiveDomain();
}
