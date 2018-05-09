package com.example.demo.persist.dao;

import com.example.demo.persist.entity.BillsPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BillDao extends JpaRepository<BillsPo,Integer>,JpaSpecificationExecutor<BillsPo> {
}
