package org.hj.svbdubboapi.service;


import org.hj.common.core.api.Result;

public interface SvbDubboService {

    Result<String> sayHello(String name);
}
