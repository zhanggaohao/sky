package com.sky.web.controller;

import com.sky.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月15日 下午9:17:20
 *
 */
@Controller
public class IndexController extends BaseController<IndexController> {
	
	@RequestMapping("/login")
	public ModelAndView login(){
		return new ModelAndView("login");
	}
	
	@RequestMapping("/index")
	public ModelAndView main(){
	    return new ModelAndView("index");
	}
	
	@RequestMapping("/amplifier")
	public ModelAndView amplifier(){
	    return new ModelAndView("amplifier");
	}
	
}
