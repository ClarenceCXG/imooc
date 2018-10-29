package com.imooc.mapper;

import com.imooc.bean.Course;

import java.util.List;

public interface CourseMapper {

    /*---------------------增---------------------*/

    /**
     * 添加课程
     * @param record
     * @return
     */
    int insert(Course record);


    /*---------------------删---------------------*/

    /**
     * 根据课程名删除课程
     * @param cname
     * @return
     */
    int deleteByName(String cname);


    /*---------------------查---------------------*/

    /**
     * 根据关键字查询课程
     * @param courseKey
     * @return
     */
    List<Course> selectCourseByKey(String courseKey);

    /**
     * 根据课程名字查询
     * @param cname
     * @return
     */
    List<Course> selectByName(String cname);

    /**
     * 根据价格状态查询
     * @param cstatus
     * @return
     */
    List<Course> selectByCstatus(String cstatus);

    /**
     * 根据审核状态查询
     * @param checkstatus
     * @return
     */
    List<Course> selectByCheckStatus(String checkstatus);

    /**
     * 根据课程ID查询课程
     * @param cid
     * @return
     */
    List<Course> selectByCid(Integer cid);


    /*---------------------改---------------------*/

    /**
     * 更改课程信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Course record);








}