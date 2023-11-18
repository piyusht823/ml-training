package com.team4.catalogbackend.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.team4.catalogbackend.dao.DTMappingRepository;
import com.team4.catalogbackend.dao.DomainRepository;
import com.team4.catalogbackend.dao.TechnologyRepository;
import com.team4.catalogbackend.model.DTMapping;
import com.team4.catalogbackend.model.Domain;
import com.team4.catalogbackend.model.Technology;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
 
@Service
public class DTMappingService {
   
    @Autowired
    private DTMappingRepository dtMappingRepository;
 
    @Autowired
    private DomainRepository domainRepository;
 
 
    public List<DTMapping> getAllDTMappings() {
        return dtMappingRepository.findAll();
    }
 
    public Optional<DTMapping> getDTMappingById(Long id) {
        return dtMappingRepository.findById(id);
    }
 
    public DTMapping saveDTMapping(DTMapping dtMapping) {
        return dtMappingRepository.save(dtMapping);
    }
 
    public void deleteDTMapping(Long id) {
        dtMappingRepository.deleteById(id);
    }
 
    public List<HashMap<String, String>> GetMappedTechnolgy(long domainid) {
        // TODO Auto-generated method stub
       
        Domain domain = domainRepository.findById(domainid).get();
        List<DTMapping> DtMappings = dtMappingRepository.findByDomain(domain);
       
        ArrayList<HashMap<String, String>>technologies = new ArrayList<>();
       
        for(int i  = 0 ; i<DtMappings.size() ; i++) {
           
            HashMap<String, String>technology = new HashMap<String, String>();
           
            Long tech_id = DtMappings.get(i).getDtMappingId();
           
            String tech_name = DtMappings.get(i).getTechnology().getTechnologyName();
            technology.put("id", tech_id.toString());
            String technology_temp = "technology";
            technology.put(technology_temp, tech_name);
           
            technologies.add(technology);
           
        }
        return technologies;
    }

	public List<DTMapping> check(Domain domain, Technology technology) {
		// TODO Auto-generated method stub
		List<DTMapping>dtmappings = dtMappingRepository.findbyDomainAndTechnology(domain , technology);
		
		return dtmappings;
	}
}
 
