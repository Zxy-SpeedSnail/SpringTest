package com.happyBKs.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yuan4j on 2017/2/9.
 */
@RequestMapping("/c3")
@Controller
public class RMHandler {
    @RequestMapping(value = "/success",method = RequestMethod.POST)
    public String handle() {
        return "successrm";
    }
}
