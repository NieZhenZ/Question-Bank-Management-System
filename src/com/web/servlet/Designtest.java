package com.web.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Paper;
import com.dao.l.PaperInterfaceDao;
import com.dao.lmpl.PaperInterfaceImplDao;

public class Designtest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Designtest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//xzt
		
		SimpleDateFormat strToDate=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date starttime=new Date();
		Date endtime=new Date();
		try {
			starttime=strToDate.parse(request.getParameter("starttime"));	
			endtime=strToDate.parse(request.getParameter("endtime"));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String[] str = request.getParameterValues("xzt");
		
		
		String papername = request.getParameter("papername");
		int[] a = new int[str.length];
		for(int i  = 0; i< str.length ; i++) {
			a[i]=Integer.parseInt(str[i]);
		}
		
	
		//tkt
		
			String[] str1 = request.getParameterValues("tkt");
			int[] b = new int[str1.length];
			for(int i  = 0; i< str1.length ; i++) {
				b[i]=Integer.parseInt(str1[i]);
			}
			
			
			//bct
			
			String[] str2 = request.getParameterValues("bct");
			int[] c = new int[str2.length];
			for(int i  = 0; i<= str2.length ; i++) {
				c[i]=Integer.parseInt(str2[i]);
				System.out.println(c[0]);
				System.out.println(c[1]);
				
			}
			
	
	Paper paper=new Paper(starttime,endtime,papername,a[0],a[1],a[2],a[3],a[4],b[0],b[1],b[2],b[3],c[0],c[1]);
	 PaperInterfaceDao p = new PaperInterfaceImplDao();
	 p.insert(paper);
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}