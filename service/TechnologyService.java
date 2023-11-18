package com.team4.catalogbackend.service;


import com.team4.catalogbackend.model.Technology;
import com.team4.catalogbackend.dao.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TechnologyService {

    private final TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyService(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public List<Technology> getAllTechnologies() {
        return technologyRepository.findAll();
    }

    public Technology getTechnologyById(Long id) {
        return technologyRepository.findById(id).get();
    }

    public Technology saveTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    public void deleteTechnology(Long id) {
        technologyRepository.deleteById(id);
    }
    
    public List<Object[]> getAllActiveTechnology() {
        return technologyRepository.findAllActiveTechnology();
    }
}
