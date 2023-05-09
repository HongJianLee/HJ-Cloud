package org.hj.svbdubboapi.service;


import org.hj.common.api.R;

public interface SvbDubboService {

    R<String> sayHello(String name);
}
