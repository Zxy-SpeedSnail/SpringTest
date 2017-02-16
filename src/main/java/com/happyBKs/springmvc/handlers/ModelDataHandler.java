package com.happyBKs.springmvc.handlers;

import Model.Location;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * Created by yuan4j on 2017/2/10.
 */
@RequestMapping("/model")
@Controller
public class ModelDataHandler {

    /*
     * Ŀ�귽������ֵ����ʹModelAndView����
     * ���԰�����ͼ��ģ����Ϣ
     * SpringMVC���ModelAndView�е�model���ݷ���request������С�
     *
     * ������Ҫע����ǣ���ʵ���������۷���String��ModelAndView��Map���ͣ�SpringMVC�ڲ������Զ�ͳһת��ΪModelAndView
     *
     */
    @RequestMapping("/ModelAndView")
    public ModelAndView handle1()
    {
        String reStr="ModelAndView";
        ModelAndView mv=new ModelAndView(reStr);
        mv.addObject("time", new Date());
        Location loc=new Location();
        loc.setCity("urban");
        loc.setProvince("Shanghai");
        mv.addObject("local", loc);
        return mv;
    }

    /*
	 * Ŀ�귽���������Map���ͣ�ʵ����Ҳ������Model�����ǻ���ModelMap���ͣ��Ĳ���
	 */
    @RequestMapping("/Map")
    public String handle2(Map<String,Object> map)
    {
        String reStr="MapTest";
        map.put("staff", Arrays.asList("happyBKs","hong shu"));
        map.put("luckynumber", Arrays.asList(1,3,5,7,8));

        Location loc1 = new Location();
        loc1.setCity("urban");
        loc1.setProvince("Shanghai");

        Location loc2 = new Location();
        loc2.setCity("county");
        loc2.setProvince("Beijing");
        map.put("addlist", Arrays.asList(loc1, loc2));

        return reStr;
    }
}
