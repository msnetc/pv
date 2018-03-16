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
public class Mail extends Model<Mail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 邮件服务类型 0:POP3;1:IMTP
     */
    @TableField("service_type")
    private Integer serviceType;
    /**
     * 邮件账号
     */
    @TableField("mail_account")
    private String mailAccount;
    /**
     * 邮件密码
     */
    @TableField("mail_password")
    private String mailPassword;
    /**
     * 公司id
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 服务器信息
     */
    private String server;
    /**
     * 服务器端口
     */
    private String port;
    /**
     * ssl加密0:开启;1:关闭
     */
    @TableField("ssl_crypt")
    private Integer sslCrypt;
    /**
     * 启用状态0:开启;1:关闭
     */
    private String status;
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

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public String getMailAccount() {
        return mailAccount;
    }

    public void setMailAccount(String mailAccount) {
        this.mailAccount = mailAccount;
    }

    public String getMailPassword() {
        return mailPassword;
    }

    public void setMailPassword(String mailPassword) {
        this.mailPassword = mailPassword;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Integer getSslCrypt() {
        return sslCrypt;
    }

    public void setSslCrypt(Integer sslCrypt) {
        this.sslCrypt = sslCrypt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "Mail{" +
        ", id=" + id +
        ", serviceType=" + serviceType +
        ", mailAccount=" + mailAccount +
        ", mailPassword=" + mailPassword +
        ", companyId=" + companyId +
        ", server=" + server +
        ", port=" + port +
        ", sslCrypt=" + sslCrypt +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
