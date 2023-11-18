package com.team4.catalogbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.service.DTMappingService;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dt-mappings")
public class DTMappingController {

    private final DTMappingService dtMappingService;

    @Autowired
    public DTMappingController(DTMappingService dtMappingService) {
        this.dtMappingService = dtMappingService;
    }

    @GetMapping
    public List<DTMapping> getAllDTMappings() {
        return dtMappingService.getAllDTMappings();
    }

    @GetMapping("/{id}")
    public Optional<DTMapping> getDTMappingById(@PathVariable Long id) {
        return dtMappingService.getDTMappingById(id);
    }

    @PostMapping
    public DTMapping saveDTMapping(@RequestBody DTMapping dtMapping) {
        return dtMappingService.saveDTMapping(dtMapping);
    }

    @DeleteMapping("/{id}")
    public void deleteDTMapping(@PathVariable Long id) {
        dtMappingService.deleteDTMapping(id);
    }

    @GetMapping("/getmappedtechnology/{domainid}")
    List<HashMap<String, String>> GetMappedTechnology(@RequestParam long domainid){
        return dtMappingService.GetMappedTechnolgy(domainid);
    }

}
