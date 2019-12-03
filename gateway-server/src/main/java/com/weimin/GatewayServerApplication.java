package com.weimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weimin
 * @ClassName GatewayServerApplication
 * @Description TODO
 * @date 2019/12/3 16:08
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class,args);
    }
}
