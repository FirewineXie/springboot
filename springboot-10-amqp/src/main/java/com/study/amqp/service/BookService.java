package com.study.amqp.service;

import com.study.amqp.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Firewine
 * @version 1.0
 * @ProgramName: BookService
 * @Create 2020/7/20
 * @Description
 */
@Service
public class BookService {

    @RabbitListener(queues = "study.news")
    public void receive (Book book){
    System.out.println("收到消息"+book);
    }

    @RabbitListener(queues = "study")
    public void receive02(Message message){
    System.out.println(Arrays.toString(message.getBody()));
    System.out.println(message.getMessageProperties());
    }
}
