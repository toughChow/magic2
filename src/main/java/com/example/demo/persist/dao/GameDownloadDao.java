package com.example.demo.persist.dao;


import com.example.demo.persist.entity.GameDownloadPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GameDownloadDao extends JpaRepository<GameDownloadPo,Integer>,JpaSpecificationExecutor<GameDownloadPo> {
}
