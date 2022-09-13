package com.AMS.amsSystem.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =" DD_GRC_AUDIT_PLAN")
public class AuditPlanData {
	
	@Id
	@Column(name="PLAN_ID")
	private String id;
	
	@Column(name ="A_AUDIT_TYPE_X1")
	private String auditType;
	
	
	@Column(name ="DD_OBJECT_TYPE")
	private String objectType;
	
	
	@Column(name ="DD_PROCESS_INSTANCE_ID")
	private int processInstanceId;
	
	@Column(name ="DD_INSTANCE_ID")
	private int instanceId;
	
	@Column(name ="DD_CREATED_ON")
	private Date createdOn;
	
	@Column(name ="DD_CREATED_BY")
	private String createdBy;
	
	@Column(name ="DD_MODIFIED_ON")
	private Date modifiedOn;
	
	@Column(name ="DD_MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name ="DD_PROCESS_CODE")
	private int processCode;

	@Column(name ="DD_EDIT_FLAG")
	private String editFlag;
	

	@Column(name ="DD_STATUS_FLAG")
	private String statusFlag;
	

	@Column(name ="FORM_PID")
	private String formPid;
	

	@Column(name ="NEW_VERSION")
	private String newVersion;
	
	@Column(name ="TOTAL_BUDGETED_EFFORT")
	private int totalBudgetEfforts;
	
	
	@Column(name ="OVERVIEW")
	private String overview;
	
	@Column(name ="ADVISOR_JSONDATA")
	private String advisorJsonData;
	
	@Column(name ="ENTERPRISE_ID")
	private String enterpriceId;
	
	@Column(name ="ADVISOR_RUN_FLAG")
	private String advisorRunFlag;
	
	@Column(name ="ASSIGNED_BY")
	private String AssignedBy;
	
	@Column(name ="END_DATE")
	private Date endDate;
	
	@Column(name ="APPROVED_BY")
	private String approvedBy;
	
	@Column(name ="PLAN_TITLE")
	private String planTitle;
	
	@Column(name ="STATUS")
	private String status;
    
	@Column(name ="REVIEWER")
	private String reviewer;
	
	@Column(name ="ACCOMPLISHMENTS")
	private String accomplishments;
	
	@Column(name ="BUDGETED_EFFORT_LABEL4")
	private String budgetdEffortsLabel4;
	
	@Column(name ="BUDGETED_EFFORT_FIELD2")
	private String budgetdEffortsField2;
	
	@Column(name ="ASSIGNED_ON")
	private Date assignedOn;
	
	@Column(name ="INITIATOR_ACTION")
	private String initiatorAction;
	
	
	@Column(name ="BUDGETED_EFFORT_FIELD4")
	private String budgetEffortField4;
	
	
	@Column(name ="RISK_ADVISOR_JSON_DATA")
	private String riskAdvisorJsonData;
	
	@Column(name ="BUDGETED_EFFORT_LABEL3")
	private String budgetedEffortLabel3;
	
	
	@Column(name ="BUDGETED_EFFORT_FIELD3")
	private String budgetedEffortField;
	
	@Column(name ="PLAN_ACTION")
	private String planAction;
	
	@Column(name ="VERSION_NO")
	private String versionNo;
	
	@Column(name ="BUDGETED_EFFORT_LABEL2")
	private String budgetedEffortsLable2;
	
	@Column(name ="SIGNIFICANT_CHALLENGES")
	private String significantChallenges;
	
	@Column(name ="UPLOAD_FLAG")
	private String uploadFlag;
	
	@Column(name ="ATTACHMENTS")
	private String attachments;
	
	@Column(name ="CAN_ID")
	private String canId;
	
	@Column(name ="APPROACH")
	private String approach;
	
	@Column(name ="BUDGETED_EFFORT_FROM_AC")
	private int budgetedEffortFromAc;
	
	@Column(name ="ORG_JSONDATA")
	private String orgJsonData;
	
	@Column(name ="START_DATE")
	private Date startDate;
	
	@Column(name ="REVIEWER_FLAG")
	private int reviewerFlag;
	
	@Column(name ="USE_ASSESSMENT_FORM")
	private String useAssessmentForm;
	
	@Column(name ="PLAN_STAGE")
	private String planStage;
	
	@Column(name ="PLAN_COMMENTS")
	private String planComments;
	
	@Column(name ="APPROVED_ON")
	private Date date;
	
	@Column(name ="RESTRICT_ACCESS_TO")
	private String restrictAccessTo;
	
	@Column(name ="TMP_PLAN_ID")
	private String tmpPlanId;
	
	@Column(name ="BUDGETED_COST")
	private int budgetedCost;
	
	@Column(name ="INITIATOR")
	private String initiator;
	
	@Column(name ="PERF_CONFIG_FLAG")
	private String perfConfigFlag;
	
	@Column(name ="RISK_JSONDATA")
	private String riskJsonData;
	
	@Column(name ="BUSINESS_OVERVIEW")
	private String businessOverview;
	
	@Column(name ="PLAN_TYPE")
	private String planType;
	
	@Column(name ="ADD_SCOPE")
	private String addScope;
	
	@Column(name ="HDR_ORGANIZATION")
	private String hdrOrganization;
	
	@Column(name ="PROCESS_OVERVIEW")
	private String procesOverview;
	
	@Column(name ="ORGANIZATION_LEVEL")
	private String organizationLevel;
	
	@Column(name ="CANDIDATE_STATUS")
	private String candidateStatus;
	
	@Column(name ="BUDGETED_EFFORT_FIELD1")
	private String budgetedEffortsField1;
	
	@Column(name ="INTERNAL_PLAN_ID")
	private String InternalPlanId;
	
	@Column(name ="RTF_ATTACH")
	private String rtfAttache;
	
	@Column(name ="RSKORG_JSONDATA")
	private String rskorgJsonData;
	
	@Column(name ="ORG_AE_RISK_ADVISOR_JSON_DATA")
	private String orgAeRiskAdvisorJaonData;
	
	@Column(name ="BUDGETED_EFFORT_LABEL1")
	private String budgetedEffortLabel1;
	
	@Column(name ="AE_RISK_ADVISOR_JSON_DATA")
	private String AeRiskAdvisorJsonData;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public String getObjectType() {
		return objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}

	public int getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(int processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public int getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(int instanceId) {
		this.instanceId = instanceId;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public int getProcessCode() {
		return processCode;
	}

	public void setProcessCode(int processCode) {
		this.processCode = processCode;
	}

	public String getEditFlag() {
		return editFlag;
	}

	public void setEditFlag(String editFlag) {
		this.editFlag = editFlag;
	}

	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}

	public String getFormPid() {
		return formPid;
	}

	public void setFormPid(String formPid) {
		this.formPid = formPid;
	}

	public String getNewVersion() {
		return newVersion;
	}

	public void setNewVersion(String newVersion) {
		this.newVersion = newVersion;
	}

	public int getTotalBudgetEfforts() {
		return totalBudgetEfforts;
	}

	public void setTotalBudgetEfforts(int totalBudgetEfforts) {
		this.totalBudgetEfforts = totalBudgetEfforts;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getAdvisorJsonData() {
		return advisorJsonData;
	}

	public void setAdvisorJsonData(String advisorJsonData) {
		this.advisorJsonData = advisorJsonData;
	}

	public String getEnterpriceId() {
		return enterpriceId;
	}

	public void setEnterpriceId(String enterpriceId) {
		this.enterpriceId = enterpriceId;
	}

	public String getAdvisorRunFlag() {
		return advisorRunFlag;
	}

	public void setAdvisorRunFlag(String advisorRunFlag) {
		this.advisorRunFlag = advisorRunFlag;
	}

	public String getAssignedBy() {
		return AssignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		AssignedBy = assignedBy;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getPlanTitle() {
		return planTitle;
	}

	public void setPlanTitle(String planTitle) {
		this.planTitle = planTitle;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getAccomplishments() {
		return accomplishments;
	}

	public void setAccomplishments(String accomplishments) {
		this.accomplishments = accomplishments;
	}

	public String getBudgetdEffortsLabel4() {
		return budgetdEffortsLabel4;
	}

	public void setBudgetdEffortsLabel4(String budgetdEffortsLabel4) {
		this.budgetdEffortsLabel4 = budgetdEffortsLabel4;
	}

	public String getBudgetdEffortsField2() {
		return budgetdEffortsField2;
	}

	public void setBudgetdEffortsField2(String budgetdEffortsField2) {
		this.budgetdEffortsField2 = budgetdEffortsField2;
	}

	public Date getAssignedOn() {
		return assignedOn;
	}

	public void setAssignedOn(Date assignedOn) {
		this.assignedOn = assignedOn;
	}

	public String getInitiatorAction() {
		return initiatorAction;
	}

	public void setInitiatorAction(String initiatorAction) {
		this.initiatorAction = initiatorAction;
	}

	public String getBudgetEffortField4() {
		return budgetEffortField4;
	}

	public void setBudgetEffortField4(String budgetEffortField4) {
		this.budgetEffortField4 = budgetEffortField4;
	}

	public String getRiskAdvisorJsonData() {
		return riskAdvisorJsonData;
	}

	public void setRiskAdvisorJsonData(String riskAdvisorJsonData) {
		this.riskAdvisorJsonData = riskAdvisorJsonData;
	}

	public String getBudgetedEffortLabel3() {
		return budgetedEffortLabel3;
	}

	public void setBudgetedEffortLabel3(String budgetedEffortLabel3) {
		this.budgetedEffortLabel3 = budgetedEffortLabel3;
	}

	public String getBudgetedEffortField() {
		return budgetedEffortField;
	}

	public void setBudgetedEffortField(String budgetedEffortField) {
		this.budgetedEffortField = budgetedEffortField;
	}

	public String getPlanAction() {
		return planAction;
	}

	public void setPlanAction(String planAction) {
		this.planAction = planAction;
	}

	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getBudgetedEffortsLable2() {
		return budgetedEffortsLable2;
	}

	public void setBudgetedEffortsLable2(String budgetedEffortsLable2) {
		this.budgetedEffortsLable2 = budgetedEffortsLable2;
	}

	public String getSignificantChallenges() {
		return significantChallenges;
	}

	public void setSignificantChallenges(String significantChallenges) {
		this.significantChallenges = significantChallenges;
	}

	public String getUploadFlag() {
		return uploadFlag;
	}

	public void setUploadFlag(String uploadFlag) {
		this.uploadFlag = uploadFlag;
	}

	public String getAttachments() {
		return attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public String getCanId() {
		return canId;
	}

	public void setCanId(String canId) {
		this.canId = canId;
	}

	public String getApproach() {
		return approach;
	}

	public void setApproach(String approach) {
		this.approach = approach;
	}

	public int getBudgetedEffortFromAc() {
		return budgetedEffortFromAc;
	}

	public void setBudgetedEffortFromAc(int budgetedEffortFromAc) {
		this.budgetedEffortFromAc = budgetedEffortFromAc;
	}

	public String getOrgJsonData() {
		return orgJsonData;
	}

	public void setOrgJsonData(String orgJsonData) {
		this.orgJsonData = orgJsonData;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getReviewerFlag() {
		return reviewerFlag;
	}

	public void setReviewerFlag(int reviewerFlag) {
		this.reviewerFlag = reviewerFlag;
	}

	public String getUseAssessmentForm() {
		return useAssessmentForm;
	}

	public void setUseAssessmentForm(String useAssessmentForm) {
		this.useAssessmentForm = useAssessmentForm;
	}

	public String getPlanStage() {
		return planStage;
	}

	public void setPlanStage(String planStage) {
		this.planStage = planStage;
	}

	public String getPlanComments() {
		return planComments;
	}

	public void setPlanComments(String planComments) {
		this.planComments = planComments;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getRestrictAccessTo() {
		return restrictAccessTo;
	}

	public void setRestrictAccessTo(String restrictAccessTo) {
		this.restrictAccessTo = restrictAccessTo;
	}

	public String getTmpPlanId() {
		return tmpPlanId;
	}

	public void setTmpPlanId(String tmpPlanId) {
		this.tmpPlanId = tmpPlanId;
	}

	public int getBudgetedCost() {
		return budgetedCost;
	}

	public void setBudgetedCost(int budgetedCost) {
		this.budgetedCost = budgetedCost;
	}

	public String getInitiator() {
		return initiator;
	}

	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}

	public String getPerfConfigFlag() {
		return perfConfigFlag;
	}

	public void setPerfConfigFlag(String perfConfigFlag) {
		this.perfConfigFlag = perfConfigFlag;
	}

	public String getRiskJsonData() {
		return riskJsonData;
	}

	public void setRiskJsonData(String riskJsonData) {
		this.riskJsonData = riskJsonData;
	}

	public String getBusinessOverview() {
		return businessOverview;
	}

	public void setBusinessOverview(String businessOverview) {
		this.businessOverview = businessOverview;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public String getAddScope() {
		return addScope;
	}

	public void setAddScope(String addScope) {
		this.addScope = addScope;
	}

	public String getHdrOrganization() {
		return hdrOrganization;
	}

	public void setHdrOrganization(String hdrOrganization) {
		this.hdrOrganization = hdrOrganization;
	}

	public String getProcesOverview() {
		return procesOverview;
	}

	public void setProcesOverview(String procesOverview) {
		this.procesOverview = procesOverview;
	}

	public String getOrganizationLevel() {
		return organizationLevel;
	}

	public void setOrganizationLevel(String organizationLevel) {
		this.organizationLevel = organizationLevel;
	}

	public String getCandidateStatus() {
		return candidateStatus;
	}

	public void setCandidateStatus(String candidateStatus) {
		this.candidateStatus = candidateStatus;
	}

	public String getBudgetedEffortsField1() {
		return budgetedEffortsField1;
	}

	public void setBudgetedEffortsField1(String budgetedEffortsField1) {
		this.budgetedEffortsField1 = budgetedEffortsField1;
	}

	public String getInternalPlanId() {
		return InternalPlanId;
	}

	public void setInternalPlanId(String internalPlanId) {
		InternalPlanId = internalPlanId;
	}

	public String getRtfAttache() {
		return rtfAttache;
	}

	public void setRtfAttache(String rtfAttache) {
		this.rtfAttache = rtfAttache;
	}

	public String getRskorgJsonData() {
		return rskorgJsonData;
	}

	public void setRskorgJsonData(String rskorgJsonData) {
		this.rskorgJsonData = rskorgJsonData;
	}

	public String getOrgAeRiskAdvisorJaonData() {
		return orgAeRiskAdvisorJaonData;
	}

	public void setOrgAeRiskAdvisorJaonData(String orgAeRiskAdvisorJaonData) {
		this.orgAeRiskAdvisorJaonData = orgAeRiskAdvisorJaonData;
	}

	public String getBudgetedEffortLabel1() {
		return budgetedEffortLabel1;
	}

	public void setBudgetedEffortLabel1(String budgetedEffortLabel1) {
		this.budgetedEffortLabel1 = budgetedEffortLabel1;
	}

	public String getAeRiskAdvisorJsonData() {
		return AeRiskAdvisorJsonData;
	}

	public void setAeRiskAdvisorJsonData(String aeRiskAdvisorJsonData) {
		AeRiskAdvisorJsonData = aeRiskAdvisorJsonData;
	}

	public AuditPlanData(String id, String auditType, String objectType, int processInstanceId, int instanceId,
			Date createdOn, String createdBy, Date modifiedOn, String modifiedBy, int processCode, String editFlag,
			String statusFlag, String formPid, String newVersion, int totalBudgetEfforts, String overview,
			String advisorJsonData, String enterpriceId, String advisorRunFlag, String assignedBy, Date endDate,
			String approvedBy, String planTitle, String status, String reviewer, String accomplishments,
			String budgetdEffortsLabel4, String budgetdEffortsField2, Date assignedOn, String initiatorAction,
			String budgetEffortField4, String riskAdvisorJsonData, String budgetedEffortLabel3,
			String budgetedEffortField, String planAction, String versionNo, String budgetedEffortsLable2,
			String significantChallenges, String uploadFlag, String attachments, String canId, String approach,
			int budgetedEffortFromAc, String orgJsonData, Date startDate, int reviewerFlag, String useAssessmentForm,
			String planStage, String planComments, Date date, String restrictAccessTo, String tmpPlanId,
			int budgetedCost, String initiator, String perfConfigFlag, String riskJsonData, String businessOverview,
			String planType, String addScope, String hdrOrganization, String procesOverview, String organizationLevel,
			String candidateStatus, String budgetedEffortsField1, String internalPlanId, String rtfAttache,
			String rskorgJsonData, String orgAeRiskAdvisorJaonData, String budgetedEffortLabel1,
			String aeRiskAdvisorJsonData) {
		super();
		this.id = id;
		this.auditType = auditType;
		this.objectType = objectType;
		this.processInstanceId = processInstanceId;
		this.instanceId = instanceId;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.modifiedOn = modifiedOn;
		this.modifiedBy = modifiedBy;
		this.processCode = processCode;
		this.editFlag = editFlag;
		this.statusFlag = statusFlag;
		this.formPid = formPid;
		this.newVersion = newVersion;
		this.totalBudgetEfforts = totalBudgetEfforts;
		this.overview = overview;
		this.advisorJsonData = advisorJsonData;
		this.enterpriceId = enterpriceId;
		this.advisorRunFlag = advisorRunFlag;
		AssignedBy = assignedBy;
		this.endDate = endDate;
		this.approvedBy = approvedBy;
		this.planTitle = planTitle;
		this.status = status;
		this.reviewer = reviewer;
		this.accomplishments = accomplishments;
		this.budgetdEffortsLabel4 = budgetdEffortsLabel4;
		this.budgetdEffortsField2 = budgetdEffortsField2;
		this.assignedOn = assignedOn;
		this.initiatorAction = initiatorAction;
		this.budgetEffortField4 = budgetEffortField4;
		this.riskAdvisorJsonData = riskAdvisorJsonData;
		this.budgetedEffortLabel3 = budgetedEffortLabel3;
		this.budgetedEffortField = budgetedEffortField;
		this.planAction = planAction;
		this.versionNo = versionNo;
		this.budgetedEffortsLable2 = budgetedEffortsLable2;
		this.significantChallenges = significantChallenges;
		this.uploadFlag = uploadFlag;
		this.attachments = attachments;
		this.canId = canId;
		this.approach = approach;
		this.budgetedEffortFromAc = budgetedEffortFromAc;
		this.orgJsonData = orgJsonData;
		this.startDate = startDate;
		this.reviewerFlag = reviewerFlag;
		this.useAssessmentForm = useAssessmentForm;
		this.planStage = planStage;
		this.planComments = planComments;
		this.date = date;
		this.restrictAccessTo = restrictAccessTo;
		this.tmpPlanId = tmpPlanId;
		this.budgetedCost = budgetedCost;
		this.initiator = initiator;
		this.perfConfigFlag = perfConfigFlag;
		this.riskJsonData = riskJsonData;
		this.businessOverview = businessOverview;
		this.planType = planType;
		this.addScope = addScope;
		this.hdrOrganization = hdrOrganization;
		this.procesOverview = procesOverview;
		this.organizationLevel = organizationLevel;
		this.candidateStatus = candidateStatus;
		this.budgetedEffortsField1 = budgetedEffortsField1;
		InternalPlanId = internalPlanId;
		this.rtfAttache = rtfAttache;
		this.rskorgJsonData = rskorgJsonData;
		this.orgAeRiskAdvisorJaonData = orgAeRiskAdvisorJaonData;
		this.budgetedEffortLabel1 = budgetedEffortLabel1;
		AeRiskAdvisorJsonData = aeRiskAdvisorJsonData;
	}

	public AuditPlanData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	}
