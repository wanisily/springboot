package com.wanisily.annotations;

import com.wanisily.config.AppConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(AppConfig.class)
public @interface MyEnableAppConfigAnnotation {


}
