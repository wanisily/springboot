package com.wanisily;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class SpringbootDemoApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootDemoApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
