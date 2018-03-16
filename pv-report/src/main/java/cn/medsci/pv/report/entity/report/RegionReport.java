package cn.medsci.pv.report.entity.report;

import com.sun.tools.javac.util.List;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class RegionReport {

    @ApiModelProperty(value = "报告收到日期1 pv收到日期2")
    private Integer dateCategoryId;

    @ApiModelProperty(value = "开始日期")
    private Date startDate;

    @ApiModelProperty(value = "结束日期")
    private Date endDate;

    @ApiModelProperty(value = "商品名列表")
    private List<String> productNames;

    @ApiModelProperty(value = "报告状态id  1已完成 2未完成")
    private Integer reportStatusId;


    public Integer getDateCategoryId() {
        return dateCategoryId;
    }

    public void setDateCategoryId(Integer dateCategoryId) {
        this.dateCategoryId = dateCategoryId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(List<String> productNames) {
        this.productNames = productNames;
    }

    public Integer getReportStatusId() {
        return reportStatusId;
    }

    public void setReportStatusId(Integer reportStatusId) {
        this.reportStatusId = reportStatusId;
    }
}
