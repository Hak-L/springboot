package com.zhisheng.demo1;

import com.zhisheng.demo1.domain.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication	// same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableConfigurationProperties(ConfigBean.class)
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
