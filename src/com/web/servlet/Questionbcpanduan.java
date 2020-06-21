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
import com.bean.Xzt;
import com.dao.l.BctInterfaceDao;
import com.dao.l.TeacherInterfaceDao;
import com.dao.l.TktInterfaceDao;
import com.dao.l.XztInterfaceDao;
import com.dao.lmpl.BctInterfaceImplDao;
import com.dao.lmpl.PaperInterfaceImplDao;
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
public class Questionbcpanduan extends HttpServlet {
	static Connection con;
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
    public Questionbcpanduan() {
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
		String checkbox_1=request.getParameter("1");
        String checkbox_2=request.getParameter("2");
        String checkbox_3=request.getParameter("3");
        String checkbox_4=request.getParameter("4");
        String checkbox_5=request.getParameter("5");
        String checkbox_6=request.getParameter("6");
        String checkbox_7=request.getParameter("7");
        String checkbox_8=request.getParameter("8");
        String checkbox_9=request.getParameter("9");
        String checkbox_10=request.getParameter("10");
        int[] shuzu = new int[2];
        int ti = 0;
        if(checkbox_1!=null)
        {
          shuzu[ti] = Integer.parseInt(checkbox_1);
          ti++;
        }
        if(checkbox_2!=null)
        {
          shuzu[ti] = Integer.parseInt(checkbox_2);
          ti++;
        }
        if(checkbox_3!=null)
        {
          shuzu[ti] = Integer.parseInt(checkbox_3);
          ti++;
        }
        if(checkbox_4!=null)
        {
           shuzu[ti] = Integer.parseInt(checkbox_4);
           ti++;
        }
        if(checkbox_5!=null)
        {
           shuzu[ti] = Integer.parseInt(checkbox_5);
           ti++;
        }
        if(checkbox_6!=null)
        {
           shuzu[ti] = Integer.parseInt(checkbox_6);
           ti++;
        }
        if(checkbox_7!=null)
        {
           shuzu[ti] = Integer.parseInt(checkbox_7);
           ti++;
        }
        if(checkbox_8!=null)
        {
           shuzu[ti] = Integer.parseInt(checkbox_8);
           ti++;
        }
        if(checkbox_9!=null)
        {
           shuzu[ti] = Integer.parseInt(checkbox_9);
           ti++;
        }
        if(checkbox_10!=null)
        {
           shuzu[ti] = Integer.parseInt(checkbox_10);
           ti++;
        }
	    String message1 = null;
		Paper paper = new Paper(shuzu[0], shuzu[1]);
		System.out.println(paper.toString());
		try {
				con=DBUtil.getConnection();
				if(new PaperInterfaceImplDao().insertbc(paper,con)){
					message1 = String.format(
							"恭喜！插入成功");
					System.out.println("插入成功");
				}else {
					 message1 = String.format(
								"对不起，插入失败！请重新尝试");
				}				
				request.setAttribute("message1",message1);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}