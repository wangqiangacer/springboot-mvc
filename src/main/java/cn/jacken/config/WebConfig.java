package cn.jacken.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @EnableWebMvc 开启mvc功能
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "cn.jacken.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
}
