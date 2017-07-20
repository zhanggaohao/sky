package com.sky.web.controller;

import org.sky.common.httpResult.Result;
import org.sky.service.intf.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    
    @RequestMapping("save")
    @ResponseBody
    public Result save() {
        Result result = Result.getInstance();
        
        return result;
    }
    
}
