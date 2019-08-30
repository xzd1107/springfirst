package com.situ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.entity.Student;
import com.situ.service.StudentService;
import com.situ.service.batchService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService stu;
	@Autowired
	batchService bat;

	
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
	
	@RequestMapping("delete")
	public String delete(Integer id,ModelMap m) {
		
		stu.delete(id);
		return select(m, null);
	}
	@RequestMapping("add")
	public String add(ModelMap m) {
		m.put("batchlist", bat.select());
		m.put("sexname", Student.sexname);
		return "add";
	}
	
	@RequestMapping("edit")
	public String edit(ModelMap m,Integer id) {
		Student s = stu.findStudentById(id);
		m.put("batchlist", bat.select());
		m.put("sexname", Student.sexname);
		m.put("stu", s);
		return "edit";
	}
	@RequestMapping("insert")
	public String insert(Student s,ModelMap m) {
		stu.insert(s);
		return select(m, null);
		
	}
	@RequestMapping("update")
	public String update(Student s,ModelMap m) {
		stu.update(s);
		return select(m, null);
	}

	
	
}
