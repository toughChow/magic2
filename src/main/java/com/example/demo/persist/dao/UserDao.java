package com.example.demo.persist.dao;

import com.example.demo.persist.entity.UserPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<UserPo,Integer>,JpaSpecificationExecutor<UserPo> {
    UserPo findByName(String name);
}
