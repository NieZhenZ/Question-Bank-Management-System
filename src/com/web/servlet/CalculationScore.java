package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Paper;
import com.bean.PaperString;
import com.bean.Student;
import com.bean.StudentGrade;
import com.service.I.StudentGradeInterfaceBiz;
import com.service.Impl.StudentGradeInterfaceImplBiz;
import com.util.QuestionInstance;

public class CalculationScore extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CalculationScore() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] xzt = request.getParameterValues("xzt");
		String[] tkt = request.getParameterValues("tkt");
		Paper pap = (Paper) request.getSession().getAttribute("paper");
		Student stu = (Student) request.getSession().getAttribute("student");
		PaperString ps = QuestionInstance.changeToPaperString(pap);
		String[] answer = new String[9];
	    	answer[0]=ps.getXzt1an();
	    	answer[1]=ps.getXzt2an();
	    	answer[2]=ps.getXzt3an();
	    	answer[3]=ps.getXzt4an();
	    	answer[4]=ps.getXzt5an();
	    	answer[5]=ps.getTkt1an();
	    	answer[6]=ps.getTkt2an();
	    	answer[7]=ps.getTkt3an();
	    	answer[8]=ps.getTkt4an();	    
	    int xztright = 0;
	    int tktright = 0;
		for(int  i  = 0;i< 5;i++){
			if(xzt.equals(answer[i])){
				xztright ++;
			}			
		}
		for(int j =5;j<9;j++){
			if(tkt.equals(answer[j])){
				tktright ++;
			}
		}
		StudentGrade sGrade = new StudentGrade(stu.getUsername(),xztright*5,tktright*5,pap.getPapername());
		StudentGradeInterfaceBiz studentGradeInterfaceBiz=new StudentGradeInterfaceImplBiz();
		studentGradeInterfaceBiz.insert(sGrade);
		
}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}