package com.example.demo.persist.service;

import com.example.demo.data.User;
import com.example.demo.persist.entity.UserPo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    //    //登录查询
    String findNameAndPass(String name,String pass);

    //认证
    UserPo findUserByname(String user_name);
    //注册
    UserPo saveUser(String username,String nickname,String  mailbox,String Passworld);

    List<User> findAll();

    void updateStatus(Integer id, int status);

    Page<User> pagingAll(Pageable pageable);
}
