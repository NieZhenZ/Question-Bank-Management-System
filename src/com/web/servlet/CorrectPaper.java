package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BctAnswer;
import com.dao.l.BctAnswerInterfaceDao;
import com.dao.lmpl.BctAnswerInterfaceImplDao;


public class CorrectPaper extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CorrectPaper() {
        super();
        // TODO Auto-generated constructor stub
    }

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+"123");
		String studentname=request.getParameter("studentname");
		String papername=request.getParameter("papername");
		String papertype=request.getParameter("papertype");
		//String studentname=request.getParameter("fang");
		//String papername=request.getParameter("�����Ծ��");
		//studentname="fang";
		//papername="�����Ծ��";
		BctAnswerInterfaceDao bf=new BctAnswerInterfaceImplDao();
		List<BctAnswer> bca=new ArrayList<BctAnswer>();
		List<BctAnswer> bcw=new ArrayList<BctAnswer>();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+"456");
		bca=bf.select(studentname, papername);//wp
		bcw=bf.selectwp(studentname, papername);//yp
		System.out.println(bca.toString());
		System.out.println(bcw.toString());
		bca.forEach(i->System.out.println(i.toString()+"123"));
		bcw.forEach(i->System.out.println(i.toString()+"456"));
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+"789");
		request.getSession().setAttribute("Bctanwseryp", bcw);
		request.getSession().setAttribute("Bctanwserwp", bca);
		System.out.println(papertype);
		if (papertype.equals("2"))
		{
			//�ض���
			response.sendRedirect("teacher/uncompletePaper2.jsp");
		}
		else
		{
			//�ض���
			response.sendRedirect("teacher/completePaper2.jsp");
		}
		
//��ǰ�˴�������
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}