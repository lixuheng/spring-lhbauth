package com.lhb.lhbauth.jwt.demo.web.controller;

import com.lhb.lhbauth.jwt.demo.constants.FromLoginConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author lvhaibao
 * @description
 * @date 2018/12/25 0025 14:35
 */
@RestController
@RequestMapping("/user")
public class UserController {

     private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @GetMapping("/hello")
    public String hello(){
        return "你已经访问";
    }



}
