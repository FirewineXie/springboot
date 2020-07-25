package com.study.amqp;

import com.study.amqp.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Springboot10AmqpApplicationTests {

  @Autowired RabbitTemplate rabbitTemplate;

  @Autowired AmqpAdmin amqpAdmin;

  @Test
  public void createExchange() {

    amqpAdmin.declareExchange(new DirectExchange("amqpadmin.exchange"));
    System.out.println("创建完成");

    amqpAdmin.declareQueue(new Queue("amqpadmin.queue", true));
    // 创建绑定规则

    amqpAdmin.declareBinding(
        new Binding(
            "amqpadmin.queue",
            Binding.DestinationType.QUEUE,
            "amqpadmin.exchange",
            "amqp.haha",
            null));

    // amqpAdmin.de
  }

  /** 单播 点对点 */
  @Test
  public void contextLoads() {
    // message 需要自己构造;定义消息体内容和消息头
    // rabbitTemplate.send(exchage,routeKey,message);
    // object 默认当成消息体，只需要传入要发送的对象，自动序列化发送给rabbitmq
    // rabbitTemplate.convertAndSend(exchage,routeKey,,object);
    Map<String, Object> map = new HashMap<>();
    map.put("msg", "this one");
    map.put("data", Arrays.asList("helloword", 123, true));
    // 对象被默认序列化传送出去
    rabbitTemplate.convertAndSend("exchange.direct", "study.news", new Book("新华测得", "demo"));
  }

  // 如何将 数据 变成json 发出去
  @Test
  public void receiveMessage() {

    Object o = rabbitTemplate.receiveAndConvert("study.news");

    System.out.println(o.getClass());
    System.out.println(o.toString());
  }

  /** 广播 */
  @Test
  public void sendMsg() {
    rabbitTemplate.convertAndSend("exchange.fanout", "", new Book("红楼梦", "曹雪芹"));
  }
}
