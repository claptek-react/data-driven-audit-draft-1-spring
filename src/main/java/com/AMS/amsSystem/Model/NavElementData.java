package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DD_NAVBAR_ELEMENT")
public class NavElementData {

	
	
	@Column(name="NAV_ELEMENT")
	private String navElement;
	
	@Id
	@Column(name="NAV_ELEMENT_ID")
	private String navElementId;

	public String getNavElement() {
		return navElement;
	}

	public void setNavElement(String navElement) {
		this.navElement = navElement;
	}

	public String getNavElementId() {
		return navElementId;
	}

	public void setNavElementId(String navElementId) {
		this.navElementId = navElementId;
	}

	public NavElementData(String navElement, String navElementId) {
		super();
		this.navElement = navElement;
		this.navElementId = navElementId;
	}

	public NavElementData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
