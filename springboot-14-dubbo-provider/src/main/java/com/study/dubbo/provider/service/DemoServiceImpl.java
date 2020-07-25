package com.study.dubbo.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Firewine
 * @version 1.0
 * @ProgramName: ImplDemoService
 * @Create 2020/7/25
 * @Description
 */
@Component
@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
