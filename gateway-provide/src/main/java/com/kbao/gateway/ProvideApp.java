package com.kbao.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author chensheng
 * @version V1.0
 * @Description
 * @date 2018/09/25
 * @since V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProvideApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(ProvideApp.class).run(args);
    }
}
