package com.bean;

import java.util.Date;
/**
 * 把题目封装成试卷的片段
 * @author chaizhi
 *
 */
public class PaperString {
	private int id;
	private Date starttime;
	private Date endtime;
	private String papername;
	
	
	private String xzt1qu;
	private String xzt1an;
	private String xzt1opA;
	private String xzt1opB;
	private String xzt1opC;
	private String xzt1opD;
	
	private String xzt2qu;
	private String xzt2an;
	private String xzt2opA;
	private String xzt2opB;
	private String xzt2opC;
	private String xzt2opD;
	
	private String xzt3qu;
	private String xzt3an;
	private String xzt3opA;
	private String xzt3opB;
	private String xzt3opC;
	private String xzt3opD;
	
	private String xzt4qu;
	private String xzt4an;
	private String xzt4opA;
	private String xzt4opB;
	private String xzt4opC;
	private String xzt4opD;
	
	private String xzt5qu;
	private String xzt5an;
	private String xzt5opA;
	private String xzt5opB;
	private String xzt5opC;
	private String xzt5opD;
	
	private String tkt1qu;
	private String tkt1an;
	
	private String tkt2qu;
	private String tkt2an;
	
	private String tkt3qu;
	private String tkt3an;
	
	private String tkt4qu;
	private String tkt4an;
	
	
	private String bct1qu;
	private String bct2qu;
	
	public PaperString(Xzt xzt1,Xzt xzt2, Xzt xzt3, Xzt xzt4, Xzt xzt5, 
			Tkt tkt1,Tkt tkt2,Tkt tkt3,Tkt tkt4,
			Bct bct1,Bct bct2) {

		 xzt1qu=xzt1.getQuestion();
	     xzt1an=xzt1.getAnswer();
         xzt1opA=xzt1.getOptionA();
		 xzt1opB=xzt1.getOptionB();
	     xzt1opC=xzt1.getOptionC();
		 xzt1opD=xzt1.getOptionD();
		
		 xzt2qu=xzt2.getQuestion();
	     xzt2an=xzt2.getAnswer();
         xzt2opA=xzt2.getOptionA();
		 xzt2opB=xzt2.getOptionB();
	     xzt2opC=xzt2.getOptionC();
		 xzt2opD=xzt2.getOptionD();
		 
		 xzt3qu=xzt3.getQuestion();
	     xzt3an=xzt3.getAnswer();
         xzt3opA=xzt3.getOptionA();
		 xzt3opB=xzt3.getOptionB();
	     xzt3opC=xzt3.getOptionC();
		 xzt3opD=xzt3.getOptionD();
		 
		 xzt4qu=xzt4.getQuestion();
	     xzt4an=xzt4.getAnswer();
         xzt4opA=xzt4.getOptionA();
		 xzt4opB=xzt4.getOptionB();
	     xzt4opC=xzt4.getOptionC();
		 xzt4opD=xzt4.getOptionD();
		 
		 xzt5qu=xzt5.getQuestion();
	     xzt5an=xzt5.getAnswer();
         xzt5opA=xzt5.getOptionA();
		 xzt5opB=xzt5.getOptionB();
	     xzt5opC=xzt5.getOptionC();
		 xzt5opD=xzt5.getOptionD();
		 
		 xzt1qu=xzt1.getQuestion();
	     xzt1an=xzt1.getAnswer();
         xzt1opA=xzt1.getOptionA();
		 xzt1opB=xzt1.getOptionB();
	     xzt1opC=xzt1.getOptionC();
		 xzt1opD=xzt1.getOptionD();
		 
		 tkt1qu=tkt1.getQuestion();
		 tkt1an=tkt1.getAnswer();
		 
		 tkt2qu=tkt2.getQuestion();
		 tkt2an=tkt2.getAnswer();
		 
		 tkt3qu=tkt3.getQuestion();
		 tkt3an=tkt3.getAnswer();
		 
		 tkt4qu=tkt4.getQuestion();
		 tkt4an=tkt4.getAnswer();
		 
		 
		 bct1qu=bct1.getQuestion();
		
		 bct2qu=bct2.getQuestion();

	}
	
	


