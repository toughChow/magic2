package com.example.demo.persist.service;

import com.example.demo.persist.entity.GameinformationPo;

import java.util.List;

public interface GameInformationService {
    List<GameinformationPo> findAll(Integer id);
 }
