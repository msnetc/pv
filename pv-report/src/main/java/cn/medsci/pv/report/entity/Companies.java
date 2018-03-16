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
public class Companies extends Model<Companies> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 企业名称
     */
    private String name;
    /**
     * 企业标识大写英文4
     */
    @TableField("corporate_identity")
    private String corporateIdentity;
    /**
     * 企业类型  1:药企 2：CRO公司
     */
    @TableField("enterprise_type")
    private Integer enterpriseType;
    /**
     * 企业名称缩写
     */
    @TableField("display_name")
    private String displayName;
    /**
     * 报告企业标识
     */
    @TableField("enterprise_logo")
    private String enterpriseLogo;
    /**
     * 国家id
     */
    private String country;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 企业地址
     */
    @TableField("enterprise_adress")
    private String enterpriseAdress;
    /**
     * 邮编
     */
    @TableField("zip_code")
    private String zipCode;
    /**
     * 母公司id
     */
    @TableField("parent_company_id")
    private Integer parentCompanyId;
    /**
     * 母公司名称
     */
    @TableField("parent_company_name")
    private String parentCompanyName;
    /**
     * 职位
     */
    private String position;
    /**
     * 部门负责人姓名
     */
    @TableField("position_name")
    private String positionName;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 部门名称
     */
    private String department;
    /**
     * 电子邮箱
     */
    private String mail;
    /**
     * 0显示 1不显示
     */
    @TableField("delete_status")
    private Integer deleteStatus;
    /**
     * 公司logo id
     */
    @TableField("logo_id")
    private Integer logoId;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    /**
     * 排序
     */
    @TableField("sort_id")
    private Integer sortId;
    @TableField("deleted_at")
    private Date deletedAt;


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

    public String getCorporateIdentity() {
        return corporateIdentity;
    }

    public void setCorporateIdentity(String corporateIdentity) {
        this.corporateIdentity = corporateIdentity;
    }

    public Integer getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(Integer enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEnterpriseLogo() {
        return enterpriseLogo;
    }

    public void setEnterpriseLogo(String enterpriseLogo) {
        this.enterpriseLogo = enterpriseLogo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEnterpriseAdress() {
        return enterpriseAdress;
    }

    public void setEnterpriseAdress(String enterpriseAdress) {
        this.enterpriseAdress = enterpriseAdress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getParentCompanyId() {
        return parentCompanyId;
    }

    public void setParentCompanyId(Integer parentCompanyId) {
        this.parentCompanyId = parentCompanyId;
    }

    public String getParentCompanyName() {
        return parentCompanyName;
    }

    public void setParentCompanyName(String parentCompanyName) {
        this.parentCompanyName = parentCompanyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getLogoId() {
        return logoId;
    }

    public void setLogoId(Integer logoId) {
        this.logoId = logoId;
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

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
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
        return "Companies{" +
        ", id=" + id +
        ", name=" + name +
        ", corporateIdentity=" + corporateIdentity +
        ", enterpriseType=" + enterpriseType +
        ", displayName=" + displayName +
        ", enterpriseLogo=" + enterpriseLogo +
        ", country=" + country +
        ", province=" + province +
        ", city=" + city +
        ", enterpriseAdress=" + enterpriseAdress +
        ", zipCode=" + zipCode +
        ", parentCompanyId=" + parentCompanyId +
        ", parentCompanyName=" + parentCompanyName +
        ", position=" + position +
        ", positionName=" + positionName +
        ", telephone=" + telephone +
        ", fax=" + fax +
        ", department=" + department +
        ", mail=" + mail +
        ", deleteStatus=" + deleteStatus +
        ", logoId=" + logoId +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", sortId=" + sortId +
        ", deletedAt=" + deletedAt +
        "}";
    }
}
