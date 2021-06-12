package com.wanisily.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//如果是application.properties中的属性，可以直接这样
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Properties {

    private String username;
    private Integer age;
}
