package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.bean.Bct;
import com.bean.Paper;
import com.bean.Student;
import com.bean.Students;
import com.bean.Xzt;
import com.dao.l.BctInterfaceDao;
import com.dao.l.TeacherInterfaceDao;
import com.dao.l.TktInterfaceDao;
import com.dao.l.XztInterfaceDao;
import com.dao.lmpl.BctInterfaceImplDao;
import com.dao.lmpl.PaperInterfaceImplDao;
import com.dao.lmpl.StudentInterfaceImplDao;
import com.dao.lmpl.TeacherInterfaceImplDao;
import com.dao.lmpl.TktInterfaceImplDao;
import com.db.DBUtil;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.Timestamp;
import java.text.*;
import java.lang.Integer;
public class Deletestu extends HttpServlet {
	static Connection con;
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
    public Deletestu() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String shan_1=request.getParameter("1");
        String shan_2=request.getParameter("2");
        int id = 0;
        if(shan_1!=null)
        {
          id = 1;
        }
        if(shan_2!=null)
        {
          id = 2;
        }
	    String message1 = null;
	    String message2 = null;
		Students student = new Students(id);
		System.out.println(student.toString());
		try {
				con=DBUtil.getConnection();
				if(new StudentInterfaceImplDao().deleteid(student,con)){
					message1 = String.format(
							"删除成功");
					message2 = String.format(
								"<meta http-equiv='refresh' content='0;url=%s'", 
								request.getContextPath()+"/StudentSelf.jsp");
					System.out.println("删除成功");
				}else {
					 message1 = String.format(
								"对不起，删除失败！请重新尝试");
				}				
				request.setAttribute("message1",message1);
				request.setAttribute("message2",message2);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}