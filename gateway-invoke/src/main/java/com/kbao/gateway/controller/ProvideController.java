package com.kbao.gateway.controller;

import com.kbao.api.model.User;
import com.kbao.api.service.ProvideApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chensheng
 * @version V1.0
 * @Description
 * @date 2018/09/25
 * @since V1.0
 */
@RestController
public class ProvideController {

    @Autowired
    private ProvideApi provideApi;

    @RequestMapping(value = ("/add"), method = {RequestMethod.POST})
    public Integer add(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return provideApi.add(num1, num2);
    }

    @RequestMapping(value = ("/del"), method = {RequestMethod.POST})
    public Integer del(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return provideApi.del(num1, num2);
    }

    @RequestMapping(value = ("/user"), method = {RequestMethod.POST})
    public User user(@RequestParam("age") Integer age, @RequestParam("name") String name) {
        User u = provideApi.user(age, name);
        System.out.println(u.toString());
        return u;
    }
}
