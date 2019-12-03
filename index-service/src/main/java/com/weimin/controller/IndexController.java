package com.weimin.controller;

import com.weimin.feign.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author weimin
 * @ClassName IndexController
 * @Description TODO
 * @date 2019/11/29 19:29
 */
@Controller
@RequestMapping("index")
public class IndexController {

    @Autowired
    private IProductService productService;

    @RequestMapping("show")
    @ResponseBody
    public List<String> show(){
        return productService.list();
    }
}
