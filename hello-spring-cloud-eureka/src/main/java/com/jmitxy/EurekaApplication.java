package com.jmitxy;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ${岑玉顺}
 * \* Date: 2020/7/3
 * \* Time: 10:06
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //开启Eureka服务
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
