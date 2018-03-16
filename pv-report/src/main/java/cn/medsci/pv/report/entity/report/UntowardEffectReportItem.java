package cn.medsci.pv.report.entity.report;

import io.swagger.annotations.ApiModelProperty;

public class UntowardEffectReportItem {


    @ApiModelProperty(value = "不良反应分类名称，如不良，未好转..")
    private String categoryName;


    @ApiModelProperty(value = "药品名称")
    private String medicineName;


    @ApiModelProperty(value = "占比")
    private Double costProportionRate;


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Double getCostProportionRate() {
        return costProportionRate;
    }

    public void setCostProportionRate(Double costProportionRate) {
        this.costProportionRate = costProportionRate;
    }
}
