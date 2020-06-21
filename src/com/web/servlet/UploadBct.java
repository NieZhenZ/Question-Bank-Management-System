package com.web.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.bean.BctAnswer;
import com.dao.l.BctAnswerInterfaceDao;
import com.dao.lmpl.BctAnswerInterfaceImplDao;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

public class UploadBct extends HttpServlet {
	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	private static final long serialVersionUID = 1L;
	
	public UploadBct() {
		super();
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 复用doPost方法
         doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	String BCT1 = request.getParameter("BCT1");
	String BCT2 = request.getParameter("BCT2");
	}
}

	/*
public class UploadBct extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UploadBct() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String stu = "fang";
		String papername = "测试试卷一";
SmartUpload su = new SmartUpload();
		
		PageContext pageContext=JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		// 初始化
		su.initialize(pageContext);
		// 设置文件上传可以的类型
		su.setAllowedFilesList("jpg,jpeg");
		// 设置上传单个文件的大小
		su.setMaxFileSize(1024 * 1024 * 10);// 10mb
		// 设置总上传文件的大小
		su.setTotalMaxFileSize(1024 * 1024 * 10 * 5);
		// 50mb
		try {
			su.upload();
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 开始处理上传
		// 获取被上传的文件
		Files sfs = su.getFiles();
		// 获取一个
		File sf = sfs.getFile(0);
		try {
			System.out.println( "   《《《htg" + sf.getFileName());
			sf.saveAs("/upload//"+sf.getFileName() ,1);
			System.out.println("   >>>>>>>" + sf.getFileName());
		} catch (SmartUploadException e) {
			e.printStackTrace();
		}
		String path1 = request.getServletContext().getRealPath("/")+"upload\\"+sf.getFileName();
		
//		SmartFile sf1 = sfs.getFile(1);
//		try {
//			sf1.saveAs("/upload//"+sf1.getFileName() ,1);
//		} catch (SmartUploadException e) {
//			e.printStackTrace();
//		}
		String path2 = path1;
		System.out.println("文件上传成功！");		
		System.out.println("  1111" + sf.getFileName()+"1111"+path1+"   "+ path2);
		BctAnswerInterfaceDao bai= new BctAnswerInterfaceImplDao();
		BctAnswer ba=new BctAnswer(stu,papername,path1,path2);		
		bai.insert(ba);
		request.getRequestDispatcher("student/index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}*/