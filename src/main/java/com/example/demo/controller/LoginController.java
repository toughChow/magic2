package com.example.demo.controller;

import com.aliyuncs.exceptions.ClientException;
import com.example.demo.controller.deslk.BaseController;
import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.service.AdminService;
import com.example.demo.persist.service.BankService;
import com.example.demo.persist.utils.MD5;
import com.example.demo.persist.utils.msg.SendMsg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

//页面控制
@Controller
public class LoginController extends BaseController{
    @Autowired
    AdminService adminService;
    @Autowired
    BankService bankService;
    protected static String codeStr = "fake"; // default validation Code
    private String number;
    @RequestMapping("/")
    public String login() {
        return "/login";
    }
    //注册页面
    @RequestMapping("/registered")
    public String registered() {
        return "/registered";
    }

    //ajax 登录验证
    @RequestMapping("/ajaxNamePass")
    public @ResponseBody
    String ajaxNamePass(String name, String pass) throws IOException, ClientException {
        String a = name;
        String b = MD5.md5Password(pass);
        return adminService.findNameAndPass(name, b);
    }

    //登录验证
    @RequestMapping(value = "/loginUser")
    public String loginUser(String username, String password) {
        password = MD5.md5Password(password);
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(usernamePasswordToken);   //完成登录
            boolean vip3 = subject.hasRole("管理员");
            boolean vip2 = subject.hasRole("商家");
         if (vip3==false && vip2==true){//商家
             session.setAttribute("username", username);
             AdminPo adminPo = (AdminPo) subject.getPrincipal();
             session.setAttribute("adminPo", adminPo);
             return "/admin/admin";
         }else if (vip3==true && vip2==false){//管理员
             session.setAttribute("username", username);
             AdminPo adminPo = (AdminPo) subject.getPrincipal();
             session.setAttribute("adminPo", adminPo);
             return "/admin/admin";
         }
        } catch (Exception e) {
            return "/login";//返回登录页面
        }
        return "/login";
    }

    //ajax 短信息验证
    @RequestMapping("/ajaxcall")
    public @ResponseBody
    String ajaxcall(String call) throws IOException, ClientException {
        /*
        * 发送短信 若出现异常 重定向到之前页面
        * */
        Integer code = (int) ((Math.random() * 9 + 1) * 100000);
        codeStr = code.toString();
        number = codeStr;
        String str = String.valueOf(SendMsg.sendSms(SendMsg.TEMPLATE_CODES[0], call, codeStr, "miss:"));
        return str;
    }

    //ajax 短信息验证
    @RequestMapping("/calltext")
    public @ResponseBody
    String calltext(String call) throws IOException, ClientException {
        /*
        * 发送短信 若出现异常 重定向到之前页面
        * */
        if (call.equals(number)) {
            return "0";
        }
        return "1";
    }

    //用户注册
    @PostMapping(value = "/userRegister")
    public String UserRegister(String username, String name, String call, String password) {
        if (adminService.saveUser(username, name, call, password) == null) {
            return "/registered";
        }
        return "/login";
    }




    //个人首页部分
    //厂商信息
    @RequestMapping("/VendorInformation")
    public String VendorInformation() {
        return "/admin/VendorInformation";
    }
    //已上线游戏
    @RequestMapping("/Onlinegame")
    public String Onlinegame() {
        return "/admin/Onlinegame";
    }

    //游戏运营统计
    //月收益
    @RequestMapping("/MonthlyIncome")
    public String MonthlyIncome() {
        return "/admin/MonthlyIncome";
    }
//    //季度收益
//    @RequestMapping("/Quarterlyearnings")
//    public String Quarterlyearnings() {
//        return "/admin/Quarterlyearnings";
//    }
//    //年收益
//    @RequestMapping("/Annualincome")
//    public String Annualincome() {
//        return "/admin/Annualincome";
//    }

    //游戏管理
    //发布游戏
    @RequestMapping("/Issue")
    public String Issue() {
        return "/admin/Issue";
    }
    //审核中
    @RequestMapping("/Audit")
    public String Audit() {
        return "/admin/Audit";
    }
    //游戏运行
    @RequestMapping("/Forbid")
    public String Forbid() {
        return "/admin/Forbid";
    }
}
