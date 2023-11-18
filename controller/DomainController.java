package com.team4.catalogbackend.controller;

import com.team4.catalogbackend.model.Domain;
import com.team4.catalogbackend.service.DomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/domains")
public class DomainController {

    private final DomainService domainService;

    @Autowired
    public DomainController(DomainService domainService) {
        this.domainService = domainService;
    }

    @GetMapping
    public List<Domain> getAllDomains() {
        return domainService.getAllDomains();
    }

    @GetMapping("/getallactive")
    public List<Object> getAllActiveDomain(){
        return domainService.getAllActiveDomain();
    }

    @GetMapping("/{id}")
    public Domain getDomainById(@PathVariable Long id) {
        return domainService.getDomainById(id);
    }

    @PostMapping
    public Domain saveDomain(@RequestBody Domain domain){
        return domainService.saveDomain(domain);
    }

    @DeleteMapping("/{id}")
    public void deleteDomain(@PathVariable Long id) {
        domainService.deleteDomain(id);
    }
    
}
