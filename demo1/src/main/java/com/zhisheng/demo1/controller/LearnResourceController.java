package com.zhisheng.demo1.controller;

import com.zhisheng.demo1.bean.User;
import com.zhisheng.demo1.domain.LearnResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhisheng_tian on 2017/9/29.
 */
@Controller
public class LearnResourceController {

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpServletResponse response) {
        Map<String,Object> map =new HashMap<String,Object>();
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        if (!userName.equals("") && password != "") {
            User user = new User(userName, password);
            request.getSession().setAttribute("user", user);
            map.put("result", "1");
        } else {
            map.put("result", "0");
        }
        return map;
    }

    @RequestMapping("/learn")
    public ModelAndView index() {
        List<LearnResource> learnList = new ArrayList<LearnResource>();
        LearnResource bean = new LearnResource("官方参考文档", "Spring Boot Reference Guide", "http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean = new LearnResource("官方SpringBoot例子", "官方SpringBoot例子", "https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean = new LearnResource("龙国学院", "Spring Boot 教程系列学习", "http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean = new LearnResource("嘟嘟MD独立博客", "Spring Boot干货系列 ", "http://tengj.top/");
        learnList.add(bean);
        bean = new LearnResource("后端编程嘟", "Spring Boot教程和视频 ", "http://www.toutiao.com/m1559096720023553/");
        learnList.add(bean);
        bean = new LearnResource("程序猿DD", "Spring Boot系列", "http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean = new LearnResource("纯洁的微笑", "Spring Boot系列文章", "http://www.ityouknow.com/spring-boot");
        learnList.add(bean);
        bean = new LearnResource("CSDN——小当博客专栏", "Spring Boot学习", "http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean = new LearnResource("梁桂钊的博客", "Spring Boot 揭秘与实战", "http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean = new LearnResource("林祥纤博客系列", "从零开始学Spring Boot ", "http://412887952-qq-com.iteye.com/category/356333");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }


    @RequestMapping("/learn/1")
    public ModelAndView index1() {
        List<LearnResource> learnList = new ArrayList<LearnResource>();
        LearnResource bean = new LearnResource("官方参考文档", "Spring Boot Reference Guide", "http://docs.spring.io/spring-boot/docs/1.5.1.RELEASE/reference/htmlsingle/#getting-started-first-application");
        learnList.add(bean);
        bean = new LearnResource("官方SpringBoot例子", "官方SpringBoot例子", "https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples");
        learnList.add(bean);
        bean = new LearnResource("龙国学院", "Spring Boot 教程系列学习", "http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean = new LearnResource("嘟嘟MD独立博客", "Spring Boot干货系列 ", "http://tengj.top/");
        learnList.add(bean);
        bean = new LearnResource("后端编程嘟", "Spring Boot教程和视频 ", "http://www.toutiao.com/m1559096720023553/");
        learnList.add(bean);
        bean = new LearnResource("程序猿DD", "Spring Boot系列", "http://www.roncoo.com/article/detail/125488");
        learnList.add(bean);
        bean = new LearnResource("纯洁的微笑", "Spring Boot系列文章", "http://www.ityouknow.com/spring-boot");
        learnList.add(bean);
        bean = new LearnResource("CSDN——小当博客专栏", "Spring Boot学习", "http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean = new LearnResource("梁桂钊的博客", "Spring Boot 揭秘与实战", "http://blog.csdn.net/column/details/spring-boot.html");
        learnList.add(bean);
        bean = new LearnResource("林祥纤博客系列", "从零开始学Spring Boot ", "http://412887952-qq-com.iteye.com/category/356333");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/template");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }
}
