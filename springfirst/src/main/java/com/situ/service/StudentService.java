package com.situ.service;

import java.util.List;

import com.situ.entity.Student;

public interface StudentService {
	
	public List<Student> select(String txt);
	public List<Student> selectall(String txt);
}
