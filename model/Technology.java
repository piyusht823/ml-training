package com.team4.catalogbackend.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long technologyId;

    private String technologyName;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

//    @ManyToOne
//    @JoinColumn(name = "domain_id")
//    private Domain domain;
//
//    @OneToMany(mappedBy = "technology")
//    private List<Deliverables> deliverables;

    // Getters and setters

    public Long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
        this.technologyId = technologyId;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

//    public Domain getDomain() {
//        return domain;
//    }
//
//    public void setDomain(Domain domain) {
//        this.domain = domain;
//    }
//
//    public List<Deliverables> getDeliverables() {
//        return deliverables;
//    }
//
//    public void setDeliverables(List<Deliverables> deliverables) {
//        this.deliverables = deliverables;
//    }

    public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Time getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Time createdOn) {
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
		return "Technology [technologyId=" + technologyId + ", technologyName=" + technologyName + ", createdBy="
				+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn
				+ ", isEnabled=" + isEnabled + "]";
	}
}
