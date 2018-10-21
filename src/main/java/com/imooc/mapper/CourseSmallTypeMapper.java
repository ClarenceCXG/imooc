package com.imooc.mapper;

import com.imooc.bean.CourseSmallType;

import java.util.List;

public interface CourseSmallTypeMapper {

    /*---------------------查---------------------*/

    /**
     * 根据大类ID查询
     * @param cbt_id
     * @return
     */
    List<CourseSmallType> selectByCbt_id(Integer cbt_id);


}