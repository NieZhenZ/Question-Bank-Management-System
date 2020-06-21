/**　RegisterServlet担任着以下几个职责：
1、接收客户端提交到服务端的表单数据。
2、校验表单数据的合法性，如果校验失败跳回到register.jsp，并回显错误信息。
3、如果校验通过，调用service层向数据库中注册用户
*/

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

import com.bean.Student;
import com.bean.Teachers;
import com.dao.lmpl.ManagerInterfaceImplDao;
import com.dao.lmpl.StudentInterfaceImplDao;
import com.db.DBUtil;

/**
 * Servlet implementation class Register
 */

public class Registertea extends HttpServlet {

	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registertea() {
		super();
	}

	public void destroy() {
		super.destroy();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 复用doPost方法
         doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		String realname = request.getParameter("realname");

		Teachers s = new Teachers(username, password, realname);
		System.out.println(s.toString());

		String message1 = null;
		String message2 = null;
		try {
			con = DBUtil.getConnection();
			if (new ManagerInterfaceImplDao().inserttea(s, con)) {
				 message1 = String.format(
							"恭喜！注册成功");
				 
				 message2 = String.format(
						"<meta http-equiv='refresh' content='0;url=%s'", 
						request.getContextPath()+"/manager/managerTeacher.jsp");
			} else {
				 message1 = String.format(
							"对不起，注册失败！请重新尝试");
				
			}
                request.setAttribute("message1",message1);
				request.setAttribute("message2",message2);
				request.getRequestDispatcher("/message.jsp").forward(request, response);
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}


}