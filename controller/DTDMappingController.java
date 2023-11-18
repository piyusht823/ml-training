package com.team4.catalogbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.team4.catalogbackend.model.DTDMapping;
import com.team4.catalogbackend.service.DTDMappingService;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dtd-mappings")
public class DTDMappingController {

    private final DTDMappingService dtdMappingService;

    @Autowired
    public DTDMappingController(DTDMappingService dtdMappingService) {
        this.dtdMappingService = dtdMappingService;
    }

    @GetMapping
    public List<DTDMapping> getAllDTDMappings() {
        return dtdMappingService.getAllDTDMappings();
    }

    @GetMapping("/{id}")
    public Optional<DTDMapping> getDTDMappingById(@PathVariable Long id) {
        return dtdMappingService.getDTDMappingById(id);
    }

    @PostMapping
    public DTDMapping saveDTDMapping(@RequestBody DTDMapping dtdMapping) {
        return dtdMappingService.saveDTDMapping(dtdMapping);
    }

    @DeleteMapping("/{id}")
    public void deleteDTDMapping(@PathVariable Long id) {
        dtdMappingService.deleteDTDMapping(id);
    }

    @GetMapping("/getmappeddeliverables/{dtmappingid}")
    List<HashMap<String, String>> GetMappedDeliverables(@RequestParam long dtmappingid) {
        return dtdMappingService.GetMappedDeliverables(dtmappingid);
    }
}
