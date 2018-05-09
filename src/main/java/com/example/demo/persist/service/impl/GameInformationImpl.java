package com.example.demo.persist.service.impl;

import com.example.demo.persist.dao.GameInformationDao;
import com.example.demo.persist.entity.GameinformationPo;
import com.example.demo.persist.service.GameInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameInformationImpl implements GameInformationService {
    @Autowired
    GameInformationDao gameInformationDao;
    @Override
    public List<GameinformationPo> findAll(Integer id) {
        List<GameinformationPo> gameinformationPos= gameInformationDao.findByAdminId(id);

        return gameinformationPos;
    }
}
