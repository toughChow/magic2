package com.example.demo.persist.dao;

import com.example.demo.persist.entity.WallPaperPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface WallpagerDao extends JpaRepository<WallPaperPo,Integer>,JpaSpecificationExecutor<WallPaperPo> {
}
