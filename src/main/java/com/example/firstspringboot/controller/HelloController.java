package com.example.firstspringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: sunwenwu
 * @Date: 2018/10/17 11：44
 * @Description:
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);


    //访问/hello或者/hi任何一个地址，都会返回一样ss的结果
    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        logger.info("log test...");
        return "hi you!!!";
    }
}

