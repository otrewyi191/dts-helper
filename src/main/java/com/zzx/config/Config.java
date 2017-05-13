package com.zzx.config;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Configuration
@ComponentScan(basePackages = "com.zzx")
public class Config {

    @Bean
    public Regex getRegex() {
        return new Regex("DTS\\d{9}");
    }
}
