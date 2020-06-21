package com.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.l.ManagerInterfaceDao;
import com.dao.lmpl.ManagerInterfaceImplDao;


/**
 * Servlet implementation class cjservlet
 */



public class ShowManagerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ShowManagerInfo() {
        super();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		ManagerInterfaceDao tid=new ManagerInterfaceImplDao();
		//����Manager��
		request.setAttribute("Manager", tid.showManagerInfo(request.getParameter("username")));			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		//��list���ݷ��͵�.jsp�ļ���
		request.getRequestDispatcher("ManagerSelf.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}