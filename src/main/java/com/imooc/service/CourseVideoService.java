package com.imooc.service;


import com.imooc.bean.CourseVideo;
import com.imooc.mapper.CourseVideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseVideoService {

    @Autowired
    private CourseVideoMapper courseVideoMapper;

    /**
     * 添加课程视频目录
     * @param record
     * @return
     */
    public int addCourseVideo(CourseVideo record){
        return courseVideoMapper.insert(record);
    }

    /**
     * 返回课程视频目录结果集
     * @param cid
     * @return
     */
    public List<CourseVideo> selectCourseVideo(Integer cid){
        return courseVideoMapper.selectByCid(cid);
    }

    /**
     * 更新课程视频目录信息
     * @param record
     * @return
     */
    public int updateCourseVideo(CourseVideo record){
        return courseVideoMapper.updateByPrimaryKeySelective(record);
    }
}
