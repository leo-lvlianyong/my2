package com.ceis.core.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Title DemoController.java
 * @Description TODO
 * @Date 2015年5月25日 下午2:07:10
 * @author leo_lvlianyong
 * @version 1.0.0.0
 */

@Controller
public class DemoController {
	private static Logger logger = Logger.getLogger(DemoController.class);

	@RequestMapping(value = "/toPage1.htm", method = RequestMethod.GET)
	public ModelAndView toPage1() {
		logger.debug("TEST");
		return new ModelAndView("page1");
	}
}
