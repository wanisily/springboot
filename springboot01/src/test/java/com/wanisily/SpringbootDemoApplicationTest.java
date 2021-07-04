package com.wanisily;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSON;
import com.wanisily.config.PasswordConfig;
import com.wanisily.prop.People;
import com.wanisily.prop.Properties;
import com.wanisily.prop.PropertiesYml;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
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

    @Test
    public void testPro(){
        System.err.println(JSON.toJSONString(properties));
    }

    @Test
    public void testPeo(){
        System.err.println(JSON.toJSONString(people));
    }

    @Test
    public void testPassword(){
        System.err.println(bCryptPasswordEncoder  + "=======err=====");
        passwordConfig.get();
    }

    @Test
    public void testEnv(){
        System.err.println(env.getProperty("person.username"));
        System.err.println(env.getProperty("person.age"));
        System.err.println(env.getProperty("person.boss"));
        System.err.println(env.getProperty("person.ere00") + "==========================");
    }
}
