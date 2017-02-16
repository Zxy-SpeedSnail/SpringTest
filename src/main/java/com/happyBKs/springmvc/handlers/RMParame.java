package com.happyBKs.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuan4j on 2017/2/10.
 */
@RequestMapping("/c3")
@Controller
public class RMParame {
    //    index4.jsp
    @RequestMapping(value = "p1/{id}")
    public String handleP1(@PathVariable("id") int pid) {
        System.out.println(pid + "+100=" + (pid + 100));
        return "successrm";
    }
}
