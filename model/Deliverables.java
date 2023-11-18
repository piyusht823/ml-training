package com.team4.catalogbackend.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

@Entity
public class Deliverables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliverablesId;

    private String deliverablesName;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

//    @ManyToOne
//    @JoinColumn(name = "technology_id")
//    private Technology technology;
//
//    @OneToMany(mappedBy = "deliverables")
//    private List<Process> processes;

    // Getters and setters

    public Long getDeliverablesId() {
        return deliverablesId;
    }

    public void setDeliverablesId(Long deliverablesId) {
        this.deliverablesId = deliverablesId;
    }

    public String getDeliverablesName() {
        return deliverablesName;
    }

    public void setDeliverablesName(String deliverablesName) {
        this.deliverablesName = deliverablesName;
    }

//    public Technology getTechnology() {
//        return technology;
//    }
//
//    public void setTechnology(Technology technology) {
//        this.technology = technology;
//    }
//
//    public List<Process> getProcesses() {
//        return processes;
//    }
//
//    public void setProcesses(List<Process> processes) {
//        this.processes = processes;
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
		return "Deliverables [deliverablesId=" + deliverablesId + ", deliverablesName=" + deliverablesName
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + ", isEnabled=" + isEnabled + "]";
	}
}
