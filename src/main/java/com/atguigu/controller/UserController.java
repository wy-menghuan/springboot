package com.atguigu.controller;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<User> userlist = userService.findAll();
        model.addAttribute("userlist",userlist);
        return "list";
    }

    /*添加用户页面*/
    @RequestMapping("/add")
    public String add(Model model,User user){
       // model.addAttribute("user",user);
        return "input";

    }


    @RequestMapping("/addUser")
    public String addUser(User user){
        userService.add(user);
        return "redirect:/users/findAll";

    }

    @RequestMapping("/findOne")
    public String findOne(int id,Model model){
        User user = userService.findOne(id);
        model.addAttribute("user",user);
        return "update";
    }

    @RequestMapping("/updateUser")
    public String update(User user){
        userService.update(user);
        return "redirect:/users/findAll";
    }

    @RequestMapping("/deleteUserById")
    public String delete(User user){

        userService.deleteUserById(user);



        return "redirect:/users/findAll";
    }



}
