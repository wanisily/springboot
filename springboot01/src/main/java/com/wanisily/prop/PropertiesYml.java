package com.wanisily.prop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "test")
@Component
@Data
public class PropertiesYml {

    private Map<String, String> map;

    private List<String> list;

    private Map<String,List<String>> maps;

    private List<Map<String,String>> lists;

    private String str;

}
