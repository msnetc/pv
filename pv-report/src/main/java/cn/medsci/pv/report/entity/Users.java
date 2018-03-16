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
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 账号
     */
    private String name;
    /**
     * 真实姓名
     */
    private String truename;
    /**
     * 性别,1-男,2-女
     */
    private Integer sex;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 是否验证邮箱
     */
    @TableField("is_check_email")
    private Integer isCheckEmail;
    /**
     * 公司id
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 公司名称
     */
    @TableField("company_name")
    private String companyName;
    /**
     * 备注
     */
    private String notes;
    /**
     * 密码
     */
    private String password;
    /**
     * 1-正常，2-关闭
     */
    private Integer status;
    @TableField("remember_token")
    private String rememberToken;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    @TableField("deleted_at")
    private Date deletedAt;
    /**
     * 验证邮箱token
     */
    @TableField("verification_token")
    private String verificationToken;
    /**
     * 验证邮箱过期时间
     */
    @TableField("verification_token_expire")
    private Date verificationTokenExpire;
    /**
     * 用户登录的session
     */
    @TableField("last_session")
    private String lastSession;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIsCheckEmail() {
        return isCheckEmail;
    }

    public void setIsCheckEmail(Integer isCheckEmail) {
        this.isCheckEmail = isCheckEmail;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
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

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    public Date getVerificationTokenExpire() {
        return verificationTokenExpire;
    }

    public void setVerificationTokenExpire(Date verificationTokenExpire) {
        this.verificationTokenExpire = verificationTokenExpire;
    }

    public String getLastSession() {
        return lastSession;
    }

    public void setLastSession(String lastSession) {
        this.lastSession = lastSession;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Users{" +
        ", id=" + id +
        ", name=" + name +
        ", truename=" + truename +
        ", sex=" + sex +
        ", mobile=" + mobile +
        ", email=" + email +
        ", isCheckEmail=" + isCheckEmail +
        ", companyId=" + companyId +
        ", companyName=" + companyName +
        ", notes=" + notes +
        ", password=" + password +
        ", status=" + status +
        ", rememberToken=" + rememberToken +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", deletedAt=" + deletedAt +
        ", verificationToken=" + verificationToken +
        ", verificationTokenExpire=" + verificationTokenExpire +
        ", lastSession=" + lastSession +
        "}";
    }
}
