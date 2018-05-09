package com.example.demo.persist.service;

import com.example.demo.data.Admin;
import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.entity.UserPo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdminService {
    //    //登录查询
    String findNameAndPass(String name,String pass);

    //认证
    AdminPo findUserByname(String user_name);
    //注册
    AdminPo saveUser(String username,String nickname,String  mailbox,String Passworld);

    Page<Admin> pagingAll(Pageable pageable);

    void updateStatus(Integer id, int status);

    Page<Admin> pagingAllByRoleId(Pageable pageable, int roleId);
}
