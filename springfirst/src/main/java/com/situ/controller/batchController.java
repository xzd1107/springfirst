package com.situ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.service.batchService;

@Controller
public class batchController {
	
	@Autowired
	batchService bat;
	
	@RequestMapping("selectall")
	public String select(ModelMap m) {
		m.put("batchlist", bat.select());
		return "index1";
	}
}
