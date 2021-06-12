package com.wanisily;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSON;
import com.wanisily.prop.People;
import com.wanisily.prop.Properties;
import com.wanisily.prop.PropertiesYml;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
        System.out.println(JSON.toJSONString(properties));
    }

    @Test
    public void testPeo(){
        System.out.println(JSON.toJSONString(people));
    }

}
