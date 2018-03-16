package cn.medsci.pv.report.entity;

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
@TableName("attachment_drug")
public class AttachmentDrug extends Model<AttachmentDrug> {

    private static final long serialVersionUID = 1L;

    @TableField("attach_id")
    private Integer attachId;
    @TableField("drug_id")
    private Integer drugId;
    private String remark;
    private String type;


    public Integer getAttachId() {
        return attachId;
    }

    public void setAttachId(Integer attachId) {
        this.attachId = attachId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AttachmentDrug{" +
        ", attachId=" + attachId +
        ", drugId=" + drugId +
        ", remark=" + remark +
        ", type=" + type +
        "}";
    }
}
