package com.entor.controller;

import com.entor.entity.User;
import com.entor.util.UUIDUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }
    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Integer id){
        User user = new User();
        user.setId(id);
        user.setName("张三"+id);
        return user;
    }
    @RequestMapping("/get/{id}")
    @ResponseBody
    public User get(@PathVariable Integer id){
        User user = new User();
        user.setId(id);
        user.setName("张三"+id);
        return user;
    }
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","张三");
        User user = new User();
        user.setId(1);
        user.setName("李四");
        model.addAttribute("user",user);
        return "index";
    }
    @RequestMapping("/getUUID")
    @ResponseBody
    public String getUUID(){
        return UUIDUtils.getUUID();
    }
}
