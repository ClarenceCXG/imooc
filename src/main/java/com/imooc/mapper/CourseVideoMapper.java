package com.imooc.mapper;

import com.imooc.bean.CourseVideo;

import java.util.List;

public interface CourseVideoMapper {
    /*---------------------增---------------------*/

    /**
     * @param record
     * @return
     */
    int insert(CourseVideo record);

    /*---------------------查---------------------*/

    /**
     * 根据课程ID查询课程目录表
     * @param cid
     * @return
     */
    List<CourseVideo> selectByCid(Integer cid);

    /*---------------------改---------------------*/

    /**
     *更新课程目录信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CourseVideo record);


}