package cn.medsci.pv.report.entity;

import java.util.Date;
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
@TableName("data_traces")
public class DataTraces extends Model<DataTraces> {

    private static final long serialVersionUID = 1L;

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
     * 报告标签页
     */
    @TableField("report_tab_id")
    private Integer reportTabId;
    /**
     * 字段
     */
    private String field;
    /**
     * 字段旧值
     */
    @TableField("old_value")
    private String oldValue;
    /**
     * 字段新值
     */
    @TableField("new_value")
    private String newValue;
    /**
     * 操作状态
     */
    @TableField("action_status")
    private String actionStatus;
    /**
     * 操作说明
     */
    @TableField("action_description")
    private String actionDescription;
    /**
     * 操作者id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 操作者id
     */
    @TableField("user_name")
    private String userName;
    /**
     * 操作人角色
     */
    @TableField("user_role")
    private String userRole;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;


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

    public Integer getReportTabId() {
        return reportTabId;
    }

    public void setReportTabId(Integer reportTabId) {
        this.reportTabId = reportTabId;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
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
        return "DataTraces{" +
        ", companyId=" + companyId +
        ", reportId=" + reportId +
        ", reportIdentify=" + reportIdentify +
        ", reportTabId=" + reportTabId +
        ", field=" + field +
        ", oldValue=" + oldValue +
        ", newValue=" + newValue +
        ", actionStatus=" + actionStatus +
        ", actionDescription=" + actionDescription +
        ", userId=" + userId +
        ", userName=" + userName +
        ", userRole=" + userRole +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
