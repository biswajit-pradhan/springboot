package com.product.app.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.product.app.main.controller,com.product.app.main.service"})
public class ServletConfig implements WebMvcConfigurer{

}
