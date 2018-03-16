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
 * 药品不良反应表
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
@TableName("drug_adverse_reactions")
public class DrugAdverseReactions extends Model<DrugAdverseReactions> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 药品ID
     */
    @TableField("drug_id")
    private Integer drugId;
    /**
     * 序号
     */
    private String number;
    /**
     * MEDDRA编码
     */
    private String meddra;
    /**
     * 不良反应名称
     */
    private String title;
    /**
     * 首选术语
     */
    @TableField("first_nick")
    private String firstNick;
    /**
     * 首选术语编码
     */
    @TableField("first_nick_code")
    private String firstNickCode;
    /**
     * 发生率
     */
    private Integer incidence;
    private String remark;
    /**
     * 1正常2删除
     */
    private Integer status;
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

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMeddra() {
        return meddra;
    }

    public void setMeddra(String meddra) {
        this.meddra = meddra;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstNick() {
        return firstNick;
    }

    public void setFirstNick(String firstNick) {
        this.firstNick = firstNick;
    }

    public String getFirstNickCode() {
        return firstNickCode;
    }

    public void setFirstNickCode(String firstNickCode) {
        this.firstNickCode = firstNickCode;
    }

    public Integer getIncidence() {
        return incidence;
    }

    public void setIncidence(Integer incidence) {
        this.incidence = incidence;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return this.id;
    }

    @Override
    public String toString() {
        return "DrugAdverseReactions{" +
        ", id=" + id +
        ", drugId=" + drugId +
        ", number=" + number +
        ", meddra=" + meddra +
        ", title=" + title +
        ", firstNick=" + firstNick +
        ", firstNickCode=" + firstNickCode +
        ", incidence=" + incidence +
        ", remark=" + remark +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
