package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;

import java.util.List;

public interface CourseContentService {

    public List<CourseSection> findSectionAndLessonByCourseId(Integer courseId);

    public Course findCourseByCourseId(int courseId);

    public void saveCourse(CourseSection courseSection);

    public void updateCourse(CourseSection courseSection);

    public void updateSectionStatus(int id,int status);

    public void saveLesson(CourseLesson courseLesson);
}
