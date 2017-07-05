package com.sky.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月4日 下午9:26:04
 *
 */
@Controller
@RequestMapping("testController")
public class TestController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	 
	@RequestMapping("main")
	public ModelAndView main(){
		return new ModelAndView("index");
	}
	
}
