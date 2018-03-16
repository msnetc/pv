package cn.medsci.pv.report.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
public class Dictionaries extends Model<Dictionaries> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 序号
     */
    private String serial;
    /**
     * 中文
     */
    private String chinese;
    /**
     * 英文
     */
    private String english;
    /**
     * 所属页面
     */
    private String forpage;
    /**
     * 系统构建
     */
    private String structure;
    /**
     * 排序字典
     */
    private Integer sort;
    /**
     * 关联id
     */
    @TableField("dict_id")
    private Integer dictId;
    @TableField("created_at")
    private String createdAt;
    @TableField("updated_at")
    private String updatedAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getForpage() {
        return forpage;
    }

    public void setForpage(String forpage) {
        this.forpage = forpage;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dictionaries{" +
        ", id=" + id +
        ", serial=" + serial +
        ", chinese=" + chinese +
        ", english=" + english +
        ", forpage=" + forpage +
        ", structure=" + structure +
        ", sort=" + sort +
        ", dictId=" + dictId +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
