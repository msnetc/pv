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
@TableName("report_tasks")
public class ReportTasks extends Model<ReportTasks> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 公司id
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 报告id
     */
    @TableField("report_id")
    private Integer reportId;
    /**
     * 报告编号
     */
    @TableField("report_identify")
    private String reportIdentify;
    /**
     * 获知时间
     */
    @TableField("report_first_received_date")
    private Date reportFirstReceivedDate;
    /**
     * 报告分发时间
     */
    @TableField("assigned_at")
    private Date assignedAt;
    /**
     * 药物名称
     */
    @TableField("drug_name")
    private String drugName;
    /**
     * 首要药物名称
     */
    @TableField("first_drug_name")
    private String firstDrugName;
    /**
     * 不良事件
     */
    @TableField("event_term")
    private String eventTerm;
    /**
     * 首要不良事件
     */
    @TableField("first_event_term")
    private String firstEventTerm;
    /**
     * 严重性
     */
    private String seriousness;
    /**
     * 严重性标准
     */
    @TableField("standard_of_seriousness")
    private String standardOfSeriousness;
    /**
     * 因果关系
     */
    @TableField("case_causality")
    private String caseCausality;
    /**
     * 报告分类，首次报告，随访报告
     */
    @TableField("report_cate")
    private String reportCate;
    /**
     * 处理人id
     */
    @TableField("task_user_id")
    private Integer taskUserId;
    /**
     * 处理人姓名
     */
    @TableField("task_user_name")
    private String taskUserName;
    /**
     * 任务进度，组织角色id,当前任务id
     */
    @TableField("organize_role_id")
    private Integer organizeRoleId;
    /**
     * 任务进度，组织角色名称
     */
    @TableField("organize_role_name")
    private String organizeRoleName;
    /**
     * 企业报告类型
     */
    @TableField("received_from_id")
    private String receivedFromId;
    /**
     * 1-已完成， 2-未完成
     */
    private Integer status;
    /**
     * 资料id
     */
    @TableField("source_id")
    private Integer sourceId;
    /**
     * 任务倒计时,分发时间+各个任务的倒计时
     */
    @TableField("task_countdown")
    private Date taskCountdown;
    /**
     * 报告倒计时，获悉时间+报告完成倒计时
     */
    @TableField("report_countdown")
    private Date reportCountdown;
    /**
     * 报告规则id
     */
    @TableField("regulation_id")
    private Integer regulationId;
    /**
     * 数据录入倒计时
     */
    @TableField("data_insert_countdown")
    private Integer dataInsertCountdown;
    /**
     * 数据质控QC倒计时
     */
    @TableField("data_qc_countdown")
    private Integer dataQcCountdown;
    /**
     * 医学审评倒计时
     */
    @TableField("medical_exam_countdown")
    private Integer medicalExamCountdown;
    /**
     * 医学审评QC倒计时
     */
    @TableField("medical_exam_qc_countdown")
    private Integer medicalExamQcCountdown;
    /**
     * 报告递交倒计时
     */
    @TableField("report_submit_countdown")
    private Integer reportSubmitCountdown;
    /**
     * 报告完成倒计时
     */
    @TableField("report_complete_countdown")
    private Integer reportCompleteCountdown;
    /**
     * 倒计时单位
     */
    @TableField("countdown_unit")
    private String countdownUnit;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    @TableField("deleted_at")
    private Date deletedAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReportIdentify() {
        return reportIdentify;
    }

    public void setReportIdentify(String reportIdentify) {
        this.reportIdentify = reportIdentify;
    }

    public Date getReportFirstReceivedDate() {
        return reportFirstReceivedDate;
    }

    public void setReportFirstReceivedDate(Date reportFirstReceivedDate) {
        this.reportFirstReceivedDate = reportFirstReceivedDate;
    }

    public Date getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(Date assignedAt) {
        this.assignedAt = assignedAt;
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

    public String getEventTerm() {
        return eventTerm;
    }

    public void setEventTerm(String eventTerm) {
        this.eventTerm = eventTerm;
    }

    public String getFirstEventTerm() {
        return firstEventTerm;
    }

    public void setFirstEventTerm(String firstEventTerm) {
        this.firstEventTerm = firstEventTerm;
    }

    public String getSeriousness() {
        return seriousness;
    }

    public void setSeriousness(String seriousness) {
        this.seriousness = seriousness;
    }

    public String getStandardOfSeriousness() {
        return standardOfSeriousness;
    }

    public void setStandardOfSeriousness(String standardOfSeriousness) {
        this.standardOfSeriousness = standardOfSeriousness;
    }

    public String getCaseCausality() {
        return caseCausality;
    }

    public void setCaseCausality(String caseCausality) {
        this.caseCausality = caseCausality;
    }

    public String getReportCate() {
        return reportCate;
    }

    public void setReportCate(String reportCate) {
        this.reportCate = reportCate;
    }

    public Integer getTaskUserId() {
        return taskUserId;
    }

    public void setTaskUserId(Integer taskUserId) {
        this.taskUserId = taskUserId;
    }

    public String getTaskUserName() {
        return taskUserName;
    }

    public void setTaskUserName(String taskUserName) {
        this.taskUserName = taskUserName;
    }

    public Integer getOrganizeRoleId() {
        return organizeRoleId;
    }

    public void setOrganizeRoleId(Integer organizeRoleId) {
        this.organizeRoleId = organizeRoleId;
    }

    public String getOrganizeRoleName() {
        return organizeRoleName;
    }

    public void setOrganizeRoleName(String organizeRoleName) {
        this.organizeRoleName = organizeRoleName;
    }

    public String getReceivedFromId() {
        return receivedFromId;
    }

    public void setReceivedFromId(String receivedFromId) {
        this.receivedFromId = receivedFromId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Date getTaskCountdown() {
        return taskCountdown;
    }

    public void setTaskCountdown(Date taskCountdown) {
        this.taskCountdown = taskCountdown;
    }

    public Date getReportCountdown() {
        return reportCountdown;
    }

    public void setReportCountdown(Date reportCountdown) {
        this.reportCountdown = reportCountdown;
    }

    public Integer getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(Integer regulationId) {
        this.regulationId = regulationId;
    }

    public Integer getDataInsertCountdown() {
        return dataInsertCountdown;
    }

    public void setDataInsertCountdown(Integer dataInsertCountdown) {
        this.dataInsertCountdown = dataInsertCountdown;
    }

    public Integer getDataQcCountdown() {
        return dataQcCountdown;
    }

    public void setDataQcCountdown(Integer dataQcCountdown) {
        this.dataQcCountdown = dataQcCountdown;
    }

    public Integer getMedicalExamCountdown() {
        return medicalExamCountdown;
    }

    public void setMedicalExamCountdown(Integer medicalExamCountdown) {
        this.medicalExamCountdown = medicalExamCountdown;
    }

    public Integer getMedicalExamQcCountdown() {
        return medicalExamQcCountdown;
    }

    public void setMedicalExamQcCountdown(Integer medicalExamQcCountdown) {
        this.medicalExamQcCountdown = medicalExamQcCountdown;
    }

    public Integer getReportSubmitCountdown() {
        return reportSubmitCountdown;
    }

    public void setReportSubmitCountdown(Integer reportSubmitCountdown) {
        this.reportSubmitCountdown = reportSubmitCountdown;
    }

    public Integer getReportCompleteCountdown() {
        return reportCompleteCountdown;
    }

    public void setReportCompleteCountdown(Integer reportCompleteCountdown) {
        this.reportCompleteCountdown = reportCompleteCountdown;
    }

    public String getCountdownUnit() {
        return countdownUnit;
    }

    public void setCountdownUnit(String countdownUnit) {
        this.countdownUnit = countdownUnit;
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

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ReportTasks{" +
        ", id=" + id +
        ", companyId=" + companyId +
        ", reportId=" + reportId +
        ", reportIdentify=" + reportIdentify +
        ", reportFirstReceivedDate=" + reportFirstReceivedDate +
        ", assignedAt=" + assignedAt +
        ", drugName=" + drugName +
        ", firstDrugName=" + firstDrugName +
        ", eventTerm=" + eventTerm +
        ", firstEventTerm=" + firstEventTerm +
        ", seriousness=" + seriousness +
        ", standardOfSeriousness=" + standardOfSeriousness +
        ", caseCausality=" + caseCausality +
        ", reportCate=" + reportCate +
        ", taskUserId=" + taskUserId +
        ", taskUserName=" + taskUserName +
        ", organizeRoleId=" + organizeRoleId +
        ", organizeRoleName=" + organizeRoleName +
        ", receivedFromId=" + receivedFromId +
        ", status=" + status +
        ", sourceId=" + sourceId +
        ", taskCountdown=" + taskCountdown +
        ", reportCountdown=" + reportCountdown +
        ", regulationId=" + regulationId +
        ", dataInsertCountdown=" + dataInsertCountdown +
        ", dataQcCountdown=" + dataQcCountdown +
        ", medicalExamCountdown=" + medicalExamCountdown +
        ", medicalExamQcCountdown=" + medicalExamQcCountdown +
        ", reportSubmitCountdown=" + reportSubmitCountdown +
        ", reportCompleteCountdown=" + reportCompleteCountdown +
        ", countdownUnit=" + countdownUnit +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", deletedAt=" + deletedAt +
        "}";
    }
}
