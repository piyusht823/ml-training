package com.team4.catalogbackend.service;


import com.team4.catalogbackend.model.Deliverables;
import com.team4.catalogbackend.dao.DeliverablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeliverablesService {

    private final DeliverablesRepository deliverablesRepository;

    @Autowired
    public DeliverablesService(DeliverablesRepository deliverablesRepository) {
        this.deliverablesRepository = deliverablesRepository;
    }

    public List<Deliverables> getAllDeliverables() {
        return deliverablesRepository.findAll();
    }

    public Deliverables getDeliverablesById(Long id) {
        return deliverablesRepository.findById(id).get();
    }

    public Deliverables saveDeliverables(Deliverables deliverables) {
        return deliverablesRepository.save(deliverables);
    }

    public void deleteDeliverables(Long id) {
        deliverablesRepository.deleteById(id);
    }
    // Custom method to get only deliverablesId and deliverablesName
    public List<Object[]> getAllActiveDeliverables() {
        return deliverablesRepository.findAllActiveDeliverables();
    }
}
