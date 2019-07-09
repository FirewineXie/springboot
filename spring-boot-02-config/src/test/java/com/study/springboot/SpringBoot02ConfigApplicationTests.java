package com.study.springboot;

import com.study.springboot.bean.Persoon;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * springboot 的单元测试
 *
 * 可以在测试期间很方便的类似编码一样自动注入等容器
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

    @Autowired
    Persoon persoon;


    @Test
    public void contextLoads() {

        System.out.println(persoon);
    }

}
