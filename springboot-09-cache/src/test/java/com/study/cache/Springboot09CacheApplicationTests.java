package com.study.cache;

import com.study.cache.bean.Employee;
import com.study.cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot09CacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    void contextLoads() {

        Employee empById = employeeMapper.getEmpById(1);
        System.out.println(empById);
    }

}
