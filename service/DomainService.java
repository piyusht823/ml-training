package com.team4.catalogbackend.service;

import com.team4.catalogbackend.model.Domain;
import com.team4.catalogbackend.dao.DomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomainService {

    private final DomainRepository domainRepository;

    @Autowired
    public DomainService(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    public List<Domain> getAllDomains() {
        return domainRepository.findAll();
    }

    public Domain getDomainById(Long id) {
        return domainRepository.findById(id).get();
    }

    public Domain saveDomain(Domain domain) {
        return domainRepository.save(domain);
    }

    public void deleteDomain(Long id) {
        domainRepository.deleteById(id);
    }

	public List<Object> getAllActiveDomain() {
		return domainRepository.findAllActiveDomain();
	}
}
