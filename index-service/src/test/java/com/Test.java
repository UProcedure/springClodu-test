package com;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author weimin
 * @ClassName Test
 * @Description TODO
 * @date 2019/11/30 15:37
 */
public class Test {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1,new StringHttpMessageConverter(StandardCharsets.ISO_8859_1));
        String forObject = restTemplate.getForObject("http://localhost:8080/product/list", String.class);
        System.out.println(forObject);
    }
}
