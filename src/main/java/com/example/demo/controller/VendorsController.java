package com.example.demo.controller;

import com.example.demo.data.Admin;
import com.example.demo.data.User;
import com.example.demo.persist.service.AdminService;
import com.example.demo.persist.service.UserService;
import com.example.demo.persist.utils.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/vendors")
public class VendorsController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("list")
    public String userList(@RequestParam(defaultValue = "1") Integer pn, ModelMap model){
        Pageable pageable=new PageRequest(pn-1,10);
        Page<Admin> page =adminService.pagingAllByRoleId(pageable,2);
        model.put("page",page);
        return "/admin/vendor";
    }
    /**
     * 把用户修改成能进行登录状态
     *
     * @param id
     * @return
     */
    @RequestMapping("/open")
    public @ResponseBody
    Data open(Integer id) {
        adminService.updateStatus(id, 0);
        Data data = Data.success("操作成功", Data.NOOP);
        return data;
    }

    /**
     * 把用户设置为不可登陆状态
     *
     * @param id
     * @return
     */
    @RequestMapping("/close")
    public @ResponseBody
    Data close(Integer id) {
        adminService.updateStatus(id,1);
        Data data = Data.success("操作成功", Data.NOOP);
        return data;
    }

}
