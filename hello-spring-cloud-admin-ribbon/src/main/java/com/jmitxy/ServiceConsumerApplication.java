package com.jmitxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ${岑玉顺}
 * \* Date: 2020/7/3
 * \* Time: 14:16
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@EnableDiscoveryClient //注册到服务中心 启动之后eraka会多一个
@SpringBootApplication
public class ServiceConsumerApplication {
    /*@LoadBalanced //均衡模式开启 负载均衡的配置 集群模式
    @Bean
    public RestTemplate restTemplate(){
         return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerApplication.class,args);
    }
}