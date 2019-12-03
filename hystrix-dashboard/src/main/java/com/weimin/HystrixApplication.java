package com.weimin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * @author weimin
 * @ClassName HystrixApplication
 * @Description TODO
 * @date 2019/12/2 16:18
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class,args);
    }
}
