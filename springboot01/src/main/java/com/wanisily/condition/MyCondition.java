package com.wanisily.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author by wanxing
 * @description 自定义一个condition
 * @date 2021/7/14 17:05
 */
public class MyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return "true".equalsIgnoreCase(conditionContext.getEnvironment().getProperty("enable.mycondition"));
    }
}
