package com.situ.entity;

public class Student {
	public static String[] sexname= {"男","女"};
	private Integer id;
	private String name;
	private Integer gender;
	private Integer batchid;
	private String batchname;
	
	

public Student() {
		
	}
public Student(String name, Integer gender, Integer batchid) {
		
		this.name = name;
		this.gender = gender;
		this.batchid = batchid;
	}
	public String getSexname() {
		return sexname[gender];
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	
//	public String getsex() {
//		if(this.gender==0) {
//			return "��";
//		}else {
//			return "Ů";
//		}
//	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
}
