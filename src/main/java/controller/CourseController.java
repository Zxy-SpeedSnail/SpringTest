package controller;

import Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.CourseService;

import java.util.Map;

/**
 * Created by yuan4j on 2017/2/16.
 */
@Controller
@RequestMapping("/courses")
// /courses/**
public class CourseController {


    //�����־��Ϣ
//    private static Logger log= LoggerFactory.getLogger(CourseController.class);

    private CourseService courseService;

    //ʹ��spring�����������˶�Ӧ��������ϵ
    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //�ṩ���һ��ҵ��ķ��������ݿγ�ID��ѯ�γ����ݡ�
    //������������ /courses/view?courseId=123 ��ʽ��URL
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Map<String, Object> map) {
        //��־������鿴�����courseId�ǲ������ǵ�courseId
//        log.debug("In viewCourse, courseId = {}", courseId);
        Course course = courseService.getCoursebyId(courseId);
        map.put("course",course);
        return "course_overview";
    }
}

