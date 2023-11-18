package com.team4.catalogbackend.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long domainId;

    private String domainName;
    private String createdBy;
    private String createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

//    @OneToMany(mappedBy = "domain")
//    private List<Technology> technologies;

    // Getters and setters

    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

//    public List<Technology> getTechnologies() {
//        return technologies;
//    }
//
//    public void setTechnologies(List<Technology> technologies) {
//        this.technologies = technologies;
//    }

    
    public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Time getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Time modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Override
	public String toString() {
		return "Domain [domainId=" + domainId + ", domainName=" + domainName + ", createdBy=" + createdBy
				+ ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", isEnabled=" + isEnabled + "]";
	}
}
