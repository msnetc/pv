package cn.medsci.pv.report.entity.report;

import io.swagger.annotations.ApiModelProperty;

public class GetYearStatisticsReport {

    @ApiModelProperty(value = "企业id")
    private String companyId;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
