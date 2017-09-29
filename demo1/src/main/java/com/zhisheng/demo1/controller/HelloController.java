package com.zhisheng.demo1.controller;

import com.zhisheng.demo1.domain.ConfigBean;
import com.zhisheng.demo1.domain.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhisheng_tian on 2017/9/29.
 */
@RestController     //same as @Controller + @ResponseBody  使用这个注解的类里面的方法都以json格式输出
public class HelloController {

    @Autowired
    ConfigBean configBean;

    @Autowired
    ConfigTestBean configTestBean;


    @Value("${com.zhisheng.name}")
    private String name;
    @Value("${com.zhisheng.want}")
    private String want;

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot";
    }


    @RequestMapping("/hello")
    public String hello() {
        return name + want;
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return configBean.getName() + configBean.getWant();
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return configBean.getHope();
    }


    @RequestMapping("/hello3")
    public String hello3() {
        return configTestBean.getName() + configTestBean.getWant();
    }
}
