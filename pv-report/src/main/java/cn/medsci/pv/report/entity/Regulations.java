package cn.medsci.pv.report.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
public class Regulations extends Model<Regulations> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 所属公司
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 规则名称
     */
    private String title;
    /**
     * 严重性
     */
    private String severity;
    /**
     * 优先级
     */
    private Integer priority;
    /**
     * 报告完成时间
     */
    @TableField("finished_date")
    private Integer finishedDate;
    /**
     * 数据录入
     */
    @TableField("data_insert")
    private Integer dataInsert;
    /**
     * 数据质控
     */
    @TableField("data_qc")
    private Integer dataQc;
    /**
     * 医学评审
     */
    @TableField("medical_exam")
    private Integer medicalExam;
    /**
     * 报告医学审批QC
     */
    @TableField("medical_exam_qc")
    private Integer medicalExamQc;
    /**
     * 报告递交
     */
    @TableField("report_submit")
    private Integer reportSubmit;
    /**
     * 1正常2删除
     */
    private Integer status;
    /**
     * 原始资料Id
     */
    @TableField("source_id")
    private Integer sourceId;
    /**
     * d天h小时
     */
    private String unit;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;


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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Integer finishedDate) {
        this.finishedDate = finishedDate;
    }

    public Integer getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(Integer dataInsert) {
        this.dataInsert = dataInsert;
    }

    public Integer getDataQc() {
        return dataQc;
    }

    public void setDataQc(Integer dataQc) {
        this.dataQc = dataQc;
    }

    public Integer getMedicalExam() {
        return medicalExam;
    }

    public void setMedicalExam(Integer medicalExam) {
        this.medicalExam = medicalExam;
    }

    public Integer getMedicalExamQc() {
        return medicalExamQc;
    }

    public void setMedicalExamQc(Integer medicalExamQc) {
        this.medicalExamQc = medicalExamQc;
    }

    public Integer getReportSubmit() {
        return reportSubmit;
    }

    public void setReportSubmit(Integer reportSubmit) {
        this.reportSubmit = reportSubmit;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Regulations{" +
        ", id=" + id +
        ", companyId=" + companyId +
        ", title=" + title +
        ", severity=" + severity +
        ", priority=" + priority +
        ", finishedDate=" + finishedDate +
        ", dataInsert=" + dataInsert +
        ", dataQc=" + dataQc +
        ", medicalExam=" + medicalExam +
        ", medicalExamQc=" + medicalExamQc +
        ", reportSubmit=" + reportSubmit +
        ", status=" + status +
        ", sourceId=" + sourceId +
        ", unit=" + unit +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
