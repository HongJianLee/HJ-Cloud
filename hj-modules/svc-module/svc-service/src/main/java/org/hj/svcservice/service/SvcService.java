package org.hj.svcservice.service;

import org.hj.common.core.constant.R;

public interface SvcService {

    R<String> cloudSayHello(String name);

    R<String> dubooSayHello(String name);
}