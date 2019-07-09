package com.study.springboot.controller;

import com.study.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @auther : Firewine
 * @mail ： 1451661318@qq.com
 * @Program Name: <br>
 * @Create : 2019-05-25-22:49
 * @Description :  <br/>
 */
@Controller
public class HelloController {

    @RequestMapping({"/","/login.html"})
    public String index() {
        return "login";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World";
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map) {

        map.put("hello", "你好");
        //classpath:/templates/" 下的success页面
        return "success";
    }
}
