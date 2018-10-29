package com.imooc.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imooc.bean.Course;
import com.imooc.service.CourseService;
import com.imooc.util.JsonMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CourseController {

    @Autowired
    CourseService courseService;

    public JsonMsg selectCourse(HttpServletRequest request, HttpSession session){
        String courseKey = request.getParameter("courseKey");
        List<Course> courseList = courseService.selectCourseByKey(courseKey);
        //（传入页码 每页大小）
        PageHelper.startPage(1,10);
        PageInfo pageInfo = new PageInfo(courseList,5);
        return JsonMsg.success().addInfo("pageInfo",pageInfo);
    }
}
