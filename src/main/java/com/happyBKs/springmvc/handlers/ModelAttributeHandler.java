package com.happyBKs.springmvc.handlers;

import Model.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by yuan4j on 2017/2/10.
 */
@RequestMapping("/ModelAttribute")
@Controller
public class ModelAttributeHandler {

    @RequestMapping("/userma")
    public String handle(UserBean user)
    {
        String returnStr="modelAttributeTest1";
        System.out.println("updating "+user);
        return returnStr;
    }

    /*
     * ����@ModelAttributeע���ǵķ���������ÿ��Ŀ�귽��ִ��֮ǰ��SpringMVC����
     *
     * ���й��̣�
     * 1. ִ��@ModelAttributeע�����εķ����������ݿ�ȡ�����󣬰Ѷ������Map�С���ΪuserBean
     * 2. SpringMVC��Map��ȡ��UserBean���󣬲������еĲ�������UserBean�����Ӧ������
     * 3. SpringMVC������������Ŀ�귽������
     *
     * ע�⣺��@ModelAttribute�����У�����Map�ļ������������͵ĵ�һ����ĸСд���ַ���һ�¡�
     *
     */
    @ModelAttribute
    public void getUser(@RequestParam(value="id",required=false)Integer id, Map<String,Object> map)
    {
        System.out.println("calling @ModelAttribute getUser");
        if(id!=null)//ע�⣺�����int id�Ͳ��ܹ���==null���ж���
        {
            UserBean user=new UserBean(1,"happyBKs","12345678",200);
            System.out.println("�����ݿ��л�ȡ����"+user);
            map.put("userBean", user);
        }
    }

}

