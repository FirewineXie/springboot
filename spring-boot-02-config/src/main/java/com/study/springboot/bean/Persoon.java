package com.study.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @version : 1.0
 * @author : Firewine
 * @mail ：
 * @Program Name: <br>
 * @Create : 2019-05-22-22:40
 * @Description :  <br/>
 */

/**
 * 将配置文件配置的每个属性的值，映射到这个组件中
 * @ConfigurationProperties : 告诉springboot 将本类中的所有属性和配置文件相关的配置进行绑定
 * prefix ="person"   : 配置文件那个下面的所有属性进行映射
 * 只有这个组件是容器中的组件，才能容器提供@figurationProperties功能
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Persoon {
    private String LastName;
    private Integer age;
    private Boolean boss;
    private Date birth;


    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Persoon{" +
                "LastName='" + LastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
