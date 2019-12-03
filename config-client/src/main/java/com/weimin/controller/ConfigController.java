package com.weimin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weimin
 * @ClassName ConfigController
 * @Description TODO
 * @date 2019/12/3 18:47
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {
    @Value("${configTest.url}")
    private String name;


    @RequestMapping("get")
    public String get(){
        return name;
    }

}
