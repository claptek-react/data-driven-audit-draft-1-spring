package com.AMS.amsSystem.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="DD_CONFIG_FORM")
public class FormConfig {

	@Id
	@Column(name ="SR_NO")
	private String srNo;
	
	@Column(name ="FORM_NAME")
	private String formName;
	
	@Column(name ="FIELD_NAME")
	private String fieldName;
	
	@Column(name ="ACCESSOR")
	private String accessor;
	
	@Column(name ="FORM_ID")
	private String formId;
	
	@Column (name="COLUMN_FILTER")
	private String columnFilter;
	
	@Column (name="FILTER")
	private String filter;

	public String getSrNo() {
		return srNo;
	}

	public void setSrNo(String srNo) {
		this.srNo = srNo;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getAccessor() {
		return accessor;
	}

	public void setAccessor(String accessor) {
		this.accessor = accessor;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getColumnFilter() {
		return columnFilter;
	}

	public void setColumnFilter(String columnFilter) {
		this.columnFilter = columnFilter;
	}

	

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}
	
	

	public FormConfig(String srNo, String formName, String fieldName, String accessor, String formId,
			String columnFilter, String filter) {
		super();
		this.srNo = srNo;
		this.formName = formName;
		this.fieldName = fieldName;
		this.accessor = accessor;
		this.formId = formId;
		this.columnFilter = columnFilter;
		this.filter = filter;
	}

	public FormConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
	
	
    
	
}
