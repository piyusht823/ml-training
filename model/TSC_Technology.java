package com.team4.catalogbackend.model;
import java.sql.Time;
import org.springframework.beans.factory.annotation.Value;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
 
@Entity
public class TSC_Technology {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TSC_TechnologyId;
	private String TSC_TechnologyName;
	@Value("${groupid:0}")
	private int groupId;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;
    
    @ManyToOne
    @JoinColumn(
        name = "dtMapping_Id",
        nullable = false
    )
    private DTMapping dtmapping;

	public Long getTSC_DomainId() {
		return TSC_TechnologyId;
	}

	public void setTSC_DomainId(Long tSC_TechnologyId) {
		TSC_TechnologyId = tSC_TechnologyId;
	}

	public String getTSC_DomainName() {
		return TSC_TechnologyName;
	}

	public void setTSC_DomainName(String tSC_TechnologyName) {
		TSC_TechnologyName = tSC_TechnologyName;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

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

	public DTMapping getDtmapping() {
		return dtmapping;
	}

	public void setDtmapping(DTMapping dtmapping) {
		this.dtmapping = dtmapping;
	}

	@Override
	public String toString() {
		return "TSC_Technology [TSC_DomainId=" + TSC_TechnologyId + ", TSC_DomainName=" + TSC_TechnologyName + ", groupId="
				+ groupId + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + ", isEnabled=" + isEnabled + ", dtmapping=" + dtmapping + "]";
	}
    
    

}
