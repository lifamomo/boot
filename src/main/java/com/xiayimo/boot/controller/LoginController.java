package com.xiayimo.boot.controller;

import com.xiayimo.boot.model.BUser;
import com.xiayimo.boot.service.BUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private BUserService bUserService;

    @GetMapping("/login")
    public Map<String,Object> login(@RequestParam("username") String username,@RequestParam("password") String password){
        Map<String,Object> map = new HashMap<>();
        Map<String,Object> result = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        try{
            BUser bUser = bUserService.selectByMap(map);
            if (StringUtils.isEmpty(bUser)){
                result.put("code","-1");
                result.put("message","该账号不存在");
            }else{
                result.put("code","1");
                result.put("message","");
                result.put("user",bUser);
            }
        }catch (Exception e){
            result.put("code","-1");
            result.put("message","服务器错误");
        }
        return result;
    }
}
