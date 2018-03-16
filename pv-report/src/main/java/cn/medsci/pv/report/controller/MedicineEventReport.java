package cn.medsci.pv.report.controller;

import cn.medsci.pv.report.vo.report.GetUntowardEffectReport;
import cn.medsci.pv.report.vo.report.UntowardEffectReport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "药物事件")
@RequestMapping("/MedicineEvent")
public class MedicineEventReport {

    @ApiOperation(value = "历年整体分布")
    @RequestMapping(value = "/UntowardEffectReport", method = RequestMethod.POST)
    public UntowardEffectReport Index(@ApiParam("request") @RequestBody GetUntowardEffectReport request){
        UntowardEffectReport report1=new UntowardEffectReport();
        return  report1;
    }
}
