package com.team4.catalogbackend.controller;

import com.team4.catalogbackend.model.Technology;
import com.team4.catalogbackend.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service/{groupId}/technologies")
public class TechnologyController {

    private final TechnologyService technologyService;

    @Autowired
    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<Technology> getAllTechnologies() {
        return technologyService.getAllTechnologies();
    }

    @GetMapping("/getallactive")
    public List<Object[]> getTechnologyIdAndName() {
        return technologyService.getAllActiveTechnology();
    }
    
    @GetMapping("/get/{id}")
    public Technology getTechnologyById(@PathVariable Long id) {
        return technologyService.getTechnologyById(id);
    }

    @PostMapping
    public Technology saveTechnology(@RequestBody Technology technology) {
        return technologyService.saveTechnology(technology);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTechnology(@PathVariable Long id) {
        technologyService.deleteTechnology(id);
    }


}
