package com.sky.web.controller;

import org.sky.common.DTO.UserDTO;
import org.sky.common.httpResult.Result;
import org.sky.service.intf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月18日 下午11:46:41
 *
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;
    
    @RequestMapping("register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }
    
    @RequestMapping("save")
    @ResponseBody
    public Result save(UserDTO user) {
        return userService.register(user);
    }
    
    @RequestMapping("userList")
    public ModelAndView userList() {
        ModelAndView view = new ModelAndView("userList");
        view.addObject("userList", userService.listUser());
        return view;
    }
    
}
