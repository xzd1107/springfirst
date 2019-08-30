package com.situ.service;

import java.util.List;



import com.situ.entity.Student;

public interface StudentService {
	
	public List<Student> select(String txt);
	
	public Student findStudentById(Integer id);
	
	
	public void insert(Student stu);
	
	
	public void delete(Integer id);
	
	
	public void update(Student stu);

}
