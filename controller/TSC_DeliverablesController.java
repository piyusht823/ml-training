package com.team4.catalogbackend.controller;


import com.team4.catalogbackend.model.TSC_Deliverables;
import com.team4.catalogbackend.service.TSC_DeliverablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/tsc-deliverables")
public class TSC_DeliverablesController {

    private final TSC_DeliverablesService tscDeliverablesService;

    @Autowired
    public TSC_DeliverablesController(TSC_DeliverablesService tscDeliverablesService) {
        this.tscDeliverablesService = tscDeliverablesService;
    }

    @GetMapping("/getall")
    public List<TSC_Deliverables> getAllTSC_Deliverables() {
        return tscDeliverablesService.getAllTSC_Deliverables();
    }

    @GetMapping("/get/{id}")
    public Optional<TSC_Deliverables> getTSC_DeliverablesById(@PathVariable Long id) {
        return tscDeliverablesService.getTSC_DeliverablesById(id);
    }

    @PostMapping("/save")
    public TSC_Deliverables saveTSC_Deliverables(@RequestBody TSC_Deliverables tscDeliverables) {
        return tscDeliverablesService.saveTSC_Deliverables(tscDeliverables);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTSC_Deliverables(@PathVariable Long id) {
        tscDeliverablesService.deleteTSC_Deliverables(id);
    }
}

