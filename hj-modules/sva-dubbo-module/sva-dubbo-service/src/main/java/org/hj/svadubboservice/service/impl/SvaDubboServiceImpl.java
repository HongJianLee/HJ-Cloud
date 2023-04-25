package org.hj.svadubboservice.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.hj.svadubboapi.service.SvaDubboService;
import org.hj.common.core.constant.R;


@DubboService(interfaceClass = SvaDubboService.class,interfaceName = "${dubbo.application.name}",version = "${dubbo.application.version}")
public class SvaDubboServiceImpl implements SvaDubboService {

    @Override
    public R<String> sayHello(String name) {
        return R.success("hello ".concat(name));
    }
}
