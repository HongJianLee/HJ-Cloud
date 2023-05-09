package org.hj.svbdubboservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "org.hj.svbdubboservice.service.impl")
@SpringBootApplication
public class SvbDubboServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SvbDubboServiceApplication.class, args);
    }

}
