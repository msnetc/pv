package cn.medsci.pv.report;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Created by wenhao.wang on 2018/3/16.
 *  mybatis-plus 代码生成器
 */
public class AutoGeneratorHelper {
    /**
     * 执行入口
     * @param args
     */
    public static void main(String[] args){
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("F:/pv-project/pv/pv-report/src/main/java")
                .setFileOverride(true)
                .setActiveRecord(true)
                .setEnableCache(false)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setAuthor("wenhao.wang")
                .setMapperName("%sMapper")
                .setXmlName("%sMapper")
                .setServiceName("I%sService")
                .setServiceImplName("I%sServiceImpl")
                .setControllerName("%sController");

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUsername("zhouwen")
                .setPassword("ZhowWen-160111")
                .setUrl("jdbc:mysql://10.0.1.40:3306/pv?useUnicode=true&characterEncoding=utf8");

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel)
                .setInclude(new String[] { "adverse_reactions","attachment_drug","attachment_models","attachment_reports","attachments",
                        "categories","category","clinical","companies","country","data_traces","dictionaries","drug","drug_adverse_reactions",
                        "enterprise_clinical","failed_jobs","logistics","mail","mails","meddra_hlgts","meddra_hlts","meddra_llts","meddra_pts",
                        "meddra_socs","menus","migrations","password_resets","permission_role","permission_user","permissions","query_template_options",
                        "query_templates","question","recursive_relations","regulations","report_logistics","report_logistics_logs","report_mainpage",
                        "report_tabs","report_tasks","report_values","role_user","roles","send_information","source","subdictionaries","supervisions",
                        "task_workflows","test_repositories","users","workflow_nodes","workflows" }); // 需要生成的表

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("cn.medsci.pv.report");// 自定义包路径

        // 执行生成
        new AutoGenerator().setGlobalConfig(gc)
                .setDataSource(dsc)
                .setStrategy(strategy)
                .setPackageInfo(pc)
                .execute();
    }
}
