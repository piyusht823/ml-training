package com.team4.catalogbackend.controller;
 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
 
import com.team4.catalogbackend.model.DTDPMapping;

import com.team4.catalogbackend.service.DTDPMappingService;
 
import java.util.HashMap;

import java.util.List;

import java.util.Optional;
 
@RestController

@RequestMapping("/api/dtdp-mappings")

public class DTDPMappingController {
 
    private final DTDPMappingService dtdpMappingService;
 
    @Autowired

    public DTDPMappingController(DTDPMappingService dtdpMappingService) {

        this.dtdpMappingService = dtdpMappingService;

    }
 
    @GetMapping

    public List<DTDPMapping> getAllDTDPMappings() {

        return dtdpMappingService.getAllDTDPMappings();

    }
 
    @GetMapping("/{id}")

    public Optional<DTDPMapping> getDTDPMappingById(@PathVariable Long id) {

        return dtdpMappingService.getDTDPMappingById(id);

    }
 
    @PostMapping

    public DTDPMapping saveDTDPMapping(@RequestBody DTDPMapping dtdpMapping) {

        return dtdpMappingService.saveDTDPMapping(dtdpMapping);

    }
 
    @DeleteMapping("/{id}")

    public void deleteDTDPMapping(@PathVariable Long id) {

        dtdpMappingService.deleteDTDPMapping(id);

    }
 
    @GetMapping("/getmappedprocesses/{dtdmappingid}")

    List<HashMap<String, String>> GetMappedProcesses(@RequestParam long dtdmappingid) {

        return dtdpMappingService.GetMappedProcesses(dtdmappingid);

    }

}
