package com.bean;

import java.io.Serializable;
/**
 * ѧ����
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
	 * @param username ѧ���û���
	 * @param pwd ѧ������
	 * @param name ѧ������
	 * @param sex ѧ���Ա�
	 * @param studentclass ѧ�����ڰ༶
	 * @param telephone ѧ���绰
	 * @param email ѧ������
	 * @param ru ����ԱȨ��1����ʦȨ��2��ѧ��3
	 */
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
