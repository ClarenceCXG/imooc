package com.imooc.service;

import com.imooc.bean.CourseBigType;
import com.imooc.mapper.CourseBigTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseBigTypeService {

    @Autowired
    private CourseBigTypeMapper courseBigTypeMapper;

    /**
     * 返回课程大类结果集
     * @return
     */
    public List<CourseBigType> selectCourseBigType(){
        return courseBigTypeMapper.selectBigType();
    }
}
