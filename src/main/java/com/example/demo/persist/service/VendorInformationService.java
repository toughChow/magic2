package com.example.demo.persist.service;

import com.example.demo.persist.entity.VendorInformation;
import org.hibernate.sql.Update;

import java.util.List;

public interface VendorInformationService {
    //查询全部信息
    VendorInformation findAll(String name);

    //初始信息生成
    void saveVendorInformation(Integer id);

    //添加信息
    void Update(Integer id,String tell,String introduce,String slogan);
}
