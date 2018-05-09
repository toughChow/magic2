package com.example.demo.persist.dao;

import com.example.demo.persist.entity.PagPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PagDao extends JpaRepository<PagPo,Integer>,JpaSpecificationExecutor<PagPo> {
}
