package org.hj.svcservice.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.hj.common.core.constant.R;
import org.hj.svacloudapi.service.SvaCloudService;
import org.hj.svbdubboapi.service.SvbDubboService;
import org.hj.svcservice.service.SvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SvcServiceImpl implements SvcService {

    @Autowired
    private SvaCloudService svaCloudService;

    @DubboReference(version = "${dubbo.application.version}")
    private SvbDubboService svbDubboService;


    @Override
    public R<String> cloudSayHello(String name) {
        return svaCloudService.sayHello(name);
    }

    @Override
    public R<String> dubooSayHello(String name) {
        return svbDubboService.sayHello(name);
    }
}
