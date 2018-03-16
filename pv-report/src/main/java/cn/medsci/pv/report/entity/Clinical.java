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
public class Clinical extends Model<Clinical> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 项目编号
     */
    @TableField("research_id")
    private String researchId;
    /**
     * 研究方案名称
     */
    @TableField("research_topic")
    private String researchTopic;
    /**
     * 其他研究用药
     */
    @TableField("study_drug_use")
    private String studyDrugUse;
    /**
     * 申办方
     */
    private String bid;
    /**
     * 申办方Id
     */
    @TableField("bid_id")
    private Integer bidId;
    /**
     * 临床研究id
     */
    @TableField("research_type_id")
    private Integer researchTypeId;
    /**
     * 临床研究
     */
    @TableField("research_type")
    private String researchType;
    /**
     * 研究类型细分
     */
    private String subdivision;
    /**
     * 研究类型细分id
     */
    @TableField("subdivision_id")
    private Integer subdivisionId;
    /**
     * 临床实验适应症
     */
    private String indication;
    /**
     * 新药物临床研究批准文号
     */
    @TableField("research_comments")
    private String researchComments;
    /**
     * 研究设计
     */
    @TableField("research_design")
    private String researchDesign;
    /**
     * 开始时间
     */
    @TableField("start_time")
    private String startTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private String endTime;
    /**
     * 产品分类
     */
    @TableField("product_classification")
    private String productClassification;
    /**
     * 产品分类id
     */
    @TableField("product_classification_id")
    private Integer productClassificationId;
    /**
     * 注册分类
     */
    @TableField("registration_classification")
    private String registrationClassification;
    /**
     * 0正常，1-关闭
     */
    @TableField("delete_status")
    private Integer deleteStatus;
    /**
     * 发起企业的名称
     */
    @TableField("enterprise_name")
    private String enterpriseName;
    /**
     * 发起企业的id
     */
    @TableField("enterprise_id")
    private Integer enterpriseId;
    /**
     * 药物id 用,号隔开
     */
    @TableField("drug_id")
    private String drugId;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    /**
     * 公司id
     */
    @TableField("company_id")
    private Integer companyId;
    @TableField("sort_id")
    private Integer sortId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResearchId() {
        return researchId;
    }

    public void setResearchId(String researchId) {
        this.researchId = researchId;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public String getStudyDrugUse() {
        return studyDrugUse;
    }

    public void setStudyDrugUse(String studyDrugUse) {
        this.studyDrugUse = studyDrugUse;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Integer getBidId() {
        return bidId;
    }

    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    public Integer getResearchTypeId() {
        return researchTypeId;
    }

    public void setResearchTypeId(Integer researchTypeId) {
        this.researchTypeId = researchTypeId;
    }

    public String getResearchType() {
        return researchType;
    }

    public void setResearchType(String researchType) {
        this.researchType = researchType;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public Integer getSubdivisionId() {
        return subdivisionId;
    }

    public void setSubdivisionId(Integer subdivisionId) {
        this.subdivisionId = subdivisionId;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getResearchComments() {
        return researchComments;
    }

    public void setResearchComments(String researchComments) {
        this.researchComments = researchComments;
    }

    public String getResearchDesign() {
        return researchDesign;
    }

    public void setResearchDesign(String researchDesign) {
        this.researchDesign = researchDesign;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getProductClassification() {
        return productClassification;
    }

    public void setProductClassification(String productClassification) {
        this.productClassification = productClassification;
    }

    public Integer getProductClassificationId() {
        return productClassificationId;
    }

    public void setProductClassificationId(Integer productClassificationId) {
        this.productClassificationId = productClassificationId;
    }

    public String getRegistrationClassification() {
        return registrationClassification;
    }

    public void setRegistrationClassification(String registrationClassification) {
        this.registrationClassification = registrationClassification;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getDrugId() {
        return drugId;
    }

    public void setDrugId(String drugId) {
        this.drugId = drugId;
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Clinical{" +
        ", id=" + id +
        ", researchId=" + researchId +
        ", researchTopic=" + researchTopic +
        ", studyDrugUse=" + studyDrugUse +
        ", bid=" + bid +
        ", bidId=" + bidId +
        ", researchTypeId=" + researchTypeId +
        ", researchType=" + researchType +
        ", subdivision=" + subdivision +
        ", subdivisionId=" + subdivisionId +
        ", indication=" + indication +
        ", researchComments=" + researchComments +
        ", researchDesign=" + researchDesign +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", productClassification=" + productClassification +
        ", productClassificationId=" + productClassificationId +
        ", registrationClassification=" + registrationClassification +
        ", deleteStatus=" + deleteStatus +
        ", enterpriseName=" + enterpriseName +
        ", enterpriseId=" + enterpriseId +
        ", drugId=" + drugId +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", companyId=" + companyId +
        ", sortId=" + sortId +
        "}";
    }
}
