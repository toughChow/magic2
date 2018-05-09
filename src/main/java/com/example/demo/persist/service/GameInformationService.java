package com.example.demo.persist.service;

import com.example.demo.persist.entity.GameinformationPo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GameInformationService {
    Page<GameinformationPo> pagingAllByStatus(Pageable pageable, int status);

    void updateStatus(Integer id, int status);
}
