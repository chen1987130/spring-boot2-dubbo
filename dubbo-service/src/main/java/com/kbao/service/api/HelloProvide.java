package com.kbao.service.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.kabao.api.IHelloApi;

/**
 * @author chensheng
 * @since V1.0.0
 */

@Service(protocol = "dubbo")
public class HelloProvide implements IHelloApi {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
