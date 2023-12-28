package com.studyqrr12.simpledocdrive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class MainController {

    @GetMapping(value = "/")
    public String index() {
        //TODO: 로그인 여부 판단해서 로그인 / 관리 페이지로 이동
//        return "redirect:/login";
        return "index";
    }

    @GetMapping(value = "/login")
    public String login() {
        //TODO: 이미 로그인 상태라면 관리 페이지로 이동
//        return "redirect:/";
        return "login";
    }

}
