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
 * @date 2017年7月15日 下午9:17:20
 *
 */
@Controller
@RequestMapping("testController")
public class TestController {

	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("main")
	public ModelAndView main(){
		logger.info("into the testController.");
		return new ModelAndView("index");
	}
	
}
