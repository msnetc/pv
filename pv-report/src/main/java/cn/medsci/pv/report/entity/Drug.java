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
public class Drug extends Model<Drug> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "drug_id", type = IdType.AUTO)
    private Integer drugId;
    /**
     * 上市前1上市后2
     */
    private Integer type;
    /**
     * 所属公司
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 通用英文名称
     */
    @TableField("common_en_name")
    private String commonEnName;
    /**
     * 通用中文名称
     */
    @TableField("common_zh_name")
    private String commonZhName;
    /**
     * 标准通用名称
     */
    @TableField("common_standard_name")
    private String commonStandardName;
    /**
     * 活性成份
     */
    @TableField("active_ingredients")
    private String activeIngredients;
    /**
     * 药品分类
     */
    @TableField("drug_class")
    private String drugClass;
    /**
     * 生产厂家
     */
    private String manufacturer;
    /**
     * 剂型
     */
    private String formulation;
    /**
     * 批准文号
     */
    @TableField("approval_number")
    private String approvalNumber;
    /**
     * 商品英文名称
     */
    @TableField("product_en_name")
    private String productEnName;
    /**
     * 商品中文名称
     */
    @TableField("product_zh_name")
    private String productZhName;
    /**
     * 是否为进口1是2否
     */
    @TableField("is_import")
    private Integer isImport;
    /**
     * 规格
     */
    private String specification;
    /**
     * 用法用量
     */
    private String dosage;
    /**
     * 适应症
     */
    private String indications;
    /**
     * 注册批准日
     */
    @TableField("reg_approval_date")
    private Date regApprovalDate;
    /**
     * 首次销售时间
     */
    @TableField("first_sale_date")
    private Date firstSaleDate;
    /**
     * 换证日期
     */
    @TableField("replacement_date")
    private Date replacementDate;
    /**
     * 给药途径
     */
    @TableField("medication_way")
    private String medicationWay;
    /**
     * 治疗人群
     */
    @TableField("treatment_person")
    private String treatmentPerson;
    /**
     * 汉语拼音
     */
    private String pinyin;
    /**
     * 化学名
     */
    @TableField("chemical_name")
    private String chemicalName;
    /**
     * 分子式
     */
    @TableField("molecular_formula")
    private String molecularFormula;
    /**
     * 分子量
     */
    @TableField("molecular_weight")
    private String molecularWeight;
    /**
     * 性状
     */
    private String trait;
    /**
     * 批准文号到期日
     */
    @TableField("approval_end_date")
    private Date approvalEndDate;
    /**
     * 国家
     */
    private String country;
    /**
     * 生产批号
     */
    @TableField("production_batch")
    private String productionBatch;
    /**
     * 生产量
     */
    @TableField("production_quantity")
    private Integer productionQuantity;
    /**
     * 销售量
     */
    private Integer sales;
    /**
     * 销售地
     */
    @TableField("sales_zone")
    private String salesZone;
    /**
     * 召回数量
     */
    @TableField("recall_num")
    private Integer recallNum;
    /**
     * 实际召回数量
     */
    @TableField("real_recall_num")
    private Integer realRecallNum;
    /**
     * 不良反应
     */
    @TableField("adverse_reactions")
    private String adverseReactions;
    /**
     * 国家基本药品1是2否
     */
    @TableField("base_drug")
    private Integer baseDrug;
    /**
     * 国家医疗保险药品1是2否
     */
    @TableField("medical_insurance_drug")
    private Integer medicalInsuranceDrug;
    /**
     * 国家非处方药1是2否
     */
    @TableField("non_prescription_drug")
    private Integer nonPrescriptionDrug;
    /**
     * 中药保护品种1是2否
     */
    @TableField("chinese_medicine_protection_varieties")
    private Integer chineseMedicineProtectionVarieties;
    /**
     * 注册时间
     */
    @TableField("reg_date")
    private Date regDate;
    /**
     * 国际诞生日
     */
    @TableField("international_birth_day")
    private Date internationalBirthDay;
    /**
     * 国内首次注册日期
     */
    @TableField("first_reg_date")
    private Date firstRegDate;
    /**
     * 新药检测期截止时间
     */
    @TableField("drug_testing_deadline")
    private Date drugTestingDeadline;
    /**
     * 首次再注册时间
     */
    @TableField("first_reg_date_again")
    private Date firstRegDateAgain;
    /**
     * 1正常2删除
     */
    private Integer status;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCommonEnName() {
        return commonEnName;
    }

    public void setCommonEnName(String commonEnName) {
        this.commonEnName = commonEnName;
    }

    public String getCommonZhName() {
        return commonZhName;
    }

    public void setCommonZhName(String commonZhName) {
        this.commonZhName = commonZhName;
    }

    public String getCommonStandardName() {
        return commonStandardName;
    }

    public void setCommonStandardName(String commonStandardName) {
        this.commonStandardName = commonStandardName;
    }

    public String getActiveIngredients() {
        return activeIngredients;
    }

    public void setActiveIngredients(String activeIngredients) {
        this.activeIngredients = activeIngredients;
    }

    public String getDrugClass() {
        return drugClass;
    }

    public void setDrugClass(String drugClass) {
        this.drugClass = drugClass;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFormulation() {
        return formulation;
    }

    public void setFormulation(String formulation) {
        this.formulation = formulation;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getProductEnName() {
        return productEnName;
    }

    public void setProductEnName(String productEnName) {
        this.productEnName = productEnName;
    }

    public String getProductZhName() {
        return productZhName;
    }

    public void setProductZhName(String productZhName) {
        this.productZhName = productZhName;
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getIndications() {
        return indications;
    }

    public void setIndications(String indications) {
        this.indications = indications;
    }

    public Date getRegApprovalDate() {
        return regApprovalDate;
    }

    public void setRegApprovalDate(Date regApprovalDate) {
        this.regApprovalDate = regApprovalDate;
    }

    public Date getFirstSaleDate() {
        return firstSaleDate;
    }

    public void setFirstSaleDate(Date firstSaleDate) {
        this.firstSaleDate = firstSaleDate;
    }

    public Date getReplacementDate() {
        return replacementDate;
    }

    public void setReplacementDate(Date replacementDate) {
        this.replacementDate = replacementDate;
    }

    public String getMedicationWay() {
        return medicationWay;
    }

    public void setMedicationWay(String medicationWay) {
        this.medicationWay = medicationWay;
    }

    public String getTreatmentPerson() {
        return treatmentPerson;
    }

    public void setTreatmentPerson(String treatmentPerson) {
        this.treatmentPerson = treatmentPerson;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public String getMolecularFormula() {
        return molecularFormula;
    }

    public void setMolecularFormula(String molecularFormula) {
        this.molecularFormula = molecularFormula;
    }

    public String getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(String molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public Date getApprovalEndDate() {
        return approvalEndDate;
    }

    public void setApprovalEndDate(Date approvalEndDate) {
        this.approvalEndDate = approvalEndDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProductionBatch() {
        return productionBatch;
    }

    public void setProductionBatch(String productionBatch) {
        this.productionBatch = productionBatch;
    }

    public Integer getProductionQuantity() {
        return productionQuantity;
    }

    public void setProductionQuantity(Integer productionQuantity) {
        this.productionQuantity = productionQuantity;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getSalesZone() {
        return salesZone;
    }

    public void setSalesZone(String salesZone) {
        this.salesZone = salesZone;
    }

    public Integer getRecallNum() {
        return recallNum;
    }

    public void setRecallNum(Integer recallNum) {
        this.recallNum = recallNum;
    }

    public Integer getRealRecallNum() {
        return realRecallNum;
    }

    public void setRealRecallNum(Integer realRecallNum) {
        this.realRecallNum = realRecallNum;
    }

    public String getAdverseReactions() {
        return adverseReactions;
    }

    public void setAdverseReactions(String adverseReactions) {
        this.adverseReactions = adverseReactions;
    }

    public Integer getBaseDrug() {
        return baseDrug;
    }

    public void setBaseDrug(Integer baseDrug) {
        this.baseDrug = baseDrug;
    }

    public Integer getMedicalInsuranceDrug() {
        return medicalInsuranceDrug;
    }

    public void setMedicalInsuranceDrug(Integer medicalInsuranceDrug) {
        this.medicalInsuranceDrug = medicalInsuranceDrug;
    }

    public Integer getNonPrescriptionDrug() {
        return nonPrescriptionDrug;
    }

    public void setNonPrescriptionDrug(Integer nonPrescriptionDrug) {
        this.nonPrescriptionDrug = nonPrescriptionDrug;
    }

    public Integer getChineseMedicineProtectionVarieties() {
        return chineseMedicineProtectionVarieties;
    }

    public void setChineseMedicineProtectionVarieties(Integer chineseMedicineProtectionVarieties) {
        this.chineseMedicineProtectionVarieties = chineseMedicineProtectionVarieties;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getInternationalBirthDay() {
        return internationalBirthDay;
    }

    public void setInternationalBirthDay(Date internationalBirthDay) {
        this.internationalBirthDay = internationalBirthDay;
    }

    public Date getFirstRegDate() {
        return firstRegDate;
    }

    public void setFirstRegDate(Date firstRegDate) {
        this.firstRegDate = firstRegDate;
    }

    public Date getDrugTestingDeadline() {
        return drugTestingDeadline;
    }

    public void setDrugTestingDeadline(Date drugTestingDeadline) {
        this.drugTestingDeadline = drugTestingDeadline;
    }

    public Date getFirstRegDateAgain() {
        return firstRegDateAgain;
    }

    public void setFirstRegDateAgain(Date firstRegDateAgain) {
        this.firstRegDateAgain = firstRegDateAgain;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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
        return this.drugId;
    }

    @Override
    public String toString() {
        return "Drug{" +
        ", drugId=" + drugId +
        ", type=" + type +
        ", companyId=" + companyId +
        ", commonEnName=" + commonEnName +
        ", commonZhName=" + commonZhName +
        ", commonStandardName=" + commonStandardName +
        ", activeIngredients=" + activeIngredients +
        ", drugClass=" + drugClass +
        ", manufacturer=" + manufacturer +
        ", formulation=" + formulation +
        ", approvalNumber=" + approvalNumber +
        ", productEnName=" + productEnName +
        ", productZhName=" + productZhName +
        ", isImport=" + isImport +
        ", specification=" + specification +
        ", dosage=" + dosage +
        ", indications=" + indications +
        ", regApprovalDate=" + regApprovalDate +
        ", firstSaleDate=" + firstSaleDate +
        ", replacementDate=" + replacementDate +
        ", medicationWay=" + medicationWay +
        ", treatmentPerson=" + treatmentPerson +
        ", pinyin=" + pinyin +
        ", chemicalName=" + chemicalName +
        ", molecularFormula=" + molecularFormula +
        ", molecularWeight=" + molecularWeight +
        ", trait=" + trait +
        ", approvalEndDate=" + approvalEndDate +
        ", country=" + country +
        ", productionBatch=" + productionBatch +
        ", productionQuantity=" + productionQuantity +
        ", sales=" + sales +
        ", salesZone=" + salesZone +
        ", recallNum=" + recallNum +
        ", realRecallNum=" + realRecallNum +
        ", adverseReactions=" + adverseReactions +
        ", baseDrug=" + baseDrug +
        ", medicalInsuranceDrug=" + medicalInsuranceDrug +
        ", nonPrescriptionDrug=" + nonPrescriptionDrug +
        ", chineseMedicineProtectionVarieties=" + chineseMedicineProtectionVarieties +
        ", regDate=" + regDate +
        ", internationalBirthDay=" + internationalBirthDay +
        ", firstRegDate=" + firstRegDate +
        ", drugTestingDeadline=" + drugTestingDeadline +
        ", firstRegDateAgain=" + firstRegDateAgain +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
