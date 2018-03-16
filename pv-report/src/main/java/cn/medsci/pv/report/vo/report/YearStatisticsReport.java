package cn.medsci.pv.report.vo.report;

import io.swagger.annotations.ApiModelProperty;

public class YearStatisticsReport {

    @ApiModelProperty(value = "年份")
    private Integer year;

    @ApiModelProperty(value = "总数")
    private Integer totalNumber;

    @ApiModelProperty(value = "例数（有效）")
    private  Integer effectiveCaseNumber;

    @ApiModelProperty(value = "例数（无效）")
    private Integer ineffectiveCaseNumber;

    @ApiModelProperty(value = "年度增长率(%)")
    private  Double yearGrowthRate;

    @ApiModelProperty(value = "严重病例报告数" )
    private Integer seriousCaseNumber;

    @ApiModelProperty(value = "死亡病例")
    private  Integer deathCaseNumber;


    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getEffectiveCaseNumber() {
        return effectiveCaseNumber;
    }

    public void setEffectiveCaseNumber(Integer effectiveCaseNumber) {
        this.effectiveCaseNumber = effectiveCaseNumber;
    }

    public Integer getIneffectiveCaseNumber() {
        return ineffectiveCaseNumber;
    }

    public void setIneffectiveCaseNumber(Integer ineffectiveCaseNumber) {
        this.ineffectiveCaseNumber = ineffectiveCaseNumber;
    }

    public Double getYearGrowthRate() {
        return yearGrowthRate;
    }

    public void setYearGrowthRate(Double yearGrowthRate) {
        this.yearGrowthRate = yearGrowthRate;
    }

    public Integer getSeriousCaseNumber() {
        return seriousCaseNumber;
    }

    public void setSeriousCaseNumber(Integer seriousCaseNumber) {
        this.seriousCaseNumber = seriousCaseNumber;
    }

    public Integer getDeathCaseNumber() {
        return deathCaseNumber;
    }

    public void setDeathCaseNumber(Integer deathCaseNumber) {
        this.deathCaseNumber = deathCaseNumber;
    }
}
