package com.zz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.pojo.Course;
import com.zz.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("after/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("findAllCourse")
    public List<Course> findAllCourse(){
        return courseService.findAllCourse();
    }

    @RequestMapping("findAllCourse1")
    public Map findAllCourse(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Course> courses = courseService.findAllCourse();

//        System.out.println(courses.toString());
        PageInfo<Course> pageInfo = new PageInfo<>(courses);

        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());//总记录数
        map.put("data",pageInfo.getList());
        return map;

    }
    @RequestMapping("addCourse")
    public int addCourse(Course course){
        return courseService.addCourse(course);
    }

    @RequestMapping("deleteById")
    public int deleteById(Integer id){
        return courseService.deleteById(id);
    }


    @RequestMapping("deleteByIds")
    public int deleteByIds(Integer[] ids){
        return courseService.deleteByIds(ids);
    }

    @RequestMapping("updateCourse")
    public int updateCourse(Course course){

        System.out.println(course);
        return courseService.updateCourse(course);
    }



}
