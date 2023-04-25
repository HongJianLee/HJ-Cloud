package org.hj.basedubboapi.service;


import org.hj.common.core.constant.R;

public interface BaseDubboService {

    R<String> sayHello(String name);
}
