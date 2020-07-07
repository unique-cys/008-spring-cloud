package com.jmitxy.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ${岑玉顺}
 * \* Date: 2020/7/3
 * \* Time: 16:16
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Configuration
public class RestTemplateConfig {
    @LoadBalanced //均衡模式开启 负载均衡的配置 集群模式
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}