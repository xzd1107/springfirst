package com.situ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.situ.dao.batchDao;
import com.situ.entity.batch;
@Service
public class batchServiceImpl implements batchService {
	
	@Autowired
	batchDao dao;
	public List<batch> select() {
		return dao.select();
	}

}
