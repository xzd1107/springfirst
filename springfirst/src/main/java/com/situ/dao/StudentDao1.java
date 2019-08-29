package com.situ.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.situ.entity.Student;

@Repository
public interface StudentDao1 {
	
	public List<Student> select(String txt);
}
