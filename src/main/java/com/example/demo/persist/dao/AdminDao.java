package com.example.demo.persist.dao;

import com.example.demo.persist.entity.AdminPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface AdminDao extends JpaRepository<AdminPo,Integer>,JpaSpecificationExecutor<AdminPo> {
    AdminPo findByName(String name);

    @Query(value = "select id from t_admin t where t.role_id = ?1", nativeQuery = true)
    Integer findIdByRoleId(int i);
}
