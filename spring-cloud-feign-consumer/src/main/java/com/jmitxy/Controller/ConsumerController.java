package com.jmitxy.Controller;

import com.jmitxy.config.HomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ${岑玉顺}
 * \* Date: 2020/7/3
 * \* Time: 14:22
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class ConsumerController {
    @Autowired
    private HomeClient homeClient;

    @GetMapping(value = "/hello")
    public String hello() {
        return homeClient.consumer();
    }
}