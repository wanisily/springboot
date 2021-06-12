package com.wanisily;

import static org.junit.Assert.assertTrue;

import com.alibaba.fastjson.JSON;
import com.wanisily.prop.Properties;
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
    private Properties properties;
    @Test
    public void shouldAnswerWithTrue() {

        System.out.println(JSON.toJSONString(properties));
        System.out.println("===============");
        for (Map<String, String> map : properties.getLists()) {
            for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
                System.out.println(stringStringEntry.getKey() + ":::"+ stringStringEntry.getValue());
            }
        }
    }
}
