package com.example.demo.persist.dao;

import com.example.demo.persist.entity.BankPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BankDao extends JpaRepository<BankPo,Integer>,JpaSpecificationExecutor<BankPo> {
}
