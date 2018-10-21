package com.imooc.controller;


import com.imooc.bean.Role;
import com.imooc.service.RoleService;
import com.imooc.util.JsonMsg;
import com.imooc.util.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Controller
@RequestMapping(value = "/Login_Reg")
public class RoleController {

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/doReg", method = RequestMethod.POST)
    @ResponseBody
    public JsonMsg doReg(HttpServletRequest request, HttpSession session) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Integer rtype = Integer.valueOf(request.getParameter("rtype"));
        String rphone = request.getParameter("rphone");
        String rpassword = request.getParameter("upassword");
        System.out.println("类型："+rtype+" 账号："+rphone +" 密码："+rpassword);
        if(rphone == "" || rpassword == ""){
            System.out.println("--------------------------------");
            session.setAttribute("flag","注册失败");
            return JsonMsg.fail();
        }else {
            String Md5_pwd = Md5.EncoderByMd5(rpassword);
            System.out.println("哈希码：" + Md5_pwd);
            Role role = new Role();
            role.setRtype(rtype);
            role.setRpassword(Md5_pwd);
            roleService.addRole(role);
            System.out.println("添加成功");
            return JsonMsg.success();
        }
    }


}
