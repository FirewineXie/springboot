package com.study.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Springboot15SpringcloudEurekaServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(Springboot15SpringcloudEurekaServerApplication.class, args);
  }
}
