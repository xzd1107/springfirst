package com.situ.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.situ.entity.batch;

@Repository
public interface batchDao {
	
	@Select("select * from batch")
	public List<batch> select();
}
