package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.PageContext;

import com.bean.Bct;
import com.bean.Tkt;
import com.bean.Xzt;
import com.dao.l.BctInterfaceDao;
import com.dao.l.TeacherInterfaceDao;
import com.dao.l.TktInterfaceDao;
import com.dao.l.XztInterfaceDao;
import com.dao.lmpl.BctInterfaceImplDao;
import com.dao.lmpl.TeacherInterfaceImplDao;
import com.dao.lmpl.TktInterfaceImplDao;
import com.dao.lmpl.XztInterfaceImplDao;
import com.db.DBUtil;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;


public class InsertQuestion extends HttpServlet {
	static Connection con;
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
    public InsertQuestion() {
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
	String a = request.getParameter("questiontype");
	if(a.equals("xzt")||a.equals("bct")||a.equals("tkt")){
		
	if(a.equals("xzt")){
		String question  = request.getParameter("question");
		String answer = request.getParameter("answer");
		String OptionA  = request.getParameter("OptionA");
		String OptionB  = request.getParameter("OptionB");
		String OptionC  = request.getParameter("OptionC");
		String OptionD  = request.getParameter("OptionD");
			
        //System.out.println(question);
	    String questionpoint = "java";
		Xzt xzt = new Xzt(question,answer,OptionA,OptionB,OptionC,OptionD,questionpoint);
		System.out.println(xzt.toString());
		//con=DBUtil.getConnection();
		String message1 = null;
		try {
				con=DBUtil.getConnection();
				if(new XztInterfaceImplDao().insert(xzt,con)){
					message1 = String.format(
							"��ϲ������ɹ�");
					System.out.println("xzt����ɹ�");
				}else {
					 message1 = String.format(
								"�Բ��𣬲���ʧ�ܣ������³���");
				}
				request.setAttribute("message1",message1);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	if(a.equals("tkt")){
		String question  = request.getParameter("questiontk");
		String answer = request.getParameter("answertk");
			
        //System.out.println(question);
	    String questionpoint = "java";
	    Tkt tkt = new Tkt(question,answer,questionpoint);
		System.out.println(tkt.toString());
		//con=DBUtil.getConnection();
		String message2 = null;
		try {
				con=DBUtil.getConnection();
				if(new TktInterfaceImplDao().insert(tkt,con)){
					message2 = String.format(
							"��ϲ������ɹ�");
					System.out.println("xzt����ɹ�");
				}else {
					 message2 = String.format(
								"�Բ��𣬲���ʧ�ܣ������³���");
					
				}
				request.setAttribute("message1",message2);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	else if(a.equals("bct")){
		String question  = request.getParameter("questionbc");
		String questionpoint = "java";
		Bct bct = new Bct(question,questionpoint);
		System.out.println(bct.toString());
		String message3 = null;
		try {
			con=DBUtil.getConnection();
			if(new BctInterfaceImplDao().insert(bct,con)){
				message3 = String.format(
						"��ϲ������ɹ�");
				System.out.println("xzt����ɹ�");
			}else {
				 message3 = String.format(
							"�Բ��𣬲���ʧ�ܣ������³���");
				
			}
			request.setAttribute("message1",message3);
			request.getRequestDispatcher("/message.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
else{
		
		/**
		 * �����߼���
		 */
		SmartUpload su = new SmartUpload();
		
		PageContext pageContext=JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true, 8192, true);
		// ��ʼ��
		su.initialize(pageContext);
		// �����ļ��ϴ����Ե�����
		su.setAllowedFilesList("xls,xlsx");
		// �����ϴ������ļ��Ĵ�С
		su.setMaxFileSize(1024 * 1024 * 10);// 10mb
		// �������ϴ��ļ��Ĵ�С
		su.setTotalMaxFileSize(1024 * 1024 * 10 * 5);
		// 50mb
		try {
			su.upload();
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// ��ʼ�����ϴ�
		// ��ȡ���ϴ����ļ�
		//SmartRequest sRequest=su.getRequest();
	
		Files sfs = su.getFiles();
		// ��ȡһ��
		File sf = sfs.getFile(0);
		try {
			//String fname = sf.getFileName();
			System.out.println(a + "   >>>>>>>" + sf.getFileName());
			//sf.saveAs("/upload//"+sf.getFileName() ,1);
			sf.saveAs("/upload//"+sf.getFileName() ,1);
		} catch (SmartUploadException e) {
			e.printStackTrace();
		}
		String path = request.getServletContext().getRealPath("/");
		System.out.println("�ļ��ϴ��ɹ���");
		TeacherInterfaceDao teacherInterfaceDao = new TeacherInterfaceImplDao();
		System.out.println("  1111   " + sf.getFileName()+"1111"+path);
		
		
		
		 if(a.equals("xztbatch")){
			int b = 1;
			try {
				if(teacherInterfaceDao.batchquestion(b,sf.getFileName(),path)){
				System.out.println("xzt����ɹ�");}
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		else if(a.equals("tktbatch")){
			int b = 2;
			try {
				if(teacherInterfaceDao.batchquestion(b,sf.getFileName(),path)){	
				System.out.println("tkt����ɹ�");}
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		else{
			int b = 3;
			try {
				if(teacherInterfaceDao.batchquestion(b,sf.getFileName(),path)){
				System.out.println("bct����ɹ�");}
			} catch (SQLException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//��תҳ�����
		
	}



}}