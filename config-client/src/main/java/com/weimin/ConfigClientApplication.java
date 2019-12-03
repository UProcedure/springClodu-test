package com.weimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weimin
 * @ClassName ConfigClientApplication
 * @Description TODO
 * @date 2019/12/3 18:41
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
}
