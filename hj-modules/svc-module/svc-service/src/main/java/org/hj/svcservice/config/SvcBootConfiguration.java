package org.hj.svcservice.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author hong.jian.li
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"org.hj.svacloudapi.service"})
@EnableDubbo
@Configuration
public class SvcBootConfiguration {
}
