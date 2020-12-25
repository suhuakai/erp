package com.web.consumables.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = "com.web" )
@MapperScan(basePackages = "com.web.**.dao")
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@EnableTransactionManagement(proxyTargetClass = true)
public class WebConsumablesBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebConsumablesBizApplication.class, args);
	}

}
