package org.hj.svbdubboservice.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.hj.common.core.api.Result;
import org.hj.svbdubboapi.service.SvbDubboService;


@DubboService(interfaceClass = SvbDubboService.class, version = "${dubbo.application.version}")
public class SvbDubboServiceImpl implements SvbDubboService {

    @Override
    public Result<String> sayHello(String name) {
        return  Result.data("hello ".concat(name));
    }
}
