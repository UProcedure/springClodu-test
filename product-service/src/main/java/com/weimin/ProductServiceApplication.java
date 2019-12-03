package com.weimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weimin
 * @ClassName ProductServiceApplication
 * @Description TODO
 * @date 2019/11/29 18:50
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class,args);
    }
}
