package com.example.demo.api.controller;

import com.example.demo.core.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(tags = "首页模块")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "用户详情")
    @GetMapping("/detail")
    public String accountDetail(){
        return "liweidetail";
    }
    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        return userService.getUserInfo();
    }
}
