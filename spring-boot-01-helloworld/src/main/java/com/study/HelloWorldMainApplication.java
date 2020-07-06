package com.study;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @author : Firewine
 * @mail ：
 * @Program Name: <br>
 * @Create : 2019-05-21-11:59
 * @Description :  <br/>
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}