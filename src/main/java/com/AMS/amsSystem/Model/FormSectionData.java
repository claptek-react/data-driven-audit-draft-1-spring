package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DD_FORM_SECTION")
public class FormSectionData {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
	
	@Column(name ="FORM_ID")
	private String formId;
	
	@Column(name ="SECTION_ID")
	private int sectionId;
	
	@Column(name ="SEQUENCE")
	private int sequence;
	
	@Column(name ="SECTION_NAME")
	private String sectionName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public FormSectionData(String id, String formId, int sectionId, int sequence, String sectionName) {
		super();
		this.id = id;
		this.formId = formId;
		this.sectionId = sectionId;
		this.sequence = sequence;
		this.sectionName = sectionName;
	}

	public FormSectionData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
