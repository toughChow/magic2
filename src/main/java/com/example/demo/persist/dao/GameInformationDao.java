package com.example.demo.persist.dao;

import com.example.demo.persist.entity.GameinformationPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface GameInformationDao extends JpaRepository<GameinformationPo,Integer>,JpaSpecificationExecutor<GameinformationPo> {
    List<GameinformationPo> findByAdminId(Integer id);
}
