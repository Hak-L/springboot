package com.zhisheng.demo1.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhisheng_tian on 2017/9/29.
 */
@ConfigurationProperties(prefix = "com.zhisheng")
public class ConfigBean {
    private String name;
    private String want;
    private String hope;

    public String getHope() {
        return hope;
    }

    public void setHope(String hope) {
        this.hope = hope;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWant() {
        return want;
    }

    public void setWant(String want) {
        this.want = want;
    }
}
