package com.AMS.amsSystem.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="DD_GRC_TEST")
public class SaveTestData {
	 @Id
     @Column (name ="TEST_ID")
     private String id;
     
     @Column (name ="OBJ_TITLE")
     private String objTitle;
     
     @Column (name = "VALID_FROM")
     private String validFrom;
     
     @Column (name ="VALID_UNTIL")
     private String validUntil;
     
     @Column (name = "OWNER_ORGANISATION")
     private String ownerOrganization;
     
     @Column (name = "OWNER")
     private String owner;
     
     @Column (name = "LEVEL_1_APPROVER")
     private String level1Approver;
     
     @Column (name = "LEVEL_2_APPROVER")
     private String level2Approver;
     
     @Column (name = "RELATIONSHIPS")
     private String relationships;
     
     @Column (name ="STATUS")
     private String status;
     
     @Column (name ="CATEGORY")
     private String category;
          
     @Column (name ="CREATED_ON")
     private String createdOn;
     
     @Column ( name ="CREATED_BY")
     private String createdBy;
     
     @Column (name ="RESPONSE_TYPE")
     private String responseType;

     @Column	(name ="MODIFIED_BY")
     private String modifiedBy;
     
     @Column (name="MODIFIED_ON")
     private Date modifiedOn;
     
     @Column (name="PROCESS_INSTANCE_ID")
     private String pId;
     
     @Column (name ="INSTANCE_ID")
     private String instanceId;
     
     @Column (name ="APPROVER")
     private String approver;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getObjTitle() {
		return objTitle;
	}

	public void setObjTitle(String objTitle) {
		this.objTitle = objTitle;
	}

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidUntil() {
		return validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}

	public String getOwnerOrganization() {
		return ownerOrganization;
	}

	public void setOwnerOrganization(String ownerOrganization) {
		this.ownerOrganization = ownerOrganization;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLevel1Approver() {
		return level1Approver;
	}

	public void setLevel1Approver(String level1Approver) {
		this.level1Approver = level1Approver;
	}

	public String getLevel2Approver() {
		return level2Approver;
	}

	public void setLevel2Approver(String level2Approver) {
		this.level2Approver = level2Approver;
	}

	public String getRelationships() {
		return relationships;
	}

	public void setRelationships(String relationships) {
		this.relationships = relationships;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public SaveTestData(String id, String objTitle, String validFrom, String validUntil, String ownerOrganization,
			String owner, String level1Approver, String level2Approver, String relationships, String status,
			String category, String createdOn, String createdBy, String responseType, String modifiedBy,
			Date modifiedOn, String pId, String instanceId, String approver) {
		super();
		this.id = id;
		this.objTitle = objTitle;
		this.validFrom = validFrom;
		this.validUntil = validUntil;
		this.ownerOrganization = ownerOrganization;
		this.owner = owner;
		this.level1Approver = level1Approver;
		this.level2Approver = level2Approver;
		this.relationships = relationships;
		this.status = status;
		this.category = category;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.responseType = responseType;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
		this.pId = pId;
		this.instanceId = instanceId;
		this.approver = approver;
	}

	public SaveTestData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
