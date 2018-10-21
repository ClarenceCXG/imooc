package com.imooc.service;

import com.imooc.bean.Course;
import com.imooc.bean.RoleCourse;
import com.imooc.mapper.RoleCourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleCourseService {

    @Autowired
    private RoleCourseMapper roleCourseMapper;

    /**
     * 添加角色课程
     * @param record
     * @return
     */
    public int addRoleCourse(RoleCourse record){
        return roleCourseMapper.insert(record);
    }

    /**
     * 删除角色课程
     * @param rid
     * @return
     */
    public int deleteRoleCourse(Integer rid){
        return roleCourseMapper.deleteByPrimaryKey(rid);
    }

    /**
     * 返回课程结果集
     * @param rid
     * @return
     */
    public List<Course> selectCourseByRid(Integer rid){
        return roleCourseMapper.selectByPrimaryKey(rid);
    }

    /**
     * 返回角色课程结果集
     * @param rid
     * @return
     */
    public List<RoleCourse> selectRoleCourseByRid(Integer rid){
        return roleCourseMapper.selectByRid(rid);
    }

    /**
     * 更新角色课程信息
     * @param record
     * @return
     */
    public int updateRoleCourse(RoleCourse record){
        return roleCourseMapper.updateByPrimaryKeySelective(record);
    }
}
