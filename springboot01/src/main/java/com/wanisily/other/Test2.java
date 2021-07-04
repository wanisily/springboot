package com.wanisily.other;

import org.springframework.stereotype.Component;

@Component
public class Test2 {

    private Test1 test1;

    /**
     * Test1已经扫描进入容器，所以spring在创建Test2实例的时候，就能把Test1通过构造方法的形式注入到Test2中
     * @param test1
     */
    public Test2(Test1 test1){
        this.test1 = test1;
    }

    public void sys(){
        System.out.println(test1);
    }
}
