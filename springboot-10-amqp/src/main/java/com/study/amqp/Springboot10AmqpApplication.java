package com.study.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Firewine
 * 自动配置 * 1.RabbitAutoConfiguration
 * 2.有自动配置连接工厂rabbitConnectionFactory
 * 3.Rabbitproperties 封装了Rabbitmq的配置
 * 4. rabbittemplate ： 给rabbitmq发送和接收消息
 * 5. amqpAdmin ：
 *     rabbitmq 系统管理功能组件
 *      创建删除，等
 *
 * 6. @EnableRabbit + @rabbitmqListener 监听消息队列的内容
 */
@EnableRabbit //开启基于注解的rabbitmq
@SpringBootApplication
public class Springboot10AmqpApplication {

  public static void main(String[] args) {
    SpringApplication.run(Springboot10AmqpApplication.class, args);
  }
}
