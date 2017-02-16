package com.happyBKs.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuan4j on 2017/2/9.
 */
@RequestMapping("/c3")
@Controller
public class WildcardHandler {
    //    index3.jsp
    //1
    //handle4��handle5���Ե������url��������ӳ�䷽����valueͨ���ʱ�����springmvcѡ��
    @RequestMapping(value = "rq3/**/")
    public String handle4() {
        return "successrm";
    }

    @RequestMapping(value = "rq3/**/hhh")
    public String handle5() {
        return "robot_baymax1";
    }

    //2
    //handle6-8���Ե������url��������ӳ�䷽����valueͨ���ʱ�����springmvcѡ��
    @RequestMapping(value = "rq4/*/bbb")
    public String handle6() {
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq4/**/bbb")
    public String handle7() {
        return "robot_baymax2";
    }

    @RequestMapping(value = "rq5/**/bbb")
    public String handle8() {
        return "robot_baymax2";
    }

    //3
    //handle9-11���Ե������url��������ӳ�䷽����valueͨ���ʱ�����springmvcѡ��
    @RequestMapping(value = "rq6/qqq*")
    public String handle9() {
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq6/qqq?")
    public String handle10() {
        return "robot_baymax3";
    }

    @RequestMapping(value = "rq7/qqq*")
    public String handle11() {
        return "robot_baymax1";
    }

    //4
    //handle12-13���Ե������url��������ӳ�䷽����valueͨ���ʱ�����springmvcѡ��
    @RequestMapping(value = "rq8/**/kkk")
    public String handle12() {
        System.out.print("handle12");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq8/aaa/**")
    public String handle13() {
        System.out.print("handle13");
        return "robot_baymax2";
    }

    @RequestMapping(value = "rq8_bm/bbb/**")
    public String handle12_bm() {
        System.out.print("handle12_bm");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq8_bm/**/mmm")
    public String handle13_bm() {
        System.out.print("handle13_bm");
        return "robot_baymax2";
    }

    //5
    //handle14-15���Ե������url��������ӳ�䷽����valueͨ���ʱ�����springmvcѡ��
    @RequestMapping(value = "rq9/*/kkk/nnn")
    public String handle14() {
        System.out.print("handle14");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq9/aaa/*/*")
    public String handle15() {
        System.out.print("handle15");
        return "robot_baymax2";
    }


    //handle16-17���Ե������url��������ӳ�䷽����valueͨ���ʱ�����springmvcѡ��
    @RequestMapping(value = "rq10/aaa/*/*")
    public String handle16() {
        System.out.print("handle16");
        return "robot_baymax1";
    }

    @RequestMapping(value = "rq10/*/kkk/nnn")
    public String handle17() {
        System.out.print("handle17");
        return "robot_baymax2";
    }
}
