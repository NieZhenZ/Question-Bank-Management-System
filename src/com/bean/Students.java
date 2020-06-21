package com.bean;

import java.io.Serializable;
/**
 * 学生类
 */
public class Students implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String studentclass;
	private int ru=3;
	
	public Students(int id) {
		this.id = id;
	}
		
	/**
	 * @param username 学生用户名
	 * @param pwd 学生密码
	 * @param name 学生姓名
	 * @param sex 学生性别
	 * @param studentclass 学生所在班级
	 * @param telephone 学生电话
	 * @param email 学生邮箱
	 * @param ru 管理员权限1，教师权限2，学生3
	 */
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
