package com.imooc.service;


import com.imooc.bean.CourseSmallType;
import com.imooc.mapper.CourseSmallTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseSmallTypeService {

    @Autowired
    private CourseSmallTypeMapper courseSmallTypeMapper;

    /**
     * 返回课程小类结果集
     * @param cbt_id
     * @return
     */
    public List<CourseSmallType> selectCourseSmallType(Integer cbt_id){
        return courseSmallTypeMapper.selectByCbt_id(cbt_id);
    }
}
