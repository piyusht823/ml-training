package com.team4.catalogbackend.service;


import com.team4.catalogbackend.model.TSC_Deliverables;
import com.team4.catalogbackend.dao.TSC_DeliverablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TSC_DeliverablesService {

    private final TSC_DeliverablesRepository tscDeliverablesRepository;

    @Autowired
    public TSC_DeliverablesService(TSC_DeliverablesRepository tscDeliverablesRepository) {
        this.tscDeliverablesRepository = tscDeliverablesRepository;
    }

    public List<TSC_Deliverables> getAllTSC_Deliverables() {
        return tscDeliverablesRepository.findAll();
    }

    public Optional<TSC_Deliverables> getTSC_DeliverablesById(Long id) {
        return tscDeliverablesRepository.findById(id);
    }

    public TSC_Deliverables saveTSC_Deliverables(TSC_Deliverables tscDeliverables) {
        return tscDeliverablesRepository.save(tscDeliverables);
    }

    public void deleteTSC_Deliverables(Long id) {
        tscDeliverablesRepository.deleteById(id);
    }
}

