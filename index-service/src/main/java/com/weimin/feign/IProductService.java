package com.weimin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weimin
 */
@FeignClient(name = "PRODUCT-SERVICE",fallback = IProductService.ProductServiceFallback.class)
public interface IProductService {

    @GetMapping("product/list")
    List<String> list();

    @Component
    class ProductServiceFallback implements IProductService{

        @Override
        public List<String> list() {
            System.out.println("进入了熔断处理。。。。。。");
            List<String> list = new ArrayList<>();
            list.add("进入了熔断处理。。。。。。");
            return list;
        }
    }
}
