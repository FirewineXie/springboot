package com.study.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Springboot14DubboProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(Springboot14DubboProviderApplication.class, args);
  }
}
