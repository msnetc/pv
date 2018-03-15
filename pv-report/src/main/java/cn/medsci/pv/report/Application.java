package cn.medsci.pv.report;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import sun.util.logging.resources.logging;

/**
 * mybatis-plus Spring Boot 测试 Demo<br>
 * 文档：http://mp.baomidou.com<br>
 */
@EnableTransactionManagement
@SpringBootApplication
@EnableSwagger2
public class Application {

    protected final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
        logger.info("PortalApplication is success!");
        System.err.println("druid数据状态监控：http://localhost:8080/druid/api.html");
        System.err.println("swaggerApi：http://localhost:8080/swagger-ui.html");
    }

}
