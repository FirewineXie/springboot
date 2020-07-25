package com.study.dubbo.consumer;

import com.study.dubbo.consumer.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot14DubboConsumerApplicationTests {

  @Autowired
  DemoService demoService;

  @Test
  public void contextLoads() {

    demoService.sayHello("你好");
  }
}
