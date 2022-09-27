package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "DD_DASHBOARD")
public class DashboardData {
	
	@Id	
	@Column(name="ID")
	private String id;
	
	@Column(name="LABLES")
	private String lables;
	
	@Column(name="INDEX_AXIX")
	private String indexAxis;
	
	@Column(name="TITLE_DISPLAY")
	private String titleDisplay;
	
	@Column(name="TITLE_TEXT")
	private String titleText;
	
	@Column(name="LEGEND_DISPLAY")
	private String legendDisplay;
	
	@Column(name="BACKGROUND")
	private String background;

	@Column(name="LEGEND_POS")
	private String legendPos;
	
	@Column(name="LEGEND_ALIGN")
	private String legendAlign;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLables() {
		return lables;
	}

	public void setLables(String lables) {
		this.lables = lables;
	}

	public String getIndexAxis() {
		return indexAxis;
	}

	public void setIndexAxis(String indexAxis) {
		this.indexAxis = indexAxis;
	}

	public String getTitleDisplay() {
		return titleDisplay;
	}

	public void setTitleDisplay(String titleDisplay) {
		this.titleDisplay = titleDisplay;
	}

	public String getTitleText() {
		return titleText;
	}

	public void setTitleText(String titleText) {
		this.titleText = titleText;
	}

	public String getLegendDisplay() {
		return legendDisplay;
	}

	public void setLegendDisplay(String legendDisplay) {
		this.legendDisplay = legendDisplay;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getLegendPos() {
		return legendPos;
	}

	public void setLegendPos(String legendPos) {
		this.legendPos = legendPos;
	}

	public String getLegendAlign() {
		return legendAlign;
	}

	public void setLegendAlign(String legendAlign) {
		this.legendAlign = legendAlign;
	}

	public DashboardData(String id, String lables, String indexAxis, String titleDisplay, String titleText,
			String legendDisplay, String background, String legendPos, String legendAlign) {
		super();
		this.id = id;
		this.lables = lables;
		this.indexAxis = indexAxis;
		this.titleDisplay = titleDisplay;
		this.titleText = titleText;
		this.legendDisplay = legendDisplay;
		this.background = background;
		this.legendPos = legendPos;
		this.legendAlign = legendAlign;
	}

	public DashboardData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
