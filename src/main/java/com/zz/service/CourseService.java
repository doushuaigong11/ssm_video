package com.zz.service;

import com.zz.pojo.Course;

import java.util.List;

public interface CourseService {
    List<Course> findAllCourse();

    int addCourse(Course course);

    int deleteById(Integer id);

    int deleteByIds(Integer[] ids);

    int updateCourse(Course course);
}
