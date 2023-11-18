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
public class TSC_Domain {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long TSC_DomainId;
	private String TSC_DomainName;
	@Value("${groupid:0}")
	private int groupId;
    private String createdBy;
    private Time createdOn;
    private String modifiedBy;
    private Time modifiedOn;
    private boolean isEnabled;
    
    @ManyToOne
    @JoinColumn(
        name = "domain_Id",
        nullable = false
    )
    private Domain domain;
    
    
    public Long getTSC_DomainId() {
		return TSC_DomainId;
	}
	public void setTSC_DomainId(Long tSC_DomainId) {
		TSC_DomainId = tSC_DomainId;
	}
	public String getTSC_DomainName() {
		return TSC_DomainName;
	}
	public void setTSC_DomainName(String tSC_DomainName) {
		TSC_DomainName = tSC_DomainName;
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
 
 
	 @Override
		public String toString() {
			return "TSC_Domain [TSC_DomainId=" + TSC_DomainId + ", TSC_DomainName=" + TSC_DomainName + ", createdBy="
					+ createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy + ", isEnabled=" + isEnabled
					+ "]";
		}
 
 
 
}
 
