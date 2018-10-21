package com.imooc.mapper;

import com.imooc.bean.CourseBigType;

import java.util.List;

public interface CourseBigTypeMapper {

    /*---------------------查---------------------*/

    /**
     * 无参查询课程大类
     * @return
     */
    List<CourseBigType> selectBigType();

}