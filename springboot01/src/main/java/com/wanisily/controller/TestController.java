package com.wanisily.controller;

import com.wanisily.other.Test2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private Test2 test2;

    @GetMapping("/testConstruct")
    public void test(){
        test2.sys();
    }

    @GetMapping("/testDevTool")
    @ResponseBody
    public String testDevTool(){
        return "deveString，你好";
    }

}
