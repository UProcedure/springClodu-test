package com.weimin.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author weimin
 * @ClassName RestTemplateConfig
 * @Description TODO
 * @date 2019/11/29 19:35
 */
@Component
public class RestTemplateConfig {


    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule getIRule(){
//        /**TODO 轮询策略*/
//        //return new RoundRobinRule();
//        /** TODO 随机策略*/
//        return new RandomRule();
//        /** TODO 权重策略*/
//        //return new WeightedResponseTimeRule();
//        /**TODO 最佳策略：遍历所有的服务实例，过滤掉故障实例，并返回请求数小的实例返回*/
//        //return new BestAvailableRule();
//        /**TODO 可用过滤策略。过滤掉故障和请求数超过阈值的服务实例，再从剩下的实例中轮询调用。*/
//        //return new AvailabilityFilteringRule();
//    }


}
