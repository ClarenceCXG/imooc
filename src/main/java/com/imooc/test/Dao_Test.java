package com.imooc.test;

/*
 * 推荐spring项目使用spring的单元测试，可以自动注入需要的组件
 * 1、导入SpringTest模块
 * 2、@ContextConfiguration指定spring配置文件的位置
 * 3、直接@Autowired要使用的组件
 */


import com.imooc.bean.*;
import com.imooc.mapper.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class Dao_Test {

    Timestamp startTime=Timestamp.valueOf("2018-10-20 12:30:30");

    //用来批量插入操作
    @Autowired
    SqlSession sqlSession;

    @Autowired
    CourseBigTypeMapper courseBigTypeMapper;

    @Autowired
    CourseCommentMapper courseCommentMapper;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CourseSmallTypeMapper courseSmallTypeMapper;

    @Autowired
    CourseVideoMapper courseVideoMapper;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    RoleCourseMapper roleCourseMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    TypeCourseMapper typeCourseMapper;




    @Test
    public void testRoleMapper() {

        System.out.println("hello");
        List<Role> r = roleMapper.selectByName("测试人员1");
        Role rr = r.get(0);
        rr.display();
        rr.setRintroduce("我是测试人员");
        roleMapper.updateByPrimaryKeySelective(rr);
        System.out.println("bye-bye");
    }

    @Test
    public void testCourseMapper() {

        System.out.println("hello");
        List<Course> r = courseMapper.selectByName("Java进阶");
        r.get(0).display();

        r = courseMapper.selectCourseByKey("Java");
        for (int i =0;i < r.size();i++){
            r.get(i).display();
        }

        System.out.println("bye-bye");
    }

    @Test
    public void testOrderMapper() {

        System.out.println("hello");
        /*
        Order o = new Order();
        o.setRid(1);
        o.setCid(1);
        o.setOnumber("u120181020123030000");
        o.setOtime(startTime);
        o.setOstatus("F");
        orderMapper.insert(o);*/
        List<Order> o = orderMapper.selectByRid(1);
        o.get(0).display();
        o.get(0).setOstatus("U");
        o.get(0).display();
        orderMapper.updateByPrimaryKeySelective(o.get(0));
        System.out.println("bye-bye");
    }

    @Test
    public void testRoleCourseMapper() {

//        System.out.println("hello RoleCourseMapper");
//        RoleCourse rc = new RoleCourse();
//        rc.setRid(6);
//        rc.setCid(1);
//        rc.setUcStatus(1);
//        roleCourseMapper.insert(rc);
//        System.out.println("bye-bye");
        List<RoleCourse> r = roleCourseMapper.selectByRid(6);
        r.get(0).display();
        r.get(0).setUcStatus(2);
        roleCourseMapper.updateByPrimaryKeySelective(r.get(0));
        r.get(0).display();
        /**
         * 根据用户ID查询角色课程
         * @param rid
         * @return
         */
        List<Course> c =roleCourseMapper.selectByPrimaryKey(6);
        c.get(0).display();
    }

    @Test
    public void testCourseBigTypeMapper() {

//        System.out.println("hello RoleCourseMapper");
//        RoleCourse rc = new RoleCourse();
//        rc.setRid(6);
//        rc.setCid(1);
//        rc.setUcStatus(1);
//        roleCourseMapper.insert(rc);
//        System.out.println("bye-bye");
        List<CourseBigType> r = courseBigTypeMapper.selectBigType();
        for (int i = 0;i < r.size() ; i++) {
            r.get(i).display();
        }
    }

    @Test
    public void testCourseCommentMapper() {

        System.out.println("hello CourseCommentMapper");
//        CourseComment cc = new CourseComment();
//        cc.setCid(1);
//        cc.setRid(6);
//        cc.setCcComment("这个课程很棒");
//        cc.setCcTime(startTime);
//        courseCommentMapper.insert(cc);
        List<CourseComment> ccl = courseCommentMapper.selectByCid(1);
        ccl.get(0).display();
        System.out.println("bye-bye");
    }

    @Test
    public void testCourseSmallTypeMapper() {

        System.out.println("hello CourseSmallTypeMapper");
        List<CourseSmallType> cs = courseSmallTypeMapper.selectByCbt_id(3);
        for (int i=0;i<cs.size();i++){
            cs.get(i).display();
        }
        System.out.println("bye-bye");
    }

    @Test
    public void testCourseVideoMapper() {

        System.out.println("hello CourseVideoMapper");
//        CourseVideo cv= new CourseVideo();
//        cv.setCid(1);
//        cv.setCvSortid(1);
//        cv.setCvName("Java简介");
//        List<Role> teachers = roleMapper.selectByType(2);
//        Role teacher = teachers.get(0);
//        teacher.display();
//        List<Course> courses = courseMapper.selectByCid(1);
//        courses.get(0).display();
//        cv.setCvPath(teacher.getRid()+ "/"+ courses.get(0).getCname()+"/"+"Java简介.mp4");
//        courseVideoMapper.insert(cv);
        List<CourseVideo> cvl = courseVideoMapper.selectByCid(1);
        for (int i=0;i<cvl.size();i++){
            cvl.get(i).display();
        }
        System.out.println("bye-bye");
    }

    @Test
    public void testTypeCourseMapper() {

        System.out.println("hello TypeCourseMapper");
        List<Course> c = typeCourseMapper.selectByCst_id(3);
        for(int i =0; i< c.size();i++){
            c.get(i).display();
        }
        System.out.println("bye-bye");
    }
}


