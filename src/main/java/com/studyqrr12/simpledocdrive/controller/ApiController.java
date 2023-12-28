package com.studyqrr12.simpledocdrive.controller;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController()
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/ping")
    //Health check  API
    public ResponseEntity ping() {
        Map result = new HashMap();
        result.put("code", 0);
        result.put("message","pong");
        result.put("time", new Date().getTime());

        ResponseEntity response = new ResponseEntity<>(result,HttpStatus.OK);
        response.ok().cacheControl(CacheControl.noCache());
        return response;
    }

    @PostMapping("/login")
    //TODO: [POST-json] /api/login ( 로그인 처리 )
    public Map login() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/logout")
    //TODO: [POST-json] /api/logout ( 로그아웃 처리 )
    public Map logout() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/create-user")
    //TODO: [POST-json] /api/create-user ( 사용자 추가 )
    public Map createUser() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/delete-user")
    //TODO: [POST-json] /api/delete-user ( 사용자 삭제 )
    public Map deleteUser() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/modify-user")
    //TODO: [POST-json] /api/modify-user ( 사용자 수정 )
    public Map modifyUser() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/create-directory")
    //TODO: [POST-json] /api/create-directory ( 디렉터리 생성 )
    public Map createDirectory() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/delete-directory")
    //TODO: [POST-json] /api/delete-directory ( 디렉터리 삭제 )
    public Map deleteDirectory() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/modify-directory")
    //TODO: [POST-json] /api/modify-directory ( 디렉터리 생성 - 수정 - 삭제 )
    public Map modifyDirectory() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    @PostMapping("/delete-file")
    //TODO: [POST-json] /api/delete-file (파일 삭제)
    public Map deleteFile() {
        Map result = new HashMap();
        result.put("code", -1);
        result.put("message","Not Impl");
        return result;
    }

    //TODO: [POST-multipart/form-data] /api/create-file (파일 업로드)
    //TODO: [POST-multipart/form-data] /api/modify-file (파일 정보 수정)
    //TODO: [GET] /api/download-file (파일 다운로드)

    //TODO: csrf
}