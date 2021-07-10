package com.wanisily;

import com.alibaba.fastjson.JSON;
import com.wanisily.annotations.MyEnableAppConfigAnnotation;
import com.wanisily.config.AppConfig;
import com.wanisily.config.PasswordConfig;
import com.wanisily.domain.Pig;
import com.wanisily.imports.SpringStartSelector;
import com.wanisily.prop.People;
import com.wanisily.prop.Properties;
import com.wanisily.prop.PropertiesYml;
import com.wanisily.service.impl.HelloServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Import({HelloServiceImpl.class/*, SpringStartSelector.class*/})
@MyEnableAppConfigAnnotation
public class SpringbootDemoApplicationTest {
    @Autowired
    private PropertiesYml propertiesYml;

    @Autowired
    private Properties properties;

    @Autowired
    private People people;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private PasswordConfig passwordConfig;

    @Autowired
    private Environment env;

    @Autowired
    private ConfigurableEnvironment configurableEnvironment;

    @Value("${people.username}")
    private String peopleUserName;

    @Autowired
    private Pig pig;

    /**
     * 通过@Import注解注入
     */
    @Autowired
    private HelloServiceImpl helloServiceImpl;

    /**
     * 通过@Import注解注入
     */
    @Autowired
    private AppConfig appConfig;

    @Test
    public void shouldAnswerWithTrue() {

        System.out.println(JSON.toJSONString(propertiesYml));
        System.out.println("===============");
        for (Map<String, String> map : propertiesYml.getLists()) {
            for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
                System.out.println(stringStringEntry.getKey() + ":::"+ stringStringEntry.getValue());
            }
        }
    }

    /**
     * 测试yml中引入配置
     */
    @Test
    public void testPro(){
        System.err.println(JSON.toJSONString(properties));
    }

    /**
     * 测试单独引入people.properties
     */
    @Test
    public void testPeo(){
        System.err.println(JSON.toJSONString(people));
    }

    @Test
    public void testPassword(){
        System.err.println(bCryptPasswordEncoder  + "=======err=====");
        passwordConfig.get();
    }

    /**
     * 测试Env
     */
    @Test
    public void testEnv(){
        System.out.println(JSON.toJSONString(env));
        /*System.err.println(env.getProperty("person.username"));
        System.err.println(env.getProperty("person.age"));
        System.err.println(env.getProperty("person.boss"));
        System.err.println(env.getProperty("spring.cloud.client.ip-address") + "==========================");*/
    }

    /**
     * 测试ConfigurableEnvironment
     */
    @Test
    public void testConfigurableEnvironment(){
        System.err.println(JSON.toJSONString(configurableEnvironment)  + ">>");
    }

    /**
     * 测试 @value(${})
     */
    @Test
    public void testPeopleProperties(){
        System.err.println(peopleUserName);
    }

    /**
     * 测试BeanConfigProperties的使用
     * pig在config中实例化，并加上 ConfigurationProperties(prefix=”“) 注解
     */
    @Test
    public void TestBeanConfigProperties(){
        System.err.println(helloServiceImpl  + "===============");
        System.out.println(JSON.toJSONString(pig));
    }

    @Test
    public void test(){
        System.out.println(appConfig.getClass()   +"  ============");
    }
}
