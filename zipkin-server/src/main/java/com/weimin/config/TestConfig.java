package com.weimin.config;

import com.weimin.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author weimin
 * @ClassName TestConfig
 * @Description TODO
 * @date 2019/12/9 12:46
 */
@Configurable
public class TestConfig {

    @Bean
    public User getUser(){
        System.out.println("User is create！！！");
        return new User();
    }
}
