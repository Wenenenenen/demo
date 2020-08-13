package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public String login(String account, String password){
        System.out.println(account+"---"+password);
        User user = userService.login(account, password);

        Map map = new HashMap();
        if(user!=null){
            map.put("msg","success");
            map.put("id",user.getId());
            map.put("username",user.getUsername());
            map.put("phone",user.getPhone());
            map.put("email",user.getEmail());
            map.put("unit",user.getUnit());
        }else{
            map.put("msg","fail");
        }
        JSONObject jsonObject = new JSONObject(map);
        String res = jsonObject.toString();
        return res;
    }
}
