package com.team4.catalogbackend.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.model.Domain;
import com.team4.catalogbackend.model.Technology;

@Repository
public interface DTMappingRepository extends JpaRepository<DTMapping, Long> {

	List<DTMapping> findByDomain(Domain domain);
	
	@Query("select d from DTMapping d where d.technology = :technology AND d.domain = :domain")
	List<DTMapping> findbyDomainAndTechnology(Domain domain, Technology technology);
}