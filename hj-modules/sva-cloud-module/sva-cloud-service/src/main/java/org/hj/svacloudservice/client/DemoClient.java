package org.hj.svacloudservice.client;

import org.hj.svacloudapi.feign.DemoApi;
import org.hj.common.core.constant.R;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClient implements DemoApi {

    @Override
    public R<String> sayHello(String name) {
        return R.success("hello ".concat(name));
    }
}
