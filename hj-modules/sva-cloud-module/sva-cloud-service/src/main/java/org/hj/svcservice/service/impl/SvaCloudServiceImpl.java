package org.hj.svcservice.service.impl;

import org.hj.svacloudapi.service.SvaCloudService;
import org.hj.common.core.constant.R;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SvaCloudServiceImpl implements SvaCloudService {

    @Override
    public R<String> sayHello(String name) {
        return R.success("hello ".concat(name));
    }
}
