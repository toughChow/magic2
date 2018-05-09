package com.example.demo.persist.dao;

import com.example.demo.persist.entity.VendorInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface VendorInformationDao extends JpaRepository<VendorInformation,Integer>,JpaSpecificationExecutor<VendorInformation> {
    VendorInformation findByAdminId(Integer id);
}
