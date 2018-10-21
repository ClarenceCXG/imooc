package com.imooc.service;

import com.imooc.bean.Role;
import com.imooc.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 添加角色
     * @param record
     * @return
     */
    public int addRole(Role record){
        return roleMapper.insertSelective(record);
    }

    /**
     * 根据手机号返回角色结果集
     * @param rphone
     * @return
     */
    public List<Role> selectRoleByPhone(String rphone){
        return roleMapper.selectByPhone(rphone);
    }

    /**
     * 根据角色类型返回角色结果集
     * @param rtype
     * @return
     */
    public List<Role> selectRoleByType(int rtype){
        return roleMapper.selectByType(rtype);
    }

    /**
     * 根据角色名字返回角色结果集
     * @param rname
     * @return
     */
    public List<Role> selectRoleByName(String rname){
        return roleMapper.selectByName(rname);
    }

    /**
     * 更新角色信息
     * @param record
     * @return
     */
    public int updataRole(Role record){
        return roleMapper.updateByPrimaryKeySelective(record);
    }
}
