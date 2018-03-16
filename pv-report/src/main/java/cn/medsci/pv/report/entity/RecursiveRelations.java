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
@TableName("recursive_relations")
public class RecursiveRelations extends Model<RecursiveRelations> {

    private static final long serialVersionUID = 1L;

    @TableId("current_id")
    private Integer currentId;
    @TableField("recursive_id")
    private Integer recursiveId;
    @TableField("recursive_type")
    private String recursiveType;
    /**
     * 排序
     */
    private Integer sort;


    public Integer getCurrentId() {
        return currentId;
    }

    public void setCurrentId(Integer currentId) {
        this.currentId = currentId;
    }

    public Integer getRecursiveId() {
        return recursiveId;
    }

    public void setRecursiveId(Integer recursiveId) {
        this.recursiveId = recursiveId;
    }

    public String getRecursiveType() {
        return recursiveType;
    }

    public void setRecursiveType(String recursiveType) {
        this.recursiveType = recursiveType;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.currentId;
    }

    @Override
    public String toString() {
        return "RecursiveRelations{" +
        ", currentId=" + currentId +
        ", recursiveId=" + recursiveId +
        ", recursiveType=" + recursiveType +
        ", sort=" + sort +
        "}";
    }
}
