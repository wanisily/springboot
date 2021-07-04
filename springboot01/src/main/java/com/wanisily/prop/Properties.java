package com.wanisily.prop;

import com.wanisily.domain.Dog;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

//如果是application.properties中的属性，可以直接这样
@ConfigurationProperties(prefix = "person")
@Component
@Data
public class Properties {

    private String username;
    private Integer age;
    private boolean boss;
    //单独定义时间的格式，spingboot默认格式是yyyy/MM/dd HH:mm:ss 可以定义全局的时间格式
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private Date graduateTime;
    private Map<String,String> map;
    private List<String> list;
    private List<String> list1;
    private List<String> list2;
    private Dog dog;

}
