package org.hj.basecloudapi.feign;

import org.hj.common.core.constant.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "base-cloud-service", contextId = "DemoApi")
public interface DemoApi {

    @GetMapping("/demoApi/sayHello")
    R<String> sayHello(@RequestParam("name") String name);
}
