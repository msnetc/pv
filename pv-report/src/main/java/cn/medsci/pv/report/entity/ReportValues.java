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
@TableName("report_values")
public class ReportValues extends Model<ReportValues> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 公司id
     */
    @TableField("company_id")
    private Integer companyId;
    /**
     * 报告id
     */
    @TableField("report_id")
    private Integer reportId;
    /**
     * tab的id
     */
    @TableField("report_tab_id")
    private Integer reportTabId;
    /**
     * tab的列id
     */
    private Integer col;
    /**
     * tab的列名称
     */
    @TableField("col_name")
    private String colName;
    /**
     * 数据点名称
     */
    private String name;
    /**
     * 数据点描述
     */
    private String description;
    /**
     * 数据点的值
     */
    private String value;
    /**
     * 是否是表格
     */
    @TableField("is_table")
    private Integer isTable;
    /**
     * 表格id
     */
    @TableField("table_alias")
    private String tableAlias;
    /**
     * 表格行号
     */
    @TableField("table_row_id")
    private Integer tableRowId;
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

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getReportTabId() {
        return reportTabId;
    }

    public void setReportTabId(Integer reportTabId) {
        this.reportTabId = reportTabId;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getIsTable() {
        return isTable;
    }

    public void setIsTable(Integer isTable) {
        this.isTable = isTable;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public Integer getTableRowId() {
        return tableRowId;
    }

    public void setTableRowId(Integer tableRowId) {
        this.tableRowId = tableRowId;
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
        return "ReportValues{" +
        ", id=" + id +
        ", companyId=" + companyId +
        ", reportId=" + reportId +
        ", reportTabId=" + reportTabId +
        ", col=" + col +
        ", colName=" + colName +
        ", name=" + name +
        ", description=" + description +
        ", value=" + value +
        ", isTable=" + isTable +
        ", tableAlias=" + tableAlias +
        ", tableRowId=" + tableRowId +
        ", deletedAt=" + deletedAt +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
