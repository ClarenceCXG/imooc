package com.imooc.mapper;

import com.imooc.bean.Role;

import java.util.List;

public interface RoleMapper {

    /* ---------------------增---------------------*/

    /**
     * 按表项添加角色，主要是rtype、rphone、rpassword
     * @param record
     * @return
     */
    int insertSelective(Role record);

    /*---------------------查---------------------*/

    /**
     * 按手机号查找角色
     * @param rphone
     * @return
     */
    List<Role> selectByPhone(String rphone);

    /**
     * 按类型查找角色
     * @param rtype
     * @return
     */
    List<Role> selectByType(Integer rtype);

    /**
     * 按名字查找角色
     * @param rname
     * @return
     */
    List<Role> selectByName(String rname);

    /*---------------------改---------------------*/

    /**
     * 更改角色信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Role record);


    //int deleteByPrimaryKey(Integer rid);

    //int insert(Role record);

    //Role selectByPrimaryKey(Integer rid);

    //int updateByPrimaryKey(Role record);

}