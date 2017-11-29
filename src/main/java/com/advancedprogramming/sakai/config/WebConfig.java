package com.advancedprogramming.sakai.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.advancedprogramming.sakai.filter.FrontFilter;

@Configuration
public class WebConfig {

  @Bean
  public Filter frontFilter() {
    return new FrontFilter();
  }
}