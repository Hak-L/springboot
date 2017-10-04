package com.zhisheng.demo1;

import com.zhisheng.demo1.domain.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication	// same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableConfigurationProperties(ConfigBean.class)
public class Demo1Application implements EmbeddedServletContainerCustomizer
{

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8082);    //设置端口为 8082
	}
}
