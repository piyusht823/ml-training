package com.team4.catalogbackend.model;

import java.sql.Time;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    private String taskName;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;

//    @ManyToOne
//    @JoinColumn(name = "sub_process_id")
//    private SubProcess subProcess;

    // Getters and setters

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

//    public SubProcess getSubProcess() {
//        return subProcess;
//    }
//
//    public void setSubProcess(SubProcess subProcess) {
//        this.subProcess = subProcess;
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
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", isEnabled=" + isEnabled
				+ "]";
	}
}
