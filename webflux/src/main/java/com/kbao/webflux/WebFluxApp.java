package com.kbao.webflux;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author chensheng
 * @since V1.0.0
 */
@SpringBootApplication
public class WebFluxApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(WebFluxApp.class).run(args);
    }
}
