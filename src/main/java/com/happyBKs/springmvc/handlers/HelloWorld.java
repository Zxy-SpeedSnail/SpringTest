package com.happyBKs.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuan4j on 2017/2/9.
 */
@Controller
public class HelloWorld {

    //���������Ҫ�ܹ�Ӧ��һ�����󣬼���Ӧindex.jsp������
	/*
	 * 1.ʹ��@RequestMappingע�� ��ӳ�������URL
	 * ���������/happyBKs��index.jsp��href="happyBKs"��Ӧ�������ܹ���Ӧ��
	 *
	 * 2.����ֵ��ͨ����ͼ����������Ϊ������ͼ������InternalResourceViewResolver��ͼ�������������½�����
	 * ͨ�� prefix + returnValue + subfix �ķ�ʽ�õ�������ͼ��Ȼ����ת������
	 *
	 * /views/baymax.jsp
	 *
	 */
    @RequestMapping("/happyBKs")
    public String hello()
    {
        System.out.println("hello, springMVC!");
        return "baymax";
    }

    //������һ��baymax����Ӧ���ĸ�ҳ���أ�����Ҫ��springmvc.xml��������ͼ����
}
