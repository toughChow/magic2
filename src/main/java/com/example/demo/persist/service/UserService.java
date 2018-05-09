package com.example.demo.persist.service;

import com.example.demo.persist.entity.UserPo;

public interface UserService {
    //    //登录查询
    String findNameAndPass(String name,String pass);

    //认证
    UserPo findUserByname(String user_name);
    //注册
    UserPo saveUser(String username,String nickname,String  mailbox,String Passworld);
}
