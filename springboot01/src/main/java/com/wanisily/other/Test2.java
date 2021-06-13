package com.wanisily.other;

import org.springframework.stereotype.Component;

@Component
public class Test2 {

    private Test1 test1;
    public Test2(Test1 test1){
        this.test1 = test1;
    }

    public void sys(){
        System.out.println(test1);
    }
}
