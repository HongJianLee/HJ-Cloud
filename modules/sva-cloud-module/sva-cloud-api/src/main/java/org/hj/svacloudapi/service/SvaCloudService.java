package org.hj.svacloudapi.service;

import org.hj.common.api.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "sva-cloud-service", contextId = "DemoApi")
public interface SvaCloudService {

    @GetMapping("/demoApi/sayHello")
    R<String> sayHello(@RequestParam("name") String name);
}
