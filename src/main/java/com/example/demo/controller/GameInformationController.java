package com.example.demo.controller;

import com.example.demo.controller.deslk.BaseController;
import com.example.demo.persist.entity.AdminPo;
import com.example.demo.persist.entity.GameinformationPo;
import com.example.demo.persist.service.GameInformationService;
import com.example.demo.persist.utils.Data;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/admin/game")
public class GameInformationController extends BaseController{
    @Autowired
    private GameInformationService gameInformationService;

    /**
     * 已上线游戏
     */
    @RequestMapping("/pass")
    public String pass(@RequestParam(defaultValue = "1") Integer pn, ModelMap model) {
        Pageable pageable = new PageRequest(pn - 1, 10);
        Page<GameinformationPo> page = gameInformationService.pagingAllByStatus(pageable, 1);
        model.put("page", page);
        return "/admin/game_pass";
    }

    /**
     * 待审核游戏
     */
    @RequestMapping("/pending")
    public String pending(@RequestParam(defaultValue = "1") Integer pn, ModelMap model) {
        Pageable pageable = new PageRequest(pn - 1, 10);
        Page<GameinformationPo> page = gameInformationService.pagingAllByStatus(pageable, 0);
        model.put("page", page);
        return "/admin/game_pending";
    }

    /**
     * 游戏上线1
     */
    @RequestMapping("/online")
    @ResponseBody
    public Data pass(Integer id) {
        gameInformationService.updateStatus(id, 1);
        return Data.success("操作成功", Data.NOOP);
    }

    /**
     * 游戏下线2
     */
    @RequestMapping("/offline")
    @ResponseBody
    public Data offline(Integer id) {
        gameInformationService.updateStatus(id, 2);
        return Data.success("操作成功", Data.NOOP);
    }

    /**
     * 游戏待审核0/游戏重审0
     */
    @RequestMapping("/check")
    @ResponseBody
    public Data check(Integer id) {
        gameInformationService.updateStatus(id, 0);
        return Data.success("操作成功", Data.NOOP);
    }

    @RequestMapping("/list")
    public String list(@RequestParam(defaultValue = "1") Integer pn, ModelMap model){
        AdminPo po=(AdminPo) session.getAttribute("adminPo");
        Pageable pageable=new PageRequest(pn-1,10);
        Page<GameinformationPo> page=gameInformationService.pagingAllByAdminId(pageable,po.getId());
        model.put("page",page);
        return "/admin/game";
    }

}
