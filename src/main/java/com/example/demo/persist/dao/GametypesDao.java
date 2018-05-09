package com.example.demo.persist.dao;


import com.example.demo.persist.entity.GametypePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GametypesDao extends JpaRepository<GametypePo,Integer>,JpaSpecificationExecutor<GametypePo> {
}
