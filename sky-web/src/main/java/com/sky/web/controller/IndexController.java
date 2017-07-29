package com.sky.web.controller;

import org.sky.common.base.BaseController;
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
public class IndexController extends BaseController<IndexController> {

	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping("/index")
	public ModelAndView main(){
		logger.info("into the testController.");
		return new ModelAndView("index");
	}
	
}
