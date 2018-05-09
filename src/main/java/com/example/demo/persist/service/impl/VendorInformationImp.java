package com.example.demo.persist.service.impl;

import com.example.demo.persist.dao.AdminDao;
import com.example.demo.persist.dao.VendorInformationDao;
import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.entity.VendorInformation;
import com.example.demo.persist.service.VendorInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendorInformationImp implements VendorInformationService{
    @Autowired
    VendorInformationDao vendorInformationDao;
    @Autowired
    AdminDao adminDao;
    @Override
    public VendorInformation findAll(String name) {
        AdminPo adminPo= adminDao.findByName(name);
        VendorInformation vendorInformation=vendorInformationDao.findByAdminId(adminPo.getId());
        return vendorInformation;
    }

    @Override
    public void saveVendorInformation(Integer id) {
        VendorInformation vendorInformation=new VendorInformation();
        vendorInformation.setAdminId(id);
        vendorInformation.setFans("0");
        vendorInformation.setIntroduce("等待输入");
        vendorInformation.setLogo("");
        vendorInformation.setNumber("5.0");
        vendorInformation.setSlogan("");
        vendorInformation.setTell("");
        vendorInformationDao.save(vendorInformation);
    }

    @Override
    public void Update(Integer id, String tell, String introduce, String slogan) {

        VendorInformation vendorInformation=vendorInformationDao.findByAdminId(id);
        vendorInformation.setAdminId(id);
        vendorInformation.setIntroduce(introduce);
        vendorInformation.setSlogan(slogan);
        vendorInformation.setTell(tell);
        vendorInformationDao.save(vendorInformation);
    }
}
