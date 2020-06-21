package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Random;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Bct;
import com.bean.PaperString;
import com.bean.Tkt;
import com.bean.Xzt;
import com.util.QuestionInstance;

public class SelfTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SelfTest() {
        super();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
    	//Random random=new Random();
		ArrayList<Xzt> listx = new ArrayList<Xzt>();
		listx.add(QuestionInstance.getXzt(3));
		listx.add(QuestionInstance.getXzt(5));
		listx.add(QuestionInstance.getXzt(1));
		listx.add(QuestionInstance.getXzt(4));
		listx.add(QuestionInstance.getXzt(2));


		
		ArrayList<Tkt> listt = new ArrayList<Tkt>();
		listt.add(QuestionInstance.getTkt(7));
		listt.add(QuestionInstance.getTkt(8));
		listt.add(QuestionInstance.getTkt(6));
		listt.add(QuestionInstance.getTkt(9));
		
		ArrayList<Bct> listb = new ArrayList<Bct>();
		listb.add(QuestionInstance.getBct(2));
		listb.add(QuestionInstance.getBct(1));
		
		PaperString paperString=new PaperString(listx.get(0), listx.get(1), listx.get(2), listx.get(3), 
				listx.get(4),listt.get(0), listt.get(1), listt.get(2), listt.get(3), listb.get(1), 
				listb.get(0));
		request.getSession().setAttribute("selftest", paperString);
	System.out.println(paperString.toString());
		//将list数据发送到.jsp文件中,考虑重定向
		//区别于考试用的试卷，不计算成绩，直接点击查看正确答案
	//	request.getRequestDispatcher("student/selfTest.jsp").forward(request, response);

		response.sendRedirect("student/selfTest.jsp");
		}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}