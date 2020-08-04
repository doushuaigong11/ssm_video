package com.zz.service.impl;

import com.zz.dao.CourseMapper;
import com.zz.pojo.Course;
import com.zz.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAllCourse() {
        return courseMapper.selectByExampleWithBLOBs(null);
    }

    @Override
    public int addCourse(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public int deleteById(Integer id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(Integer[] ids) {
        return courseMapper.deleteByIds(ids);
    }

    @Override
    public int updateCourse(Course course) {
        return courseMapper.updateByPrimaryKey(course);
    }
}
