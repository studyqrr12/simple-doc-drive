package com.studyqrr12.simpledocdrive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController()
public class ApiController {

    @GetMapping("/api/ping")
    public Map ping() {
        Map result = new HashMap();
        result.put("code", 0);
        result.put("message","pong");
        result.put("time", new Date().getTime());
        return result;
    }

    @PostMapping("/api/login")
    public Map login() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    //TODO: csrf

    //TODO: [POST-json] /api/login ( 로그인 처리 )
    //TODO: [POST-json] /api/logout ( 로그아웃 처리 )

    //TODO: [POST-json] /api/create-user ( 사용자 추가 )
    //TODO: [POST-json] /api/delete-user ( 사용자 삭제 )
    //TODO: [POST-json] /api/modify-user ( 사용자 수정 )

    //TODO: [POST-json] /api/create-directory ( 디렉터리 생성 )
    //TODO: [POST-json] /api/delete-directory ( 디렉터리 삭제 )
    //TODO: [POST-json] /api/modify-directory ( 디렉터리 생성 - 수정 - 삭제 )

    //TODO: [POST-multipart/form-data] /api/create-file (파일 업로드)
    //TODO: [POST-json] /api/delete-file (파일 삭제)
    //TODO: [POST-multipart/form-data] /api/modify-file (파일 정보 수정)
    //TODO: [GET] /api/download-file (파일 다운로드)
}
