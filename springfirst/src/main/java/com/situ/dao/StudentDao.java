package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.situ.entity.Student;

@Repository
public interface StudentDao {

	@Select("select student.*,batch.batchname from student inner join batch on student.batchid=batch.batchid ${txt}")
	public List<Student> select(@Param("txt") String txt);
	
	@Select("select student.*,batch.batchname from student inner join batch on student.batchid=batch.batchid where id=#{id}")
	public Student findStudentById(Integer id);
	
	@Insert("insert into student(name,gender,batchid) values(#{name},#{gender},#{batchid})")
	public void insert(Student stu);
	
	@Delete("delete from student where id=#{id}")
	public void delete(Integer id);
	
	@Update("update student set name=#{name},gender=#{gender},batchid=#{batchid} where id=#{id}")
	public void update(Student stu);
}
