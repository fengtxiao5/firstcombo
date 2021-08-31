package com.firstcombo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @ClassName FirstComboApplication
 * @Description
 * @Author ftx
 * @Date 2021/8/24 14:15
 * @Version 1.0
 **/
@ServletComponentScan(basePackages = {"com.firstcombo.filter"})
@ImportResource("classpath:spring/applicationContext.xml")
@SpringBootApplication
public class FirstComboApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(FirstComboApplicationStarter.class);
    }
}
