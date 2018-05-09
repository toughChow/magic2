package com.example.demo.persist.service.impl;

import com.example.demo.data.Admin;
import com.example.demo.data.User;
import com.example.demo.persist.dao.AdminDao;
import com.example.demo.persist.dao.UserDao;
import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.entity.UserPo;
import com.example.demo.persist.service.AdminService;
import com.example.demo.persist.utils.MD5;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;
@Service
public class AdminImp implements AdminService{
    @Autowired
    AdminDao adminDao;
    @Override
    public String findNameAndPass(String name, String pass) {
        if(adminDao.findByName(name)==null){
            return "0";
        }
        AdminPo adminPo=adminDao.findByName(name);
        if (adminPo.getPass().equals(pass)){
            return "0";
        }
        return "1";
    }

    @Override
    public AdminPo findUserByname(String user_name) {
        AdminPo adminPo=adminDao.findByName(user_name);
        return adminPo;
    }

    @Override
    public AdminPo saveUser(String username, String nickname, String mailbox, String Passworld) {
        AdminPo adminPo=adminDao.findByName(username);
        AdminPo adminPo1=new AdminPo();
        if (adminPo==null){
            Admin admin=new Admin();
            admin.setUsername(username);
            admin.setName(nickname);
            admin.setCall(mailbox);
            //MD5
            admin.setPass(MD5.md5Password(Passworld));
            admin.setCreate_time(new Date());
            BeanUtils.copyProperties(admin,adminPo1);
            adminDao.save(adminPo1);
            return adminPo1;
        }
        return null;
    }
}

