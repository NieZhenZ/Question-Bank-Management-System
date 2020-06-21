package com.bean;

import java.io.Serializable;

/**
 * ΩÃ ¶¿‡
 */
public class Teachers implements Serializable{
private static final long serialVersionUID = 1L;
	
	private int id;
	protected  String username;
	protected  String pwd;
	protected  String name;
	
	public Teachers(String username,String pwd,String name) {
		this.username = username;
		this.pwd = pwd;
		this.name = name;
	}
	
	public Teachers(int id) {
		this.id = id;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}