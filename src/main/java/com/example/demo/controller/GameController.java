package com.example.demo.controller;

import com.example.demo.persist.entity.GameinformationPo;
import com.example.demo.persist.service.GameInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class GameController {

    @Autowired
    private GameInformationService gameInformationService;

    @GetMapping("/deployGame")
    public String deployGame(){
        return "/admin/subpage/deployGame";
    }

    @PostMapping("/deploy")
    public String deploy(GameinformationPo gameinformationPo){
        gameInformationService.save(gameinformationPo);
        System.out.println(123);
        return "/admin/subpage/deployGameSuccess";
    }

    public static final String uploadDesc = "D:/game/";

    @PostMapping("/uploadGamePic")
    @ResponseBody
    public String uploadFile(MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        StringBuffer sb = new StringBuffer();
        if(!new File(uploadDesc).exists()){
            new File(uploadDesc).mkdir();
        }
            String descPath = uploadDesc + UUID.randomUUID().toString() + file.getOriginalFilename();
            File fileTemp = new File(descPath);
            file.transferTo(fileTemp);
                sb.append(descPath);

        return sb.toString();
    }

}