	@Override
	public String toString() {
		System.out.println("PaperString:");
		System.out.println("id=" + id + ", starttime=" + starttime + ", endtime=" + endtime + ", papername="+ papername);
		System.out.println("xzt1qu:" + xzt1qu);
		System.out.println("xzt1an"+xzt1an);
		System.out.println("A:"+xzt1opA);
		System.out.println("B:"+xzt1opB);
		System.out.println("C:"+xzt1opC);
		System.out.println("D:"+xzt1opD);
		
		System.out.println("xzt2qu:" + xzt2qu);
		System.out.println("xzt2an"+xzt2an);
		System.out.println("A:"+xzt1opA);
		System.out.println("B:"+xzt1opB);
		System.out.println("C:"+xzt1opC);
		System.out.println("D:"+xzt1opD);
		
		System.out.println("xzt3qu:" + xzt3qu);
		System.out.println("xzt3an"+xzt3an);
		System.out.println("A:"+xzt1opA);
		System.out.println("B:"+xzt1opB);
		System.out.println("C:"+xzt1opC);
		System.out.println("D:"+xzt1opD);
		
		System.out.println("xzt4qu:" + xzt4qu);
		System.out.println("xzt4an"+xzt4an);
		System.out.println("A:"+xzt1opA);
		System.out.println("B:"+xzt1opB);
		System.out.println("C:"+xzt1opC);
		System.out.println("D:"+xzt1opD);
		
		
		return "xzt1qu=" + xzt1qu + ", xzt1an=" + xzt1an + ", xzt1opA=" + xzt1opA + ", xzt1opB="
				+ xzt1opB + ", xzt1opC=" + xzt1opC + ", xzt1opD=" + xzt1opD + ", xzt2qu=" + xzt2qu + ", xzt2an="
				+ xzt2an + ", xzt2opA=" + xzt2opA + ", xzt2opB=" + xzt2opB + ", xzt2opC=" + xzt2opC + ", xzt2opD="
				+ xzt2opD + ", xzt3qu=" + xzt3qu + ", xzt3an=" + xzt3an + ", xzt3opA=" + xzt3opA + ", xzt3opB="
				+ xzt3opB + ", xzt3opC=" + xzt3opC + ", xzt3opD=" + xzt3opD + ", xzt4qu=" + xzt4qu + ", xzt4an="
				+ xzt4an + ", xzt4opA=" + xzt4opA + ", xzt4opB=" + xzt4opB + ", xzt4opC=" + xzt4opC + ", xzt4opD="
				+ xzt4opD + ", xzt5qu=" + xzt5qu + ", xzt5an=" + xzt5an + ", xzt5opA=" + xzt5opA + ", xzt5opB="
				+ xzt5opB + ", xzt5opC=" + xzt5opC + ", xzt5opD=" + xzt5opD + ", tkt1qu=" + tkt1qu + ", tkt1an=" + tkt1an + ", tkt2qu=" + tkt2qu
				+ ", tkt2an=" + tkt2an + ", tkt3qu=" + tkt3qu + ", tkt3an=" + tkt3an + ", tkt4qu=" + tkt4qu
				+ ", tkt4an=" + tkt4an + ", bct1qu=" + bct1qu
				+ ", bct2qu=" + bct2qu + "]";
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(java.util.Date starttime) {
		this.starttime = starttime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(java.util.Date endtime) {
		this.endtime = endtime;
	}
	public String getPapername() {
		return papername;
	}
	public void setPapername(String papername) {
		this.papername = papername;
	}
	public String getXzt1qu() {
		return xzt1qu;
	}
	public void setXzt1qu(String xzt1qu) {
		this.xzt1qu = xzt1qu;
	}
	public String getXzt1an() {
		return xzt1an;
	}
	public void setXzt1an(String xzt1an) {
		this.xzt1an = xzt1an;
	}
	public String getXzt1opA() {
		return xzt1opA;
	}
	public void setXzt1opA(String xzt1opA) {
		this.xzt1opA = xzt1opA;
	}
	public String getXzt1opB() {
		return xzt1opB;
	}
	public void setXzt1opB(String xzt1opB) {
		this.xzt1opB = xzt1opB;
	}
	public String getXzt1opC() {
		return xzt1opC;
	}
	public void setXzt1opC(String xzt1opC) {
		this.xzt1opC = xzt1opC;
	}
	public String getXzt1opD() {
		return xzt1opD;
	}
	public void setXzt1opD(String xzt1opD) {
		this.xzt1opD = xzt1opD;
	}
	public String getXzt2qu() {
		return xzt2qu;
	}
	public void setXzt2qu(String xzt2qu) {
		this.xzt2qu = xzt2qu;
	}
	public String getXzt2an() {
		return xzt2an;
	}
	public void setXzt2an(String xzt2an) {
		this.xzt2an = xzt2an;
	}
	public String getXzt2opA() {
		return xzt2opA;
	}
	public void setXzt2opA(String xzt2opA) {
		this.xzt2opA = xzt2opA;
	}
	public String getXzt2opB() {
		return xzt2opB;
	}
	public void setXzt2opB(String xzt2opB) {
		this.xzt2opB = xzt2opB;
	}
	public String getXzt2opC() {
		return xzt2opC;
	}
	public void setXzt2opC(String xzt2opC) {
		this.xzt2opC = xzt2opC;
	}
	public String getXzt2opD() {
		return xzt2opD;
	}
	public void setXzt2opD(String xzt2opD) {
		this.xzt2opD = xzt2opD;
	}
	public String getXzt3qu() {
		return xzt3qu;
	}
	public void setXzt3qu(String xzt3qu) {
		this.xzt3qu = xzt3qu;
	}
	public String getXzt3an() {
		return xzt3an;
	}
	public void setXzt3an(String xzt3an) {
		this.xzt3an = xzt3an;
	}
	public String getXzt3opA() {
		return xzt3opA;
	}
	public void setXzt3opA(String xzt3opA) {
		this.xzt3opA = xzt3opA;
	}
	public String getXzt3opB() {
		return xzt3opB;
	}
	public void setXzt3opB(String xzt3opB) {
		this.xzt3opB = xzt3opB;
	}
	public String getXzt3opC() {
		return xzt3opC;
	}
	public void setXzt3opC(String xzt3opC) {
		this.xzt3opC = xzt3opC;
	}
	public String getXzt3opD() {
		return xzt3opD;
	}
	public void setXzt3opD(String xzt3opD) {
		this.xzt3opD = xzt3opD;
	}
	public String getXzt4qu() {
		return xzt4qu;
	}
	public void setXzt4qu(String xzt4qu) {
		this.xzt4qu = xzt4qu;
	}
	public String getXzt4an() {
		return xzt4an;
	}
	public void setXzt4an(String xzt4an) {
		this.xzt4an = xzt4an;
	}
	public String getXzt4opA() {
		return xzt4opA;
	}
	public void setXzt4opA(String xzt4opA) {
		this.xzt4opA = xzt4opA;
	}
	public String getXzt4opB() {
		return xzt4opB;
	}
	public void setXzt4opB(String xzt4opB) {
		this.xzt4opB = xzt4opB;
	}
	public String getXzt4opC() {
		return xzt4opC;
	}
	public void setXzt4opC(String xzt4opC) {
		this.xzt4opC = xzt4opC;
	}
	public String getXzt4opD() {
		return xzt4opD;
	}
	public void setXzt4opD(String xzt4opD) {
		this.xzt4opD = xzt4opD;
	}
	public String getXzt5qu() {
		return xzt5qu;
	}
	public void setXzt5qu(String xzt5qu) {
		this.xzt5qu = xzt5qu;
	}
	public String getXzt5an() {
		return xzt5an;
	}
	public void setXzt5an(String xzt5an) {
		this.xzt5an = xzt5an;
	}
	public String getXzt5opA() {
		return xzt5opA;
	}
	public void setXzt5opA(String xzt5opA) {
		this.xzt5opA = xzt5opA;
	}
	public String getXzt5opB() {
		return xzt5opB;
	}
	public void setXzt5opB(String xzt5opB) {
		this.xzt5opB = xzt5opB;
	}
	public String getXzt5opC() {
		return xzt5opC;
	}
	public void setXzt5opC(String xzt5opC) {
		this.xzt5opC = xzt5opC;
	}
	public String getXzt5opD() {
		return xzt5opD;
	}
	public void setXzt5opD(String xzt5opD) {
		this.xzt5opD = xzt5opD;
	}
	public String getTkt1qu() {
		return tkt1qu;
	}
	public void setTkt1qu(String tkt1qu) {
		this.tkt1qu = tkt1qu;
	}
	public String getTkt1an() {
		return tkt1an;
	}
	public void setTkt1an(String tkt1an) {
		this.tkt1an = tkt1an;
	}
	public String getTkt2qu() {
		return tkt2qu;
	}
	public void setTkt2qu(String tkt2qu) {
		this.tkt2qu = tkt2qu;
	}
	public String getTkt2an() {
		return tkt2an;
	}
	public void setTkt2an(String tkt2an) {
		this.tkt2an = tkt2an;
	}
	public String getTkt3qu() {
		return tkt3qu;
	}
	public void setTkt3qu(String tkt3qu) {
		this.tkt3qu = tkt3qu;
	}
	public String getTkt3an() {
		return tkt3an;
	}
	public void setTkt3an(String tkt3an) {
		this.tkt3an = tkt3an;
	}
	public String getTkt4qu() {
		return tkt4qu;
	}
	public void setTkt4qu(String tkt4qu) {
		this.tkt4qu = tkt4qu;
	}
	public String getTkt4an() {
		return tkt4an;
	}
	public void setTkt4an(String tkt4an) {
		this.tkt4an = tkt4an;
	}
	public String getBct1qu() {
		return bct1qu;
	}
	public void setBct1qu(String bct1qu) {
		this.bct1qu = bct1qu;
	}
	public String getBct2qu() {
		return bct2qu;
	}
	public void setBct2qu(String bct2qu) {
		this.bct2qu = bct2qu;
	}

}
