package com.situ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService stu;

	
	@RequestMapping("select")
	public String select(ModelMap m,String txt) {

		if(txt!=null) {
			txt=" where student.name like '%"+txt+"%'";
		}else {
			txt="";
		}
		m.put("list", stu.select(txt));
		
		return "index";
	}
	
	@RequestMapping("selectall")
	public String selectall(ModelMap m,String txt) {

		if(txt!=null) {
			txt=" where student.name like '%"+txt+"%'";
		}else {
			txt="";
		}
		m.put("list", stu.select(txt));
		
		return "index";
	}
	
	
}
