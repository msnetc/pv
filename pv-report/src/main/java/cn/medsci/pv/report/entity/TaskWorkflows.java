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
@TableName("task_workflows")
public class TaskWorkflows extends Model<TaskWorkflows> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 报告任务id
     */
    @TableField("task_id")
    private Integer taskId;
    /**
     * 报告任务执行者id
     */
    @TableField("task_user_id")
    private Integer taskUserId;
    /**
     * 组织结构角色id
     */
    @TableField("organize_role_id")
    private Integer organizeRoleId;
    /**
     * 备注
     */
    private String desc;
    /**
     * 回退报告备注
     */
    @TableField("back_desc")
    private String backDesc;
    /**
     * 报告任务的分发时间
     */
    @TableField("assigned_at")
    private Date assignedAt;
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

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskUserId() {
        return taskUserId;
    }

    public void setTaskUserId(Integer taskUserId) {
        this.taskUserId = taskUserId;
    }

    public Integer getOrganizeRoleId() {
        return organizeRoleId;
    }

    public void setOrganizeRoleId(Integer organizeRoleId) {
        this.organizeRoleId = organizeRoleId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBackDesc() {
        return backDesc;
    }

    public void setBackDesc(String backDesc) {
        this.backDesc = backDesc;
    }

    public Date getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(Date assignedAt) {
        this.assignedAt = assignedAt;
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
        return "TaskWorkflows{" +
        ", id=" + id +
        ", taskId=" + taskId +
        ", taskUserId=" + taskUserId +
        ", organizeRoleId=" + organizeRoleId +
        ", desc=" + desc +
        ", backDesc=" + backDesc +
        ", assignedAt=" + assignedAt +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", deletedAt=" + deletedAt +
        "}";
    }
}
