package com.zhisheng.demo1.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by zhisheng_tian on 2017/9/29.
 */
@Configuration
@ConfigurationProperties(prefix = "com.sheng")
@PropertySource("classpath:test.properties")
public class ConfigTestBean {
    private String name;
    private String want;

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
