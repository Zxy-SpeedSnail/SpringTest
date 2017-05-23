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


    //完成日志信息
//    private static Logger log= LoggerFactory.getLogger(CourseController.class);

    private CourseService courseService;

    //使用spring容器管理里了对应的依赖关系
    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    //提供完成一个业务的方法：根据课程ID查询课程内容。
    //本方法将处理 /courses/view?courseId=123 形式的URL
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Map<String, Object> map) {
        //日志输出，查看请求的courseId是不是我们的courseId
//        log.debug("In viewCourse, courseId = {}", courseId);
        Course course = courseService.getCoursebyId(courseId);
        map.put("course",course);
        return "course_overview";
    }
}

