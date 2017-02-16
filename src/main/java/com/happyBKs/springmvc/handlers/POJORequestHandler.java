package com.happyBKs.springmvc.handlers;

import Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuan4j on 2017/2/10.
 */
@RequestMapping("/class")
@Controller
public class POJORequestHandler {

    //    index7.jsp
    @RequestMapping("/boy")
    public String handle(Person person) {
        System.out.println(person.toString());
        return "successrm";
    }
}
