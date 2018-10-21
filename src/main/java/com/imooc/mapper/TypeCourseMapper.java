package com.imooc.mapper;

import com.imooc.bean.Course;
import com.imooc.bean.TypeCourse;

import java.util.List;

public interface TypeCourseMapper {

    /*---------------------增---------------------*/

    /**
     * 生成小类课程数据
     * @param record
     * @return
     */
    int insert(TypeCourse record);


    /*---------------------查---------------------*/

    /**
     * 根据小类ID查询课程
     * @param cst_id
     * @return
     */
    List<Course> selectByCst_id(Integer cst_id);

}