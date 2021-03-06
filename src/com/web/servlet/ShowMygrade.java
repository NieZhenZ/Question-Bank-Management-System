package com.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.service.I.StudentInterfaceBiz;
import com.service.Impl.StudentInterfaceImplBiz;


public class ShowMygrade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowMygrade() {
    	super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	StudentInterfaceBiz sid=new StudentInterfaceImplBiz();
    	//String stu=((Student)request.getSession().getAttribute("Student")).getUsername();
    	String stu=request.getParameter("studentname");
    	System.out.println(stu);
    	System.out.println("1");
    	try {
    		//后期加上request.getparameter("studentname")即可
			request.getSession().setAttribute("mygradelist", sid.stucj(stu));
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	//将list数据发送到.jsp文件中
		//request.getRequestDispatcher("student/studentResult.jsp").forward(request, response);
		//重定向
		response.sendRedirect("student/studentResult.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}