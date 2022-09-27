package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DD_NAVBAR_ELEMENT")

public class NavElementData {

	@Id
	@Column(name="NAV_ELEMENT_ID")
	private String navElementId;
	
	@Column(name="NAV_ELEMENT")
	private String navElement;
	
	@Column(name="ISDROPDOWN")
	private String isDropDown;

	@Column(name="NAVIGATE")
	private String navigate;

	public String getNavElementId() {
		return navElementId;
	}

	public void setNavElementId(String navElementId) {
		this.navElementId = navElementId;
	}

	public String getNavElement() {
		return navElement;
	}

	public void setNavElement(String navElement) {
		this.navElement = navElement;
	}

	public String getIsDropDown() {
		return isDropDown;
	}

	public void setIsDropDown(String isDropDown) {
		this.isDropDown = isDropDown;
	}

	public String getNavigate() {
		return navigate;
	}

	public void setNavigate(String navigate) {
		this.navigate = navigate;
	}

	public NavElementData(String navElementId, String navElement, String isDropDown, String navigate) {
		super();
		this.navElementId = navElementId;
		this.navElement = navElement;
		this.isDropDown = isDropDown;
		this.navigate = navigate;
	}

	public NavElementData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
