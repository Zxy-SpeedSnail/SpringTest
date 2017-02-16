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
//    required=false  ��Ϊ��ֵ
//    int�ǻ����������ͣ��޷�Ϊ�գ����Ա�������취�ǽ�int��ΪInteger
//    ���������Ȼ���û���������Ϊ�������ͣ���ô�����õ�@RequestParamע���defaultValue������ָ��Ĭ��ֵ��defaultValue="0"
    public String hundle(@RequestParam(value = "username") String un, @RequestParam(value = "age", required = false) Integer age) {
        System.out.println("a student's request has come. username: " + un + ", age: " + age);
        return "successrm";
    }

    /*ӳ������ͷ
     */
    @RequestMapping("testhead")
    public String handleRH(@RequestHeader(value = "Accept-language") String head) {
        System.out.println("Request Head Accept-language:" + head);
        return "successrm";
    }

    //    ӳ��Cookie
    @RequestMapping("testCookie")
    public String handleCookieValue(@CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println("Request CookieValue JSESSIONID:" + cookie);
        return "successrm";
    }

}

