package com.jmitxy.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("hello-spring-cloud-service-sender")
@Component
public interface HomeClient {
    @GetMapping("/hi/{message}")//调用的 服务消费者路径
    String consumer();
}
