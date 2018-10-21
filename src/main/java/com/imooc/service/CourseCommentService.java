package com.imooc.service;

import com.imooc.bean.CourseComment;
import com.imooc.mapper.CourseCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseCommentService {

    @Autowired
    private CourseCommentMapper courseCommentMapper;

    /**
     * 添加课程评论
     * @param record
     * @return
     */
    public int addCourseComment(CourseComment record){
        return courseCommentMapper.insert(record);
    }

    /**
     * 返回课程评论结果集
     * @param cid
     * @return
     */
    public List<CourseComment> selectCourseComment(Integer cid){
        return courseCommentMapper.selectByCid(cid);
    }



}
