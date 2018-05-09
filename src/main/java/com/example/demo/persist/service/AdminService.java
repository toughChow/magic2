package com.example.demo.persist.service;

import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.entity.UserPo;

public interface AdminService {
    //    //登录查询
    String findNameAndPass(String name,String pass);

    //认证
    AdminPo findUserByname(String user_name);
    //注册
    AdminPo saveUser(String username,String nickname,String  mailbox,String Passworld);
}
