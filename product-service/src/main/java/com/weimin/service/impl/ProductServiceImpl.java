package com.weimin.service.impl;

import com.weimin.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weimin
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @date 2019/11/29 18:54
 */
@Service
public class ProductServiceImpl implements IProductService {
    @Override
    public List<String> list() {
        List<String> list = new ArrayList<>();
        list.add("三天精通Java");
        list.add("数据库从入门到入狱");
        return list;
    }
}
