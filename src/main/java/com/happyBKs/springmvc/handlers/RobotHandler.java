package com.happyBKs.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuan4j on 2017/2/9.
 */
    /*
1.@RequestMapping�������η�������������������
�ඨ�崦���ṩ����������ӳ����Ϣ�������webӦ�õĸ�Ŀ¼
�������崦����һ���ṩϸ�ֵ�ӳ����Ϣ��������ඨ�崦��URL�����ඨ�崦û�б�ע@RequestMapping���򷽷�����@RequestMappingֱ�Ӷ�Ӧ��webӦ�õĸ�Ŀ¼

���󣺣���վ����+webӦ������webӦ�ø�Ŀ¼+�ඨ�崦@RequestMapping+�������崦@RequestMapping
ӳ�䵽
������ͼ��webapp��Ŀ¼+springmvc.xml���õ�prefix+ �����������ķ���ֵ +springmvc.xml���õ�sufix


����Ļ���
����http://localhost:8080/mymvc/c1/m1
ӳ�䵽
������ͼwebapp/views/robot_baymax1.jsp��ͨ���������ϵ�


ӳ������ǣ�DispatchServlet�ڽػ������@RequestMapping�ṩ��ӳ����Ϣȷ����������Ӧ�ԵĴ�������
*/
@RequestMapping("/c1")
@Controller
public class RobotHandler {
//    index2.jsp

    @RequestMapping("/m1")
    String handle1() {
        return "robot_baymax1";
    }

    @RequestMapping("/m2")
    String handle2() {
        return "robot_baymax2";
    }


    @RequestMapping("/m3")
    String handle3() {
        return "robot_baymax3";
    }
}
