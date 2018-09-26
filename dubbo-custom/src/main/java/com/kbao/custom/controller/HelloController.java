package com.kbao.custom.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kabao.api.ICalculationApi;
import com.kabao.api.IHelloApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chensheng
 * @since V1.0.0
 */
@RestController
public class HelloController {

    @Reference
    private ICalculationApi calculationApi;

    @Reference
    private IHelloApi helloApi;


    @RequestMapping(value = ("/add"), method = {RequestMethod.POST})
    public Integer add(Integer num1, Integer num2) throws Exception {
        return calculationApi.add(num1, num2);
    }

    @RequestMapping(value = ("/del"), method = {RequestMethod.POST})
    public Integer del(Integer num1, Integer num2) throws Exception {
        return calculationApi.del(num1, num2);
    }

    @RequestMapping(value = ("/hello"), method = {RequestMethod.POST})
    public String name(String name) throws Exception {
        return helloApi.hello(name);
    }
}
