package com.example.demo.persist.service.impl;

import com.example.demo.persist.dao.AdminDao;
import com.example.demo.persist.dao.GameInformationDao;
import com.example.demo.persist.entity.GameinformationPo;
import com.example.demo.persist.service.GameInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class GameInformationImpl implements GameInformationService {

    @Autowired
    private GameInformationDao gameInformationDao;

    @Autowired
    private AdminDao adminDao;

    @Override
    public void save(GameinformationPo gameinformationPo) {
        Integer id = adminDao.findIdByRoleId(2);
//        gameinformationPo.set
        gameinformationPo.setAdminId(id);
        gameinformationPo.setReleaseDate(new Timestamp(System.currentTimeMillis()));
        gameInformationDao.save(gameinformationPo);
    }
}
