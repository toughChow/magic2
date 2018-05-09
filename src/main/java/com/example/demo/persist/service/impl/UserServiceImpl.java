package com.example.demo.persist.service.impl;

import com.example.demo.data.User;
import com.example.demo.persist.dao.UserDao;
import com.example.demo.persist.entity.UserPo;
import com.example.demo.persist.service.UserService;
import com.example.demo.persist.utils.MD5;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public String findNameAndPass(String name, String pass) {
        if(userDao.findByName(name)==null){
            return "0";
        }
        UserPo userPo=userDao.findByName(name);
        if (userPo.getUser_pass().equals(pass)){
            return "0";
        }
        return "1";
    }

    @Override
    public UserPo findUserByname(String user_name) {
        UserPo userPo=userDao.findByName(user_name);
        return userPo;
    }

    @Override
    public UserPo saveUser(String username, String nickname, String mailbox, String Passworld) {
        UserPo userPo=userDao.findByName(username);
        UserPo userPo1=new UserPo();
        if (userPo==null){
            User user=new User();
            user.setName(username);
            user.setIdname(nickname);
            user.setEmail(mailbox);
            //MD5
            user.setUser_pass(MD5.md5Password(Passworld));
            user.setCreate_date(new Date());
            BeanUtils.copyProperties(user,userPo1);
            userDao.save(userPo1);
            return userPo1;
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<UserPo> userPos=userDao.findAll();
        List<User> users=new ArrayList<>();
        userPos.forEach(po->{
            User user=new User();
            BeanUtils.copyProperties(po,user,"user_pass");
            users.add(user);
        });
        return users;
    }

    @Override
    public void updateStatus(Integer id, int status) {
        UserPo userPO = userDao.findOne(id);
        if (userPO != null) {
            userPO.setStatus(status);
            userDao.save(userPO);
        }
    }

    @Override
    public Page<User> pagingAll(Pageable pageable) {
        Page<UserPo> page=userDao.findAll(pageable);
        List<User> users=new ArrayList<>();
        for(UserPo po:page.getContent()){
            User user=new User();
            BeanUtils.copyProperties(po,user,"user_pass");
            users.add(user);
        }
        return new PageImpl<>(users,pageable,page.getTotalElements());
    }
}
