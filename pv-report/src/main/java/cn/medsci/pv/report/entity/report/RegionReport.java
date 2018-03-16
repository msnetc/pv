package cn.medsci.pv.report.entity.report;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class RegionReport {

    @ApiModelProperty(value = "报告收到日期1 pv收到日期2")
    private String provinceName     ;

    @ApiModelProperty(value = "开始日期")
    private Integer reportNumber;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(Integer reportNumber) {
        this.reportNumber = reportNumber;
    }
}
