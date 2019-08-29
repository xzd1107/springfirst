package com.situ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.dao.StudentDao;
import com.situ.dao.StudentDao1;
import com.situ.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao dao;
	@Autowired
	StudentDao1 dao1;
	public List<Student> select(String txt) {
		
		return dao.select(txt);
	}
	
	public List<Student> selectall(String txt) {
		
		return dao1.select(txt);
	}

}
