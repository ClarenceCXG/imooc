package com.imooc.mapper;

import com.imooc.bean.CourseComment;

import java.util.List;

public interface CourseCommentMapper {
    /*---------------------增---------------------*/

    /**
     * 生成课程评论
     * @param record
     * @return
     */
    int insert(CourseComment record);


    /*---------------------查---------------------*/

    /**
     * 根据课程ID查询课程评论
     * @param cid
     * @return
     */
    List<CourseComment> selectByCid(Integer cid);

}