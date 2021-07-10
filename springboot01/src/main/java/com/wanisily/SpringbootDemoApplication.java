package com.wanisily;

import com.wanisily.imports.SpringStartSelector;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 */
@SpringBootApplication
@Import(SpringStartSelector.class)
public class SpringbootDemoApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootDemoApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
