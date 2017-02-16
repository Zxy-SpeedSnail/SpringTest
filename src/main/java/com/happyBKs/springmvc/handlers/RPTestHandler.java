package com.happyBKs.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yuan4j on 2017/2/10.
 */
@RequestMapping("/class")
@Controller
public class RPTestHandler {

    @RequestMapping("/student")
//    required=false  可为空值
//    int是基本数据类型，无法为空，所以报错。解决办法是将int改为Integer
//    如果我们仍然想用基本类型作为参数类型，那么可以用到@RequestParam注解的defaultValue属性来指定默认值。defaultValue="0"
    public String hundle(@RequestParam(value = "username") String un, @RequestParam(value = "age", required = false) Integer age) {
        System.out.println("a student's request has come. username: " + un + ", age: " + age);
        return "successrm";
    }

    /*映射请求头
     */
    @RequestMapping("testhead")
    public String handleRH(@RequestHeader(value = "Accept-language") String head) {
        System.out.println("Request Head Accept-language:" + head);
        return "successrm";
    }

    //    映射Cookie
    @RequestMapping("testCookie")
    public String handleCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println("Request CookieValue JSESSIONID:" + cookie);
        return "successrm";
    }

}

