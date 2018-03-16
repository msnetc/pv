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
@TableName("meddra_llts")
public class MeddraLlts extends Model<MeddraLlts> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 中文名称
     */
    private String name;
    /**
     * 英文名称
     */
    @TableField("en_name")
    private String enName;
    /**
     * 编码
     */
    private String code;
    /**
     * pt编码
     */
    @TableField("meddra_pt_code")
    private String meddraPtCode;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMeddraPtCode() {
        return meddraPtCode;
    }

    public void setMeddraPtCode(String meddraPtCode) {
        this.meddraPtCode = meddraPtCode;
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
        return "MeddraLlts{" +
        ", id=" + id +
        ", name=" + name +
        ", enName=" + enName +
        ", code=" + code +
        ", meddraPtCode=" + meddraPtCode +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
