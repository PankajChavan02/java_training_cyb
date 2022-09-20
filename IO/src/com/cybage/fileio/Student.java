package com.cybage.fileio;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;
	private int id;	
	private String studenClass;
	private String address;
	public Student(String name, int id, String studenClass, String address) {
		super();
		this.name = name;
		this.id = id;
		this.studenClass = studenClass;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudenClass() {
		return studenClass;
	}
	public void setStudenClass(String studenClass) {
		this.studenClass = studenClass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", studenClass=" + studenClass + ", address=" + address + "]";
	}
	
	

}
