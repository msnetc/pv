package cn.medsci.pv.report.entity.report;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class GetUntowardEffectReport {

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
}
