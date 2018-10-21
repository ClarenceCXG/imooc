package com.imooc.mapper;

import com.imooc.bean.Course;
import com.imooc.bean.RoleCourse;

import java.util.List;

public interface RoleCourseMapper {
    /*---------------------增---------------------*/

    /**
     * 添加用户课程
     * @param record
     * @return
     */
    int insert(RoleCourse record);

    /*---------------------删---------------------*/

    /**
     * 根据用户ID删除用户课程
     * @param rid
     * @return
     */
    int deleteByPrimaryKey(Integer rid);

    /*---------------------查---------------------*/

    /**
     * 根据用户ID查询
     * @param rid
     * @return
     */
    List<Course> selectByPrimaryKey(Integer rid);

    /**
     * 根据用户ID查询角色课程
     * @param rid
     * @return
     */
    List<RoleCourse> selectByRid(Integer rid);

    /*---------------------改---------------------*/

    /**
     * 根据用户ID更改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(RoleCourse record);


}