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
public class Question extends Model<Question> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 质疑编号
     */
    @TableField("question_num")
    private String questionNum;
    /**
     * 报告编号
     */
    @TableField("report_num")
    private String reportNum;
    /**
     * 操作人的id 关键用户表
     */
    @TableField("operation_userId")
    private Integer operationUserid;
    /**
     * 操作人
     */
    @TableField("operation_name")
    private String operationName;
    /**
     * 操作人id 当前质疑所属人的
     */
    @TableField("operation_id")
    private Integer operationId;
    /**
     * 状态   1：已关闭 2：已发送 3：进行中
     */
    private Integer status;
    /**
     * 操作日期
     */
    @TableField("operation_date")
    private String operationDate;
    /**
     * 内容
     */
    private String content;
    /**
     * 截止日期
     */
    @TableField("end_date")
    private String endDate;
    /**
     * 发送次数
     */
    private String sending;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 质疑编号的父级id 首次质疑编号为0
     */
    @TableField("question_parent")
    private Integer questionParent;
    @TableField("company_id")
    private Integer companyId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(String questionNum) {
        this.questionNum = questionNum;
    }

    public String getReportNum() {
        return reportNum;
    }

    public void setReportNum(String reportNum) {
        this.reportNum = reportNum;
    }

    public Integer getOperationUserid() {
        return operationUserid;
    }

    public void setOperationUserid(Integer operationUserid) {
        this.operationUserid = operationUserid;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSending() {
        return sending;
    }

    public void setSending(String sending) {
        this.sending = sending;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getQuestionParent() {
        return questionParent;
    }

    public void setQuestionParent(Integer questionParent) {
        this.questionParent = questionParent;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Question{" +
        ", id=" + id +
        ", questionNum=" + questionNum +
        ", reportNum=" + reportNum +
        ", operationUserid=" + operationUserid +
        ", operationName=" + operationName +
        ", operationId=" + operationId +
        ", status=" + status +
        ", operationDate=" + operationDate +
        ", content=" + content +
        ", endDate=" + endDate +
        ", sending=" + sending +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", sort=" + sort +
        ", questionParent=" + questionParent +
        ", companyId=" + companyId +
        "}";
    }
}
