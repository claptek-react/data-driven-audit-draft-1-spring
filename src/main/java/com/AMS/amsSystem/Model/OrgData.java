package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="DD_ORG")
public class OrgData {

	
	@Id
	@Column(name ="ORG_ID")
	private String id;
	
	@Column( name ="ORG_NAME")
	private String orgName;
	
	@Column(name ="ORG_LEVEL")
	private String orgLevel;
	
	@Column(name ="ORG_TITLE")
	private String orgTitle;
	
	@Column (name ="ORG_LOCATION")
	private String location;
	
	@Column (name ="START_DATE")
	private String startDate;
	
	@Column(name ="END_DATE")
	private String endDate;
	
	@Column(name ="PARENT_ORG")
	private String parentOrg;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}

	public String getOrgTitle() {
		return orgTitle;
	}

	public void setOrgTitle(String orgTitle) {
		this.orgTitle = orgTitle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getParentOrg() {
		return parentOrg;
	}

	public void setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
	}

	public OrgData(String id, String orgName, String orgLevel, String orgTitle, String location, String startDate,
			String endDate, String parentOrg) {
		super();
		this.id = id;
		this.orgName = orgName;
		this.orgLevel = orgLevel;
		this.orgTitle = orgTitle;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.parentOrg = parentOrg;
	}

	public OrgData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}