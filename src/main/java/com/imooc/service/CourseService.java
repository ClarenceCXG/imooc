package com.imooc.service;

import com.imooc.bean.Course;
import com.imooc.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService{

    @Autowired
    private CourseMapper courseMapper;

    /**
     * 添加课程
     * @param course
     * @return
     */
    public int addCourse(Course course){
        return courseMapper.insert(course);
    }

    /**
     * 删除课程
     * @param cname
     * @return
     */
    public int deleteCourse(String cname){
        return courseMapper.deleteByName(cname);
    }

    /**
     * 根据关键字查询课程
     * @param courseKey
     * @return
     */
    public List<Course> selectCourseByKey(String courseKey){
        return courseMapper.selectCourseByKey(courseKey);
    }

    /**
     * 根据课程名返回课程结果集
     * @param cname
     * @return
     */
    public List<Course> selectCourseByName(String cname){
        return courseMapper.selectByName(cname);
    }

    /**
     * 根据价格状态返回课程结果集
     * @param cstatus
     * @return
     */
    public List<Course> selectCourseByCstatus(String cstatus){
        return courseMapper.selectByCstatus(cstatus);
    }

    /**
     * 根据审核状态返回课程结果集
     * @param checkstatus
     * @return
     */
    public List<Course> selectCourseByCheckStatus(String checkstatus){
        return courseMapper.selectByCheckStatus(checkstatus);
    }

    /**
     * 根据课程ID返回课程结果集
     * @param cid
     * @return
     */
    public List<Course> selectCourseByCid(Integer cid){
        return courseMapper.selectByCid(cid);
    }

    /**
     * 更新课程信息
     * @param record
     * @return
     */
    public int updateCourse(Course record){
        return courseMapper.updateByPrimaryKeySelective(record);
    }


}
