package com.example.demo.persist.dao;

import com.example.demo.persist.entity.RolePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDao extends JpaRepository<RolePo,Integer>,JpaSpecificationExecutor<RolePo> {
}
