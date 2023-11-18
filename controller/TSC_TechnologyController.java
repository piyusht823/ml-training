package com.team4.catalogbackend.controller;

import com.team4.catalogbackend.model.TSC_Technology;
import com.team4.catalogbackend.service.TSC_TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/tsc-technologies")
public class TSC_TechnologyController {

    private final TSC_TechnologyService tscTechnologyService;

    @Autowired
    public TSC_TechnologyController(TSC_TechnologyService tscTechnologyService) {
        this.tscTechnologyService = tscTechnologyService;
    }

    @GetMapping("/getall")
    public List<TSC_Technology> getAllTSC_Technologies() {
        return tscTechnologyService.getAllTSC_Technologies();
    }

    @GetMapping("/get/{id}")
    public Optional<TSC_Technology> getTSC_TechnologyById(@PathVariable Long id) {
        return tscTechnologyService.getTSC_TechnologyById(id);
    }

    @PostMapping("/save")
    public TSC_Technology saveTSC_Technology(@RequestBody TSC_Technology tscTechnology) {
        return tscTechnologyService.saveTSC_Technology(tscTechnology);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTSC_Technology(@PathVariable Long id) {
        tscTechnologyService.deleteTSC_Technology(id);
    }
}
