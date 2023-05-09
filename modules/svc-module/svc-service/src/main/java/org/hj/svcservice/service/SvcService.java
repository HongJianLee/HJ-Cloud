package org.hj.svcservice.service;


import org.hj.common.core.api.Result;

public interface SvcService {

    Result<String> cloudSayHello(String name);

    Result<String> dubooSayHello(String name);
}
