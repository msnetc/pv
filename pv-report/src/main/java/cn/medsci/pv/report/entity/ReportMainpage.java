package cn.medsci.pv.report.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
@TableName("report_mainpage")
public class ReportMainpage extends Model<ReportMainpage> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 报告规则id
     */
    @TableField("regulation_id")
    private Integer regulationId;
    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 当前版本最原始的报告id 
     */
    @TableField("first_report_id")
    private Integer firstReportId;
    /**
     * 用来判断当前报告是否是第一份原始报告 0是第一份报告；1则不是第一份报告
     */
    @TableField("is_first_report")
    private Integer isFirstReport;
    /**
     * 当前报告版本最新的id
     */
    @TableField("is_last_report")
    private Integer isLastReport;
    /**
     * 首次获悉的时间
     */
    @TableField("report_first_received_date")
    private String reportFirstReceivedDate;
    /**
     * pv获悉的时间
     */
    @TableField("report_drug_safety_date")
    private String reportDrugSafetyDate;
    /**
     * 国家id
     */
    @TableField("aecountry_id")
    private Integer aecountryId;
    /**
     * 事件发生国家
     */
    @TableField("ae_country")
    private String aeCountry;
    /**
     * 报告类型id
     */
    @TableField("received_fromid_id")
    private Integer receivedFromidId;
    /**
     * 企业报告类型
     */
    @TableField("received_from_id")
    private String receivedFromId;
    /**
     * 项目编号
     */
    @TableField("research_id")
    private String researchId;
    /**
     * 方案编号
     */
    @TableField("scheme_num")
    private String schemeNum;
    /**
     * 中心编号
     */
    @TableField("center_number")
    private String centerNumber;
    /**
     * 迟报原因
     */
    @TableField("delayed_reason")
    private String delayedReason;
    /**
     * 商品名称
     */
    @TableField("brand_name")
    private String brandName;
    /**
     * 首要商品名称
     */
    @TableField("first_brand_name")
    private String firstBrandName;
    /**
     * 药品名称
     */
    @TableField("drug_name")
    private String drugName;
    /**
     * 首要药品名称
     */
    @TableField("first_drug_name")
    private String firstDrugName;
    /**
     * 首要通用名称
     */
    @TableField("first_generic_name")
    private String firstGenericName;
    /**
     * 首要不良事件
     */
    @TableField("first_event_term")
    private String firstEventTerm;
    /**
     * 通用名称
     */
    @TableField("generic_name")
    private String genericName;
    /**
     * 不良事件
     */
    @TableField("event_term")
    private String eventTerm;
    /**
     * 不良事件发生时间 格式：2018-1-30|未知-1-30
     */
    @TableField("event_of_onset")
    private String eventOfOnset;
    /**
     * 报告编号
     */
    @TableField("report_identifier")
    private String reportIdentifier;
    /**
     * 报告为0  新建版本为父级id
     */
    @TableField("report_identifier_status")
    private Integer reportIdentifierStatus;
    /**
     * 报告类型
     */
    @TableField("report_type")
    private String reportType;
    /**
     * 报告者姓名
     */
    @TableField("reporter_name")
    private String reporterName;
    /**
     * 单位名称
     */
    @TableField("reporter_organisation")
    private String reporterOrganisation;
    /**
     * 部门名称
     */
    @TableField("reporter_department")
    private String reporterDepartment;
    /**
     * 报告者国家
     */
    @TableField("reporter_country")
    private String reporterCountry;
    /**
     * 报告者国家id
     */
    @TableField("reporter_country_id")
    private String reporterCountryId;
    /**
     * 省
     */
    @TableField("reporter_stateor_province")
    private String reporterStateorProvince;
    /**
     * 市
     */
    @TableField("reporter_city")
    private String reporterCity;
    /**
     * 邮编
     */
    @TableField("reporter_post")
    private String reporterPost;
    /**
     * 报告者电话
     */
    @TableField("reporter_telephone_number")
    private String reporterTelephoneNumber;
    /**
     * 患者姓名
     */
    @TableField("patient_name")
    private String patientName;
    /**
     * 患者编号
     */
    @TableField("subject_number")
    private String subjectNumber;
    /**
     * 出身年月日 格式:2018-1-30|未知-1-30
     */
    @TableField("date_of_birth")
    private String dateOfBirth;
    /**
     * 年龄
     */
    private String age;
    /**
     * 单位年龄 0:日;1:月;2:岁
     */
    @TableField("age_at_time_of_onset_unit")
    private String ageAtTimeOfOnsetUnit;
    /**
     * 性别 0:女;1:男0;2:未知
     */
    private String sex;
    /**
     * 电话
     */
    @TableField("patient_contact_information")
    private String patientContactInformation;
    /**
     * 文献id
     */
    @TableField("literature_published_year")
    private String literaturePublishedYear;
    /**
     * 关键词
     */
    @TableField("literature_author")
    private String literatureAuthor;
    /**
     * 期刊名
     */
    @TableField("literature_published_journals")
    private String literaturePublishedJournals;
    /**
     * 当前的状态  与角色权限所关联 2：数据录入3：数据质控qc4：医学评审5：医学审评QC6：已完成
     */
    @TableField("role_organize_status")
    private Integer roleOrganizeStatus;
    /**
     * 文献标题
     */
    @TableField("literature_title")
    private String literatureTitle;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    /**
     * 开始时间
     */
    @TableField("time_begin")
    private String timeBegin;
    /**
     * 报告严重性 1:死亡2:严重3:一般4:其他
     */
    private String severity;
    /**
     * 公司id
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 逻辑删除 1：显示 2：不显示
     */
    @TableField("delete_status")
    private Integer deleteStatus;
    /**
     * 结束时间
     */
    @TableField("time_end")
    private String timeEnd;
    /**
     * 创建新版本的原因  进稽查管理
     */
    @TableField("create_version_cause")
    private String createVersionCause;
    /**
     * 原始资料的id
     */
    @TableField("source_id")
    private Integer sourceId;
    /**
     * 是否严重 1:是 2:否
     */
    private Integer seriousness;
    /**
     * 1待上报2上报中3无需上报4上报成功5上报失败
     */
    @TableField("reported_status")
    private Integer reportedStatus;
    /**
     * 国家ADR编码
     */
    @TableField("adr_code")
    private String adrCode;
    /**
     * 上报时间
     */
    @TableField("reported_date")
    private Date reportedDate;
    /**
     * 1：ADR样式 2:AE样式
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(Integer regulationId) {
        this.regulationId = regulationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFirstReportId() {
        return firstReportId;
    }

    public void setFirstReportId(Integer firstReportId) {
        this.firstReportId = firstReportId;
    }

    public Integer getIsFirstReport() {
        return isFirstReport;
    }

    public void setIsFirstReport(Integer isFirstReport) {
        this.isFirstReport = isFirstReport;
    }

    public Integer getIsLastReport() {
        return isLastReport;
    }

    public void setIsLastReport(Integer isLastReport) {
        this.isLastReport = isLastReport;
    }

    public String getReportFirstReceivedDate() {
        return reportFirstReceivedDate;
    }

    public void setReportFirstReceivedDate(String reportFirstReceivedDate) {
        this.reportFirstReceivedDate = reportFirstReceivedDate;
    }

    public String getReportDrugSafetyDate() {
        return reportDrugSafetyDate;
    }

    public void setReportDrugSafetyDate(String reportDrugSafetyDate) {
        this.reportDrugSafetyDate = reportDrugSafetyDate;
    }

    public Integer getAecountryId() {
        return aecountryId;
    }

    public void setAecountryId(Integer aecountryId) {
        this.aecountryId = aecountryId;
    }

    public String getAeCountry() {
        return aeCountry;
    }

    public void setAeCountry(String aeCountry) {
        this.aeCountry = aeCountry;
    }

    public Integer getReceivedFromidId() {
        return receivedFromidId;
    }

    public void setReceivedFromidId(Integer receivedFromidId) {
        this.receivedFromidId = receivedFromidId;
    }

    public String getReceivedFromId() {
        return receivedFromId;
    }

    public void setReceivedFromId(String receivedFromId) {
        this.receivedFromId = receivedFromId;
    }

    public String getResearchId() {
        return researchId;
    }

    public void setResearchId(String researchId) {
        this.researchId = researchId;
    }

    public String getSchemeNum() {
        return schemeNum;
    }

    public void setSchemeNum(String schemeNum) {
        this.schemeNum = schemeNum;
    }

    public String getCenterNumber() {
        return centerNumber;
    }

    public void setCenterNumber(String centerNumber) {
        this.centerNumber = centerNumber;
    }

    public String getDelayedReason() {
        return delayedReason;
    }

    public void setDelayedReason(String delayedReason) {
        this.delayedReason = delayedReason;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFirstBrandName() {
        return firstBrandName;
    }

    public void setFirstBrandName(String firstBrandName) {
        this.firstBrandName = firstBrandName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getFirstDrugName() {
        return firstDrugName;
    }

    public void setFirstDrugName(String firstDrugName) {
        this.firstDrugName = firstDrugName;
    }

    public String getFirstGenericName() {
        return firstGenericName;
    }

    public void setFirstGenericName(String firstGenericName) {
        this.firstGenericName = firstGenericName;
    }

    public String getFirstEventTerm() {
        return firstEventTerm;
    }

    public void setFirstEventTerm(String firstEventTerm) {
        this.firstEventTerm = firstEventTerm;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getEventTerm() {
        return eventTerm;
    }

    public void setEventTerm(String eventTerm) {
        this.eventTerm = eventTerm;
    }

    public String getEventOfOnset() {
        return eventOfOnset;
    }

    public void setEventOfOnset(String eventOfOnset) {
        this.eventOfOnset = eventOfOnset;
    }

    public String getReportIdentifier() {
        return reportIdentifier;
    }

    public void setReportIdentifier(String reportIdentifier) {
        this.reportIdentifier = reportIdentifier;
    }

    public Integer getReportIdentifierStatus() {
        return reportIdentifierStatus;
    }

    public void setReportIdentifierStatus(Integer reportIdentifierStatus) {
        this.reportIdentifierStatus = reportIdentifierStatus;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReporterOrganisation() {
        return reporterOrganisation;
    }

    public void setReporterOrganisation(String reporterOrganisation) {
        this.reporterOrganisation = reporterOrganisation;
    }

    public String getReporterDepartment() {
        return reporterDepartment;
    }

    public void setReporterDepartment(String reporterDepartment) {
        this.reporterDepartment = reporterDepartment;
    }

    public String getReporterCountry() {
        return reporterCountry;
    }

    public void setReporterCountry(String reporterCountry) {
        this.reporterCountry = reporterCountry;
    }

    public String getReporterCountryId() {
        return reporterCountryId;
    }

    public void setReporterCountryId(String reporterCountryId) {
        this.reporterCountryId = reporterCountryId;
    }

    public String getReporterStateorProvince() {
        return reporterStateorProvince;
    }

    public void setReporterStateorProvince(String reporterStateorProvince) {
        this.reporterStateorProvince = reporterStateorProvince;
    }

    public String getReporterCity() {
        return reporterCity;
    }

    public void setReporterCity(String reporterCity) {
        this.reporterCity = reporterCity;
    }

    public String getReporterPost() {
        return reporterPost;
    }

    public void setReporterPost(String reporterPost) {
        this.reporterPost = reporterPost;
    }

    public String getReporterTelephoneNumber() {
        return reporterTelephoneNumber;
    }

    public void setReporterTelephoneNumber(String reporterTelephoneNumber) {
        this.reporterTelephoneNumber = reporterTelephoneNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAgeAtTimeOfOnsetUnit() {
        return ageAtTimeOfOnsetUnit;
    }

    public void setAgeAtTimeOfOnsetUnit(String ageAtTimeOfOnsetUnit) {
        this.ageAtTimeOfOnsetUnit = ageAtTimeOfOnsetUnit;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPatientContactInformation() {
        return patientContactInformation;
    }

    public void setPatientContactInformation(String patientContactInformation) {
        this.patientContactInformation = patientContactInformation;
    }

    public String getLiteraturePublishedYear() {
        return literaturePublishedYear;
    }

    public void setLiteraturePublishedYear(String literaturePublishedYear) {
        this.literaturePublishedYear = literaturePublishedYear;
    }

    public String getLiteratureAuthor() {
        return literatureAuthor;
    }

    public void setLiteratureAuthor(String literatureAuthor) {
        this.literatureAuthor = literatureAuthor;
    }

    public String getLiteraturePublishedJournals() {
        return literaturePublishedJournals;
    }

    public void setLiteraturePublishedJournals(String literaturePublishedJournals) {
        this.literaturePublishedJournals = literaturePublishedJournals;
    }

    public Integer getRoleOrganizeStatus() {
        return roleOrganizeStatus;
    }

    public void setRoleOrganizeStatus(Integer roleOrganizeStatus) {
        this.roleOrganizeStatus = roleOrganizeStatus;
    }

    public String getLiteratureTitle() {
        return literatureTitle;
    }

    public void setLiteratureTitle(String literatureTitle) {
        this.literatureTitle = literatureTitle;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getCreateVersionCause() {
        return createVersionCause;
    }

    public void setCreateVersionCause(String createVersionCause) {
        this.createVersionCause = createVersionCause;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getSeriousness() {
        return seriousness;
    }

    public void setSeriousness(Integer seriousness) {
        this.seriousness = seriousness;
    }

    public Integer getReportedStatus() {
        return reportedStatus;
    }

    public void setReportedStatus(Integer reportedStatus) {
        this.reportedStatus = reportedStatus;
    }

    public String getAdrCode() {
        return adrCode;
    }

    public void setAdrCode(String adrCode) {
        this.adrCode = adrCode;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ReportMainpage{" +
        ", id=" + id +
        ", regulationId=" + regulationId +
        ", userId=" + userId +
        ", firstReportId=" + firstReportId +
        ", isFirstReport=" + isFirstReport +
        ", isLastReport=" + isLastReport +
        ", reportFirstReceivedDate=" + reportFirstReceivedDate +
        ", reportDrugSafetyDate=" + reportDrugSafetyDate +
        ", aecountryId=" + aecountryId +
        ", aeCountry=" + aeCountry +
        ", receivedFromidId=" + receivedFromidId +
        ", receivedFromId=" + receivedFromId +
        ", researchId=" + researchId +
        ", schemeNum=" + schemeNum +
        ", centerNumber=" + centerNumber +
        ", delayedReason=" + delayedReason +
        ", brandName=" + brandName +
        ", firstBrandName=" + firstBrandName +
        ", drugName=" + drugName +
        ", firstDrugName=" + firstDrugName +
        ", firstGenericName=" + firstGenericName +
        ", firstEventTerm=" + firstEventTerm +
        ", genericName=" + genericName +
        ", eventTerm=" + eventTerm +
        ", eventOfOnset=" + eventOfOnset +
        ", reportIdentifier=" + reportIdentifier +
        ", reportIdentifierStatus=" + reportIdentifierStatus +
        ", reportType=" + reportType +
        ", reporterName=" + reporterName +
        ", reporterOrganisation=" + reporterOrganisation +
        ", reporterDepartment=" + reporterDepartment +
        ", reporterCountry=" + reporterCountry +
        ", reporterCountryId=" + reporterCountryId +
        ", reporterStateorProvince=" + reporterStateorProvince +
        ", reporterCity=" + reporterCity +
        ", reporterPost=" + reporterPost +
        ", reporterTelephoneNumber=" + reporterTelephoneNumber +
        ", patientName=" + patientName +
        ", subjectNumber=" + subjectNumber +
        ", dateOfBirth=" + dateOfBirth +
        ", age=" + age +
        ", ageAtTimeOfOnsetUnit=" + ageAtTimeOfOnsetUnit +
        ", sex=" + sex +
        ", patientContactInformation=" + patientContactInformation +
        ", literaturePublishedYear=" + literaturePublishedYear +
        ", literatureAuthor=" + literatureAuthor +
        ", literaturePublishedJournals=" + literaturePublishedJournals +
        ", roleOrganizeStatus=" + roleOrganizeStatus +
        ", literatureTitle=" + literatureTitle +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", timeBegin=" + timeBegin +
        ", severity=" + severity +
        ", companyId=" + companyId +
        ", deleteStatus=" + deleteStatus +
        ", timeEnd=" + timeEnd +
        ", createVersionCause=" + createVersionCause +
        ", sourceId=" + sourceId +
        ", seriousness=" + seriousness +
        ", reportedStatus=" + reportedStatus +
        ", adrCode=" + adrCode +
        ", reportedDate=" + reportedDate +
        ", type=" + type +
        "}";
    }
}
