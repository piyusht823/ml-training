package com.team4.catalogbackend.model;

	import java.sql.Time;

	import org.springframework.beans.factory.annotation.Value;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.JoinColumn;
	import jakarta.persistence.ManyToOne;

	@Entity
	public class TSC_Deliverables {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long TSC_DeliverablesId;
	    private String TSC_DeliverablesName;
		@Value("${groupid:0}")
		private int groupId; 
	    private String createdBy;
	    private Time createdOn;
	    private String modifiedBy;
	    private Time modifiedOn;
	    private boolean isEnabled;
	    

		@ManyToOne
		    @JoinColumn(name = "dtdmap_id", nullable = false)
		    private DTDMapping dtdmapping;
	    
	    
		public Long getTSC_DeliverablesId() {
			return TSC_DeliverablesId;
		}

		public void setTSC_DeliverablesId(Long tSC_DeliverablesId) {
			TSC_DeliverablesId = tSC_DeliverablesId;
		}

		public String getTSC_DeliverablesName() {
			return TSC_DeliverablesName;
		}

		public void setTSC_DeliverablesName(String tSC_DeliverablesName) {
			TSC_DeliverablesName = tSC_DeliverablesName;
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




       

	    
		 @Override
		public String toString() {
			return "TSC_Deliverables [TSC_DeliverablesId=" + TSC_DeliverablesId + ", TSC_DeliverablesName="
					+ TSC_DeliverablesName + ", groupId=" + groupId + ", createdBy=" + createdBy + ", createdOn="
					+ createdOn + ", modifiedBy=" + modifiedBy + ", modifiedOn=" + modifiedOn + ", isEnabled="
					+ isEnabled + ", ]";
		}






}
