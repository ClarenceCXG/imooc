package com.imooc.service;

import com.imooc.bean.Course;
import com.imooc.bean.TypeCourse;
import com.imooc.mapper.TypeCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCourseService {

    @Autowired
    private TypeCourseMapper typeCourseMapper;

    /**
     * 添加小类课程
     * @param record
     * @return
     */
    public int addTypeCourse(TypeCourse record){
        return typeCourseMapper.insert(record);
    }

    /**
     * 返回课程结果集
     * @param cst_id
     * @return
     */
    public List<Course> selectCourse(Integer cst_id){
        return typeCourseMapper.selectByCst_id(cst_id);
    }
}
