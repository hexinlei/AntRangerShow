package ant.ranger.ui.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @packgeName: ant.ranger.ui.controller
 * @ClassName: Example
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 2017/9/22-上午11:07
 * @version: 1.0
 * @since: JDK 1.8
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ApplicationUI {

    @Value("${name}")
    String name;

    @RequestMapping(value = "/hi2")
    public String hi2(){
        return name;
    }

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi")
    public String hi() {
        return "hi i am from port:" +port;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationUI.class, args);
    }

}
