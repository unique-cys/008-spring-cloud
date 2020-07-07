package com.jmitxy.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ${岑玉顺}
 * \* Date: 2020/7/3
 * \* Time: 11:19
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class SenderController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(">>>>>>"+port);
        return String.format("hello my cloud");
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(String message){
        System.out.println(message);
        return String.format("my port is : %s port:%s",message,port);
    }
}