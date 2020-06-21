package com.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.User;
import com.dao.l.TeacherInterfaceDao;
import com.dao.lmpl.TeacherInterfaceImplDao;



public class ShowStudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentInfo() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TeacherInterfaceDao teacherInterfaceDao = new TeacherInterfaceImplDao();
		String[] studentclass = null;
		try {
			studentclass = teacherInterfaceDao.selectclass();
		} catch (SQLException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		
			
			request.getSession().setAttribute("studentclass", studentclass);
		//����Ҫ��service���װ
		
	
		response.sendRedirect("teacher/StudentSelf.jsp");
		
	}

}