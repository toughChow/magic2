package com.example.demo.controller;

import com.example.demo.controller.deslk.BaseController;
import com.example.demo.persist.dao.AdminDao;
import com.example.demo.persist.dao.VendorInformationDao;
import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.service.AdminService;
import com.example.demo.persist.service.VendorInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//信息信息相关页面控制
@Controller
public class AdminController extends BaseController{
    @Autowired
    AdminService adminService;
    @Autowired
    VendorInformationService vendorInformationService;

    @RequestMapping("/saveVen")
    public @ResponseBody
    String registered(String tell, String introduce, String slogan) {
        AdminPo adminPo= adminService.findUserByname(String.valueOf(session.getAttribute("username")));
        vendorInformationService.Update(adminPo.getId(),tell,introduce,slogan);
        return "/VendorInformation";
    }

    //查询年度游戏
    @RequestMapping("/findGameRank")
    public String findGameRank(ModelMap model) {

        return "/VendorInformation";
    }
}
