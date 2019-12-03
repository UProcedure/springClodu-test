package com.weimin.controller;

import com.weimin.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author weimin
 * @ClassName ProductController
 * @Description TODO
 * @date 2019/11/29 18:56
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService productService;


    @RequestMapping("list")
    @ResponseBody
    public List<String> list(){
        System.out.println("进入了该服务");
        return productService.list();
    }
}
