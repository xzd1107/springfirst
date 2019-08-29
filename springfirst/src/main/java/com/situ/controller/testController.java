package com.situ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@RequestMapping("select")
	public String select(ModelMap m) {
		m.put("user", "xzd");
		return "index";
	}
}
