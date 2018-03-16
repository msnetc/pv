package cn.medsci.pv.report.controller;

import cn.medsci.pv.report.entity.report.GetYearStatisticsReport;
import cn.medsci.pv.report.entity.report.YearStatisticsReport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "通用报表")
@RequestMapping("/CommonReport")
public class CommonReportController {

    @ApiOperation(value = "历年整体分布")
    @RequestMapping(value = "/YearStatisticsReport", method = RequestMethod.POST)
    public YearStatisticsReport  Index(@ApiParam("request") @RequestBody GetYearStatisticsReport request){
        YearStatisticsReport report1=new YearStatisticsReport();
        return  report1;
    }


}
