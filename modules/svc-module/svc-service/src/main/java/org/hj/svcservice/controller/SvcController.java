package org.hj.svcservice.controller;

import lombok.AllArgsConstructor;
import org.hj.common.api.R;
import org.hj.svcservice.service.SvcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class SvcController {

    private final SvcService svcService;

    @GetMapping("cloud")
    public R<String> cloudSayHello(@RequestParam("name") String name) {
        return svcService.cloudSayHello(name);
    }

    @GetMapping("dubbo")
    public R<String> dubboSayHello(@RequestParam("name") String name) {
        return svcService.dubooSayHello(name);
    }
}
