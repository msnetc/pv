package cn.medsci.pv.report.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("enterprise_clinical")
public class EnterpriseClinical extends Model<EnterpriseClinical> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 公司id
     */
    @TableField("enterprise_id")
    private Integer enterpriseId;
    /**
     * 临床项目id
     */
    @TableField("clinical_id")
    private Integer clinicalId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getClinicalId() {
        return clinicalId;
    }

    public void setClinicalId(Integer clinicalId) {
        this.clinicalId = clinicalId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EnterpriseClinical{" +
        ", id=" + id +
        ", enterpriseId=" + enterpriseId +
        ", clinicalId=" + clinicalId +
        "}";
    }
}
