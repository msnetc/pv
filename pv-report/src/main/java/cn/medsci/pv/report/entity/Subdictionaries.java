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
public class Subdictionaries extends Model<Subdictionaries> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 字典子数据的中文
     */
    @TableField("sub_chinese")
    private String subChinese;
    /**
     * 字典子数据的英文
     */
    @TableField("sub_english")
    private String subEnglish;
    /**
     * 父关联id
     */
    @TableField("dict_id")
    private Integer dictId;
    @TableField("created_at")
    private Date createdAt;
    @TableField("updated_at")
    private Date updatedAt;
    /**
     * E2B名称
     */
    @TableField("e_name")
    private String eName;
    /**
     * E2B格式
     */
    @TableField("e_formate")
    private String eFormate;
    @TableField("is_desc")
    private Integer isDesc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubChinese() {
        return subChinese;
    }

    public void setSubChinese(String subChinese) {
        this.subChinese = subChinese;
    }

    public String getSubEnglish() {
        return subEnglish;
    }

    public void setSubEnglish(String subEnglish) {
        this.subEnglish = subEnglish;
    }

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
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

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteFormate() {
        return eFormate;
    }

    public void seteFormate(String eFormate) {
        this.eFormate = eFormate;
    }

    public Integer getIsDesc() {
        return isDesc;
    }

    public void setIsDesc(Integer isDesc) {
        this.isDesc = isDesc;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Subdictionaries{" +
        ", id=" + id +
        ", subChinese=" + subChinese +
        ", subEnglish=" + subEnglish +
        ", dictId=" + dictId +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", eName=" + eName +
        ", eFormate=" + eFormate +
        ", isDesc=" + isDesc +
        "}";
    }
}
