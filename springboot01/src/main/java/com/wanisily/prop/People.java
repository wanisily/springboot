package com.wanisily.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "people")
//如果不是在application.properties,或者application.yml下的，需要手动引入properties文件
@PropertySource("classpath:people.properties")
@Component
@Data
public class People {

    private String username;
    private int age;
}
