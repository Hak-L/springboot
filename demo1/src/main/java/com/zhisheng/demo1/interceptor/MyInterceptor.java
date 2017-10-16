package com.zhisheng.demo1.interceptor;

import com.zhisheng.demo1.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhisheng_tian on 2017/10/16.
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //简单实现了根据session中是否有User对象来判断是否登录，为空就跳转到登录页，不为空就通过
        boolean flag = true;
        User user = (User) httpServletRequest.getSession().getAttribute("user");
        if (null == user) {
            httpServletResponse.sendRedirect("login");
            flag = false;
        } else {
            flag = true;
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
