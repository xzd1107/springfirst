package com.situ.entity;

public class batch {
	private Integer batchid;
	private String batchname;
	
	
	public batch(Integer batchid, String batchname) {
		super();
		this.batchid = batchid;
		this.batchname = batchname;
	}
	public Integer getBatchid() {
		return batchid;
	}
	public void setBatchid(Integer batchid) {
		this.batchid = batchid;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
}
