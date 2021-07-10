package com.wanisily.domain;

import lombok.Data;

@Data
public class Pig {
    private Integer age;
    private String name;
    //yml 使用last-name,last_name,lastName,LAST_NAME都可以映射过来，推荐last-name
    private String lastName;
}
