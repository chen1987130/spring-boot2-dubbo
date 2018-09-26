package com.kbao.custom;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author chensheng
 * @since V1.0.0
 */
@SpringBootApplication
public class CustomApp {

    /**
     * 服务启动类
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(CustomApp.class).run(args);
    }
}
