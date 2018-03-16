package cn.medsci.pv.report.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 原始资料
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
public class Source extends Model<Source> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 公司ID
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 接受报告时间
     */
    @TableField("accept_report_date")
    private Date acceptReportDate;
    /**
     * 研究方案编号
     */
    @TableField("solution_number")
    private String solutionNumber;
    /**
     * 文件分类
     */
    @TableField("file_class")
    private String fileClass;
    /**
     * 分类
     */
    @TableField("category_id")
    private String categoryId;
    /**
     * 文件来源
     */
    @TableField("file_source")
    private String fileSource;
    /**
     * 备注
     */
    private String remark;
    /**
     * 报告编号
     */
    @TableField("report_number")
    private String reportNumber;
    /**
     * 1未分发2已分发
     */
    private Integer issue;
    /**
     * 1正常2删除
     */
    private Integer status;
    @TableField("creator_uuid")
    private Integer creatorUuid;
    @TableField("creator_name")
    private String creatorName;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    private String severity;


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

    public Date getAcceptReportDate() {
        return acceptReportDate;
    }

    public void setAcceptReportDate(Date acceptReportDate) {
        this.acceptReportDate = acceptReportDate;
    }

    public String getSolutionNumber() {
        return solutionNumber;
    }

    public void setSolutionNumber(String solutionNumber) {
        this.solutionNumber = solutionNumber;
    }

    public String getFileClass() {
        return fileClass;
    }

    public void setFileClass(String fileClass) {
        this.fileClass = fileClass;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getFileSource() {
        return fileSource;
    }

    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatorUuid() {
        return creatorUuid;
    }

    public void setCreatorUuid(Integer creatorUuid) {
        this.creatorUuid = creatorUuid;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
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

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Source{" +
        ", id=" + id +
        ", companyId=" + companyId +
        ", acceptReportDate=" + acceptReportDate +
        ", solutionNumber=" + solutionNumber +
        ", fileClass=" + fileClass +
        ", categoryId=" + categoryId +
        ", fileSource=" + fileSource +
        ", remark=" + remark +
        ", reportNumber=" + reportNumber +
        ", issue=" + issue +
        ", status=" + status +
        ", creatorUuid=" + creatorUuid +
        ", creatorName=" + creatorName +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", severity=" + severity +
        "}";
    }
}
