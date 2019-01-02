package com.springjpa.model;

import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="report_designer")
public class ReportBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "service_id")
	private Long serviceId;
	
	@Column(name = "department_id")
	private Long departmentId;
	
	@Column(name = "version_no")
	private Long versionNo;
	
	@Column(name = "filter")
	private String filter;
	
	@Column(name = "having_column")
	private String having;
	
	@Column(name = "background_text")
	private String backgroundText;
	
	@Column(name = "table_format")
	private String tableFormat;
	
	@Column(name = "table_color")
	private String tableColor;
	
	@Column(name = "tooltip")
	private String tooltip;
	
	@Column(name = "header_image_id")
	private String headerImageId;
	
	@Column(name = "footer_image_id")
	private String footerImageId;
	
	@Column(name = "report_header")
	private String reportHeader;
	
	@Column(name = "report_footer")
	private String reportFooter;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "designation_id")
	private Long designationId;
	
	@Column(name = "grouping")
	private String grouping;
	
	@Column(name = "where_condition")
	private String whereCondition;
	
	@Column(name = "sub_query")
	private String subQuery;
	
	@Column(name = "final_query")
	private String finalQuery;
	
	@Column(name = "report_name")
	private String reportName;
	/*private String report_id;*/
	@Column(name = "selectedColmn")
	private HashMap<String, String> selectedColmn;
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public Long getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(Long versionNo) {
		this.versionNo = versionNo;
	}
	public String getFilter() {
		return filter;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public String getHaving() {
		return having;
	}
	public void setHaving(String having) {
		this.having = having;
	}
	public String getBackgroundText() {
		return backgroundText;
	}
	public void setBackgroundText(String backgroundText) {
		this.backgroundText = backgroundText;
	}
	public String getTableFormat() {
		return tableFormat;
	}
	public void setTableFormat(String tableFormat) {
		this.tableFormat = tableFormat;
	}
	public String getTableColor() {
		return tableColor;
	}
	public void setTableColor(String tableColor) {
		this.tableColor = tableColor;
	}
	public String getTooltip() {
		return tooltip;
	}
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	public String getHeaderImageId() {
		return headerImageId;
	}
	public void setHeaderImageId(String headerImageId) {
		this.headerImageId = headerImageId;
	}
	public String getFooterImageId() {
		return footerImageId;
	}
	public void setFooterImageId(String footerImageId) {
		this.footerImageId = footerImageId;
	}
	public String getReportHeader() {
		return reportHeader;
	}
	public void setReportHeader(String reportHeader) {
		this.reportHeader = reportHeader;
	}
	public String getReportFooter() {
		return reportFooter;
	}
	public void setReportFooter(String reportFooter) {
		this.reportFooter = reportFooter;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Long getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Long designationId) {
		this.designationId = designationId;
	}
	public String getGrouping() {
		return grouping;
	}
	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}
	public String getWhereCondition() {
		return whereCondition;
	}
	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}
	public String getSubQuery() {
		return subQuery;
	}
	public void setSubQuery(String subQuery) {
		this.subQuery = subQuery;
	}
	public String getFinalQuery() {
		return finalQuery;
	}
	public void setFinalQuery(String finalQuery) {
		this.finalQuery = finalQuery;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public HashMap<String, String> getSelectedColmn() {
		return selectedColmn;
	}
	public void setSelectedColmn(HashMap<String, String> selectedColmn) {
		this.selectedColmn = selectedColmn;
	}
	@Override
	public String toString() {
		return "ReportBean [serviceId=" + serviceId + ", departmentId=" + departmentId + ", versionNo=" + versionNo
				+ ", filter=" + filter + ", having=" + having + ", backgroundText=" + backgroundText + ", tableFormat="
				+ tableFormat + ", tableColor=" + tableColor + ", tooltip=" + tooltip + ", headerImageId="
				+ headerImageId + ", footerImageId=" + footerImageId + ", reportHeader=" + reportHeader
				+ ", reportFooter=" + reportFooter + ", userId=" + userId + ", designationId=" + designationId
				+ ", grouping=" + grouping + ", whereCondition=" + whereCondition + ", subQuery=" + subQuery
				+ ", finalQuery=" + finalQuery + ", reportName=" + reportName + ", selectedColmn=" + selectedColmn
				+ "]";
	}
	
	
}