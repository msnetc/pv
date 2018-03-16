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
public class Attachments extends Model<Attachments> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 加密文件名
     */
    private String name;
    /**
     * 原始文件名
     */
    @TableField("origin_name")
    private String originName;
    /**
     * 文件大小
     */
    @TableField("file_size")
    private Integer fileSize;
    /**
     * 文件相对路径
     */
    private String path;
    /**
     * 文件扩展名
     */
    @TableField("file_ext")
    private String fileExt;
    /**
     * 文件扩展信息
     */
    @TableField("ext_info")
    private String extInfo;
    /**
     * 用户创建者id
     */
    @TableField("user_id")
    private Integer userId;
    /**
     * 用户创建者id
     */
    @TableField("user_name")
    private String userName;
    @TableField("deleted_at")
    private Date deletedAt;
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

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
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
        return "Attachments{" +
        ", id=" + id +
        ", name=" + name +
        ", originName=" + originName +
        ", fileSize=" + fileSize +
        ", path=" + path +
        ", fileExt=" + fileExt +
        ", extInfo=" + extInfo +
        ", userId=" + userId +
        ", userName=" + userName +
        ", deletedAt=" + deletedAt +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
