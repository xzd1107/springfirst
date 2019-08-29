package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.situ.entity.Student;

@Repository
public interface StudentDao {

	@Select("select student.*,batch.batchname from student inner join batch on student.batchid=batch.batchid ${txt}")
	public List<Student> select(@Param("txt") String txt);
}
