package cn.medsci.pv.report.entity;

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
@TableName("attachment_models")
public class AttachmentModels extends Model<AttachmentModels> {

    private static final long serialVersionUID = 1L;

    @TableId("attachment_id")
    private Integer attachmentId;
    @TableField("attachment_model_id")
    private Integer attachmentModelId;
    @TableField("attachment_model_type")
    private String attachmentModelType;


    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Integer getAttachmentModelId() {
        return attachmentModelId;
    }

    public void setAttachmentModelId(Integer attachmentModelId) {
        this.attachmentModelId = attachmentModelId;
    }

    public String getAttachmentModelType() {
        return attachmentModelType;
    }

    public void setAttachmentModelType(String attachmentModelType) {
        this.attachmentModelType = attachmentModelType;
    }

    @Override
    protected Serializable pkVal() {
        return this.attachmentId;
    }

    @Override
    public String toString() {
        return "AttachmentModels{" +
        ", attachmentId=" + attachmentId +
        ", attachmentModelId=" + attachmentModelId +
        ", attachmentModelType=" + attachmentModelType +
        "}";
    }
}
