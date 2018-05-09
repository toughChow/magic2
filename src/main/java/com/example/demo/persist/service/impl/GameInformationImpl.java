package com.example.demo.persist.service.impl;

import com.example.demo.persist.dao.GameInformationDao;
import com.example.demo.persist.entity.GameinformationPo;
import com.example.demo.persist.service.GameInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Service
public class GameInformationImpl implements GameInformationService {
    @Autowired
    private GameInformationDao gameInformationDao;

    @Override
    public Page<GameinformationPo> pagingAllByStatus(Pageable pageable, int status) {
        Page<GameinformationPo> page = gameInformationDao.findAll((Root<GameinformationPo> root, CriteriaQuery<?> cq, CriteriaBuilder cb) -> {
            return cb.and(cb.equal(root.get("status"), status));
        }, pageable);
        return page;
    }

    @Override
    public void updateStatus(Integer id, int status) {
        GameinformationPo po = gameInformationDao.findOne(id);
        if (po != null) {
            po.setStatus(status);
            gameInformationDao.save(po);
        }
    }
}
