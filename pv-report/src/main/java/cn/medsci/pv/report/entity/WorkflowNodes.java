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
@TableName("workflow_nodes")
public class WorkflowNodes extends Model<WorkflowNodes> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 单位id
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 工作流id
     */
    @TableField("workflow_id")
    private Integer workflowId;
    /**
     * 工作流节点名称
     */
    private String name;
    /**
     * 工作流节点英文名称
     */
    @TableField("en_name")
    private String enName;
    /**
     * 1-短信通知, 2-短信不通知
     */
    @TableField("is_message_notice")
    private Integer isMessageNotice;
    /**
     * 1-邮件通知, 2-邮件不通知
     */
    @TableField("is_email_notice")
    private Integer isEmailNotice;
    /**
     * 组织结构角色id
     */
    @TableField("organize_role_id")
    private Integer organizeRoleId;
    /**
     * 角色id
     */
    @TableField("role_id")
    private Integer roleId;
    /**
     * 规则
     */
    private String rule;
    /**
     * 描述
     */
    private String description;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    private Integer sort;


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

    public Integer getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getIsMessageNotice() {
        return isMessageNotice;
    }

    public void setIsMessageNotice(Integer isMessageNotice) {
        this.isMessageNotice = isMessageNotice;
    }

    public Integer getIsEmailNotice() {
        return isEmailNotice;
    }

    public void setIsEmailNotice(Integer isEmailNotice) {
        this.isEmailNotice = isEmailNotice;
    }

    public Integer getOrganizeRoleId() {
        return organizeRoleId;
    }

    public void setOrganizeRoleId(Integer organizeRoleId) {
        this.organizeRoleId = organizeRoleId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WorkflowNodes{" +
        ", id=" + id +
        ", companyId=" + companyId +
        ", workflowId=" + workflowId +
        ", name=" + name +
        ", enName=" + enName +
        ", isMessageNotice=" + isMessageNotice +
        ", isEmailNotice=" + isEmailNotice +
        ", organizeRoleId=" + organizeRoleId +
        ", roleId=" + roleId +
        ", rule=" + rule +
        ", description=" + description +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", sort=" + sort +
        "}";
    }
}
