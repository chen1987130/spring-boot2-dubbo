package com.kbao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author chensheng
 * @version V1.0
 * @Description
 * @date 2018/09/25
 * @since V1.0
 */
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.kbao.api")
@SpringBootApplication(scanBasePackages = "com.kbao")
public class InvokeApp {

    public static void main(String[] args) {
        SpringApplication.run(InvokeApp.class, args);
    }
}
