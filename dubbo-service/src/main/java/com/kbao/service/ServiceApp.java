package com.kbao.service;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author chensheng
 * @since V1.0.0
 */
@SpringBootApplication
@EnableDubboConfig(multiple = true)
public class ServiceApp {

    /**
     * 服务启动类
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ServiceApp.class).run(args);
    }
}
