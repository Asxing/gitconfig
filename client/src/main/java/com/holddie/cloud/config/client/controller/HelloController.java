package com.holddie.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置文件访问
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2017/11/30 20:49
 */
@RestController
public class HelloController {

    @Value(value = "${holddie.hello}")
    private String hello;

    @RequestMapping(value = "/hello")
    public String from(){
        return this.hello;
    }
}
