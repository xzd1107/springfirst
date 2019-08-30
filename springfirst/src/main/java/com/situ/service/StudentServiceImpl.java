package com.situ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.dao.StudentDao;
import com.situ.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao dao;

	public List<Student> select(String txt) {
		
		return dao.select(txt);
	}

	public Student findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findStudentById(id);
	}

	public void insert(Student stu) {
		// TODO Auto-generated method stub
		dao.insert(stu);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	public void update(Student stu) {
		// TODO Auto-generated method stub
		dao.update(stu);
		
	}


}
