package com.example.demo.controller;

import com.example.demo.persist.service.AdminService;
import com.example.demo.persist.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//管理员页面
@Controller
public class ManageController {
    @Autowired
    AdminService adminService;
    @Autowired
    BankService bankService;
    //月利润页面
    @RequestMapping("/Monthlyprofit")
    public String login() {
        return "admin/subpage2/Monthlyprofit";
    }
}
