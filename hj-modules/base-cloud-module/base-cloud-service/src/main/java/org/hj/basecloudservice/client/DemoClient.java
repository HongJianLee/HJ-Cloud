package org.hj.basecloudservice.client;

import org.hj.basecloudapi.feign.DemoApi;
import org.hj.common.core.constant.R;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClient implements DemoApi {

    @Override
    public R<String> sayHello(String name) {
        return R.success("hello ".concat(name));
    }
}
