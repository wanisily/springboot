package com.wanisily.domain;

import lombok.Data;

@Data
public class Pig {
    private Integer age;
    private String name;
    //yml 使用last-name,last_name,lastName,LAST_NAME都可以映射过来，推荐last-name
    private String lastName;
    private Dog dog;

    public Pig(Integer age, String name, String lastName, Dog dog) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.dog = dog;
    }

    public Pig(){
    }
}
