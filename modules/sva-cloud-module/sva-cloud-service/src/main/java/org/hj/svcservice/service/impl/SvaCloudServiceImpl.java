package org.hj.svcservice.service.impl;

import org.hj.common.core.api.Result;
import org.hj.svacloudapi.service.SvaCloudService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SvaCloudServiceImpl implements SvaCloudService {

    @Override
    public Result<String> sayHello(String name) {
        return Result.success("hello ".concat(name));
    }
}
