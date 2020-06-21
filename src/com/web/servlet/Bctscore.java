package com.web.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BctAnswer;
import com.bean.Paper;
import com.bean.StudentGrade;
import com.dao.l.BctAnswerInterfaceDao;
import com.dao.lmpl.BctAnswerInterfaceImplDao;
import com.dao.lmpl.PaperInterfaceImplDao;
import com.dao.lmpl.StudentGradeInterfaceImplDao;
import com.db.DBUtil;


public class Bctscore extends HttpServlet {
	static Connection con;
	private static final long serialVersionUID = 1L;

    public Bctscore() {
        super();
        // TODO Auto-generated constructor stub
    }

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String papername = request.getParameter("papername");
	    String score1 = request.getParameter("score1");
	    String score2 = request.getParameter("score2");
	    int score2_2 = Integer.parseInt(score2);
	    int score1_1 = Integer.parseInt(score1);
	    int score = score1_1 + score2_2;
	    
	    String message1 = null;
	    String message2 = null;
	    StudentGrade studentgrade = new StudentGrade(score,username, papername);
		System.out.println(studentgrade.toString());
		try {
				con=DBUtil.getConnection();
				if(new StudentGradeInterfaceImplDao().updatesc(studentgrade,con)){
					message1 = String.format(
							"恭喜！批改成功");
					message2 = String.format(
							"<meta http-equiv='refresh' content='0;url=%s'", 
							request.getContextPath()+"/teacher/checkPaper.jsp");
					System.out.println("插入成功");
				}else {
					 message1 = String.format(
								"对不起，批改失败！请重新尝试");
				}				
				request.setAttribute("message1",message1);
				request.setAttribute("message2",message2);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	    
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}