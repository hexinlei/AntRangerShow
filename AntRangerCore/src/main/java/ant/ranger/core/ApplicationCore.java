package ant.ranger.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @packgeName: ant.ranger.core
 * @ClassName: Application
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 2017/9/22-下午1:33
 * @version: 1.0
 * @since: JDK 1.8
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaServer
public class ApplicationCore {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationCore.class, args);
    }
}
