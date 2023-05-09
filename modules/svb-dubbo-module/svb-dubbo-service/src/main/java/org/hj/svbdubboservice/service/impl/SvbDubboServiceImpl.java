package org.hj.svbdubboservice.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.hj.common.api.R;
import org.hj.svbdubboapi.service.SvbDubboService;


@DubboService(interfaceClass = SvbDubboService.class, version = "${dubbo.application.version}")
public class SvbDubboServiceImpl implements SvbDubboService {

    @Override
    public R<String> sayHello(String name) {
        return  R.data("hello ".concat(name));
    }
}
