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
@TableName("send_information")
public class SendInformation extends Model<SendInformation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 质疑任务关联id
     */
    @TableField("question_id")
    private String questionId;
    /**
     * 截止时间
     */
    @TableField("end_date")
    private String endDate;
    /**
     * 状态1:邮件2:电话号码3:其他快递单号4:EMS快递
     */
    private Integer status;
    /**
     * 内容
     */
    private String content;
    /**
     * 发送次数(发送的次数)
     */
    private Integer sending;
    /**
     * 邮箱（;号隔开账号）
     */
    private String email;
    /**
     * 邮件主题
     */
    @TableField("email_theme")
    private String emailTheme;
    /**
     * 电话号码
     */
    @TableField("phone_number")
    private String phoneNumber;
    /**
     * 快递单号
     */
    private String express;
    /**
     * Ems快递单号
     */
    @TableField("ems_express")
    private String emsExpress;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    @TableField("deleted_at")
    private Date deletedAt;
    @TableField("company_id")
    private Integer companyId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSending() {
        return sending;
    }

    public void setSending(Integer sending) {
        this.sending = sending;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailTheme() {
        return emailTheme;
    }

    public void setEmailTheme(String emailTheme) {
        this.emailTheme = emailTheme;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExpress() {
        return express;
    }

    public void setExpress(String express) {
        this.express = express;
    }

    public String getEmsExpress() {
        return emsExpress;
    }

    public void setEmsExpress(String emsExpress) {
        this.emsExpress = emsExpress;
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
        return "SendInformation{" +
        ", id=" + id +
        ", questionId=" + questionId +
        ", endDate=" + endDate +
        ", status=" + status +
        ", content=" + content +
        ", sending=" + sending +
        ", email=" + email +
        ", emailTheme=" + emailTheme +
        ", phoneNumber=" + phoneNumber +
        ", express=" + express +
        ", emsExpress=" + emsExpress +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", deletedAt=" + deletedAt +
        ", companyId=" + companyId +
        "}";
    }
}
