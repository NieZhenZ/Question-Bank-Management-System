package com.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * �Ծ���
 */
public class Paper implements Serializable{
private static final long serialVersionUID = 1L;
	private int id;
	private Date starttime;
	private Date endtime;
	private String papername;
	
	private int xzt1;
	private int xzt2;
	private int xzt3;
	
	private int xzt4;
	private int xzt5;
	private int tkt1;
	private int tkt2;
	
	private int tkt3;
	private int tkt4;
	
	private int bct1;
	private int bct2;

	public Paper() {

	}
	
	
	
	/**
	 * @param starttime ���Կ�ʼʱ��
	 * @param endtime ���Խ���ʱ��
	 * @param papername �Ծ���
	 * @param xzt1 ѡ����1
	 * @param xzt2 ѡ����2
	 * @param xzt3 ѡ����3
	 * @param xzt4 ѡ����4
	 * @param xzt5 ѡ����5 
	 * @param tkt1 �����1
	 * @param tkt2 �����2
	 * @param tkt3 �����3
	 * @param tkt4 �����4
	 * @param bct1 �����1
	 * @param bct2 �����2
	 */
	public Paper(Date starttime, Date endtime, String papername, int xzt1, int xzt2, int xzt3, int xzt4, int xzt5,
		int tkt1, int tkt2, int tkt3, int tkt4, int bct1, int bct2) {
		super();
		this.starttime = starttime;
		this.endtime = endtime;
		this.papername = papername;
		this.xzt1 = xzt1;
		this.xzt2 = xzt2;
		this.xzt3 = xzt3;
		this.xzt4 = xzt4;
		this.xzt5 = xzt5;
		this.tkt1 = tkt1;
		this.tkt2 = tkt2;
		this.tkt3 = tkt3;
		this.tkt4 = tkt4;
		this.bct1 = bct1;
		this.bct2 = bct2;
	}

	public Paper(Date starttime, Date endtime, String papername) {
			super();
			this.starttime = starttime;
			this.endtime = endtime;
			this.papername = papername;
		}
	
	public Paper(int xzt1, int xzt2, int xzt3, int xzt4, int xzt5) {
		super();
		this.xzt1 = xzt1;
		this.xzt2 = xzt2;
		this.xzt3 = xzt3;
		this.xzt4 = xzt4;
		this.xzt5 = xzt5;
	}
	public Paper(int tkt1, int tkt2, int tkt3, int tkt4) {
		super();
		this.tkt1 = tkt1;
		this.tkt2 = tkt2;
		this.tkt3 = tkt3;
		this.tkt4 = tkt4;
	}
	public Paper(int bct1, int bct2) {
		super();
		this.bct1 = bct1;
		this.bct2 = bct2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public java.util.Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public int getXzt1() {
		return xzt1;
	}
	public void setXzt1(int xzt1) {
		this.xzt1 = xzt1;
	}
	public int getXzt2() {
		return xzt2;
	}
	public void setXzt2(int xzt2) {
		this.xzt2 = xzt2;
	}
	public int getXzt3() {
		return xzt3;
	}
	public void setXzt3(int xzt3) {
		this.xzt3 = xzt3;
	}
	public int getXzt4() {
		return xzt4;
	}
	public void setXzt4(int xzt4) {
		this.xzt4 = xzt4;
	}
	public int getXzt5() {
		return xzt5;
	}
	public void setXzt5(int xzt5) {
		this.xzt5 = xzt5;
	}

	public int getTkt1() {
		return tkt1;
	}
	public void setTkt1(int tkt1) {
		this.tkt1 = tkt1;
	}
	public int getTkt2() {
		return tkt2;
	}
	public void setTkt2(int tkt2) {
		this.tkt2 = tkt2;
	}
	public int getTkt3() {
		return tkt3;
	}
	public void setTkt3(int tkt3) {
		this.tkt3 = tkt3;
	}
	public int getTkt4() {
		return tkt4;
	}
	public void setTkt4(int tkt4) {
		this.tkt4 = tkt4;
	}

	public int getBct1() {
		return bct1;
	}
	public void setBct1(int bct1) {
		this.bct1 = bct1;
	}
	public int getBct2() {
		return bct2;
	}
	public void setBct2(int bct2) {
		this.bct2 = bct2;
	}

}