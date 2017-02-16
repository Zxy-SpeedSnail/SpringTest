package com.happyBKs.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yuan4j on 2017/2/10.
 */
@RequestMapping("/rest")
@Controller
public class RestTestHandler {
//    index5.jsp

	/*
     * Rest ����Url        ԭ��������������ķ��
	 * ��CRUDΪ��
	 * ������ /order POST
	 * �޸ģ�/order/1 Put 		update?id=1
	 * ��ȡ��/order/1 GET 		get?id=1
	 * ɾ����/order/1 DELETE		delete?id=1
	 *
	 * ��η���PUT�����DELETE����
	 * 1.��Ҫ����HiddenHttpMethodFilter
	 * 2.��Ҫ����POST����
	 * 3.��Ҫ�ڷ���POST����ʱЯ��һ��name=��_method����������ֵΪDELETE��PUT
	 *
	 * ��SpringMVC��Ŀ�귽������εõ�id�أ�
	 * ʹ��@PathVariableע��
	 */


    @RequestMapping(value = "/methodstest/{id}", method = RequestMethod.GET)
    public String restGet(@PathVariable int id)//��@PathVariableû�б���{id}��
    {
        System.out.println("get " + id);
        System.out.println("querry operations...");
        return "querry";
    }

    @RequestMapping(value = "/methodstest", method = RequestMethod.POST)
    public String restPost() {
        System.out.println("post ");
        System.out.println("post operations...");
        return "post";
    }

    @RequestMapping(value = "/methodstest/{id}", method = RequestMethod.PUT)
    public String restPut(@PathVariable int id) {
        System.out.println("put " + id);
        System.out.println("put operations...");
        return "put";
    }

    @RequestMapping(value = "/methodstest/{id}", method = RequestMethod.DELETE)
    public String restDelete(@PathVariable int id) {
        System.out.println("delete " + id);
        System.out.println("delete operations...");
        return "delete";
    }
}
