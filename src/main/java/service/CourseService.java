package service;

import Model.Course;
import org.springframework.stereotype.Service;

/**
 * Created by yuan4j on 2017/2/10.
 */
@Service
public interface CourseService {
    Course getCoursebyId(Integer courseId);
}
