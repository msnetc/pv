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
 * 报告-物流信息表
 * </p>
 *
 * @author wenhao.wang
 * @since 2018-03-16
 */
@TableName("report_logistics")
public class ReportLogistics extends Model<ReportLogistics> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("company_id")
    private Integer companyId;
    @TableField("report_id")
    private Integer reportId;
    /**
     * 报告编号
     */
    @TableField("report_number")
    private String reportNumber;
    /**
     * 运单号
     */
    @TableField("waybill_number")
    private String waybillNumber;
    /**
     * 监管部门
     */
    private String department;
    /**
     * 物流公司
     */
    @TableField("logistics_company")
    private String logisticsCompany;
    /**
     * 物流公司简称
     */
    @TableField("short_name")
    private String shortName;
    /**
     * 上报方式1物流2传真
     */
    @TableField("reported_way")
    private Integer reportedWay;
    /**
     * 物流信息
     */
    @TableField("logistics_info")
    private String logisticsInfo;
    /**
     * 上报时间
     */
    @TableField("reported_date")
    private Date reportedDate;
    /**
     * 备注
     */
    private String remark;
    /**
     * 物流状态
     */
    @TableField("logistics_status")
    private String logisticsStatus;
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

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Integer getReportedWay() {
        return reportedWay;
    }

    public void setReportedWay(Integer reportedWay) {
        this.reportedWay = reportedWay;
    }

    public String getLogisticsInfo() {
        return logisticsInfo;
    }

    public void setLogisticsInfo(String logisticsInfo) {
        this.logisticsInfo = logisticsInfo;
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
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
        return "ReportLogistics{" +
        ", id=" + id +
        ", companyId=" + companyId +
        ", reportId=" + reportId +
        ", reportNumber=" + reportNumber +
        ", waybillNumber=" + waybillNumber +
        ", department=" + department +
        ", logisticsCompany=" + logisticsCompany +
        ", shortName=" + shortName +
        ", reportedWay=" + reportedWay +
        ", logisticsInfo=" + logisticsInfo +
        ", reportedDate=" + reportedDate +
        ", remark=" + remark +
        ", logisticsStatus=" + logisticsStatus +
        ", status=" + status +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        "}";
    }
}
