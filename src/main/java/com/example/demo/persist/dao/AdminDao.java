package com.example.demo.persist.dao;

import com.example.demo.persist.entity.AdminPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AdminDao extends JpaRepository<AdminPo,Integer>,JpaSpecificationExecutor<AdminPo> {
    AdminPo findByName(String name);
}
