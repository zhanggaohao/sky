package com.sky.web.controller;

import com.sky.common.DTO.UserDTO;
import com.sky.common.enums.ErrorCode;
import com.sky.common.httpResult.Result;
import com.sky.service.intf.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sky")
public class LoginController {
    
    private Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/login")
    @ResponseBody
    public Result login(UserDTO user) {
        Result result = Result.getInstance();
        try {
            result = userService.login(user);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setErrorCode(ErrorCode.SYSTEM_ERROR);
        }
        return result;
    }
    
}
