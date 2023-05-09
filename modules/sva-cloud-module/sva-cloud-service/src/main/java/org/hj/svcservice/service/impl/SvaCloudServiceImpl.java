package org.hj.svcservice.service.impl;

import org.hj.common.core.api.R;
import org.hj.svacloudapi.service.SvaCloudService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SvaCloudServiceImpl implements SvaCloudService {

    @Override
    public R<String> sayHello(String name) {
        return R.data("hello ".concat(name));
    }
}
