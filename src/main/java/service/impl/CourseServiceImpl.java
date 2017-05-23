package service.impl;

import Model.Chapter;
import Model.Course;
import org.springframework.stereotype.Service;
import service.CourseService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuan4j on 2017/2/10.
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {
    public Course getCoursebyId(Integer courseId) {
        Course course = new Course();

        course.setCourseId(courseId);
        course.setTitle("springMVC�ʼ�ϵ��");
        course.setImgPath("/imgs/3.jpg");
        course.setLearningNum(12345);
        course.setLevel(2);
        course.setLevelDesc("�м�");
        course.setDuration(7200l);
        course.setDescr("springMVC����������");

        List<Chapter> chapterList = new ArrayList<Chapter>();

        warpChapterList(courseId,chapterList);

        course.setChapterList(chapterList);

        return course;
    }

    private void warpChapterList(Integer courseId,List<Chapter> chapterList) {
        Chapter chapter = new Chapter();
        chapter.setId(1);
        chapter.setCourseId(courseId);
        chapter.setOrder(1);
        chapter.setTitle("��1�� ʲôspringMVC");
        chapter.setDescr("�˴���ȥ1����");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(2);
        chapter.setCourseId(courseId);
        chapter.setOrder(2);
        chapter.setTitle("��2�� �����");
        chapter.setDescr("�˴���ȥ2����");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(3);
        chapter.setCourseId(courseId);
        chapter.setOrder(3);
        chapter.setTitle("��3�� ǰ�˿�����");
        chapter.setDescr("�˴���ȥ3����");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(4);
        chapter.setCourseId(courseId);
        chapter.setOrder(4);
        chapter.setTitle("��4�� spring�����Ļ�������");
        chapter.setDescr("�˴���ȥ4����");
        chapterList.add(chapter);

        chapter = new Chapter();
        chapter.setId(5);
        chapter.setCourseId(courseId);
        chapter.setOrder(5);
        chapter.setTitle("��5�� ʾ��");
        chapter.setDescr("�˴���ȥ5����");
        chapterList.add(chapter);
    }
}
