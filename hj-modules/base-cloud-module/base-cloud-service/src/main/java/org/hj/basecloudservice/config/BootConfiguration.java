package org.hj.basecloudservice.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author hong.jian.li
 */
@EnableDiscoveryClient
@EnableFeignClients
@Configuration
public class BootConfiguration {
}
