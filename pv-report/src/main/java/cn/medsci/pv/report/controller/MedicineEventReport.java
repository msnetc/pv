package cn.medsci.pv.report.controller;

import cn.medsci.pv.report.entity.report.*;
import cn.medsci.pv.report.vo.report.GetRegionReport;
import cn.medsci.pv.report.vo.report.RegionReport;
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

    @ApiOperation(value = "不良反应结果")
    @RequestMapping(value = "/UntowardEffectReport", method = RequestMethod.POST)
    public UntowardEffectReport Index(@ApiParam("request") @RequestBody GetUntowardEffectReport request){
        UntowardEffectReport report1=new UntowardEffectReport();
        return  report1;
    }

    @ApiOperation(value = "区域")
    @RequestMapping(value = "/RegionReport", method = RequestMethod.POST)
    public RegionReport Index(@ApiParam("request") @RequestBody GetRegionReport request){
        RegionReport report1=new RegionReport();
        return  report1;
    }

}
