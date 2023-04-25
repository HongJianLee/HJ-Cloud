package org.hj.basedubboservice.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.hj.basedubboapi.service.BaseDubboService;
import org.hj.common.core.constant.R;


@DubboService(interfaceClass = BaseDubboService.class,interfaceName = "${dubbo.application.name}",version = "${dubbo.application.version}")
public class BaseDubboServiceImpl implements BaseDubboService {

    @Override
    public R<String> sayHello(String name) {
        return R.success("hello ".concat(name));
    }
}
