package com.team4.catalogbackend.model;

import java.sql.Time;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

//import com.team4.catalogbackend.model.Domain;
//import com.team4.catalogbackend.model.Technology;

import jakarta.persistence.*;

@Entity
public class DTMapping {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dtMappingId;

    @ManyToOne
    @JoinColumn(name = "domain_id")
    private Domain domain;

    @ManyToOne
    @JoinColumn(name = "technology_id")
    private Technology technology;
    
    private String createdBy;
    
    @CreationTimestamp
    private LocalDateTime createdOn;
    
    private String modifiedBy;
    
    @CreationTimestamp
    private LocalDateTime modifiedOn;
    
    
    private boolean isEnabled;

    public DTMapping(Domain domain, Technology technology) {
		super();
		this.domain = domain;
		this.technology = technology;
		this.isEnabled = true;
		this.createdBy = "Ansh";
		this.modifiedBy = null;
	}
    // Getters and setters
    public DTMapping() {}
	public Long getDtMappingId() {
        return dtMappingId;
    }

    public void setDtMappingId(Long dtMappingId) {
        this.dtMappingId = dtMappingId;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedOn() {
		return (LocalDateTime) modifiedOn;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
}
