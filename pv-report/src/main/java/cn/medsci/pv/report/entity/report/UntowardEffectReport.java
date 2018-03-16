package cn.medsci.pv.report.entity.report;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class UntowardEffectReport {

    @ApiModelProperty(value = "每种药品的明细")
    private List<UntowardEffectReportItem> items;

    public List<UntowardEffectReportItem> getItems() {
        return items;
    }

    public void setItems(List<UntowardEffectReportItem> items) {
        this.items = items;
    }
}
