package com.wanisily.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author by wanxing
 * @description 测试通过自定义condition
 * @date 2021/7/14 17:10
 */
@Component
@Conditional(MyCondition.class)
public class MyConditionBean {
    
}
