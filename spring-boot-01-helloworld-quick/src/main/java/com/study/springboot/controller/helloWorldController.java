package com.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program ame: <br>
 * @Creat : 2019-05-21-23:09
 * @Description :  <br/>
 */
//@ResponseBody
//@Controller
//这个是上面两个的结合体
@RestController
public class helloWorldController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick";
    }

    //restAPI 的方式
}
