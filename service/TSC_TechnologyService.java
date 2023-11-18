package com.team4.catalogbackend.service;

import com.team4.catalogbackend.model.TSC_Technology;
import com.team4.catalogbackend.dao.TSC_TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TSC_TechnologyService {

    private final TSC_TechnologyRepository tscTechnologyRepository;

    @Autowired
    public TSC_TechnologyService(TSC_TechnologyRepository tscTechnologyRepository) {
        this.tscTechnologyRepository = tscTechnologyRepository;
    }

    public List<TSC_Technology> getAllTSC_Technologies() {
        return tscTechnologyRepository.findAll();
    }

    public Optional<TSC_Technology> getTSC_TechnologyById(Long id) {
        return tscTechnologyRepository.findById(id);
    }

    public TSC_Technology saveTSC_Technology(TSC_Technology tscTechnology) {
        return tscTechnologyRepository.save(tscTechnology);
    }

    public void deleteTSC_Technology(Long id) {
        tscTechnologyRepository.deleteById(id);
    }
}
