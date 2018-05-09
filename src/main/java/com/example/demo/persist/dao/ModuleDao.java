package com.example.demo.persist.dao;

import com.example.demo.persist.entity.ModulePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ModuleDao extends JpaRepository<ModulePo,Integer>,JpaSpecificationExecutor<ModulePo> {
}
