<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<style type="text/css">
           *{
				margin: 0;
				padding: 0;
			}
			
			.header{
				width: 100%;
				height: 80px;
				/*background-color: blue;*/
				/*border: 1px solid black;*/
				background-image: url(images/logo.jpg);
			}
			.header p{
				font-size: 30px;
				color: white;
				text-align: center;
				line-height:80px;
				}
				.main{
					width: 100%;
					height: 800px;
					margin: 0 auto;
					/*border: 1px solid black;*/
				}
				.main #left{
					height: 100%;
					/*border: 1px solid black;*/
				}
				#dt1 p{
					line-height:100%;
					padding-top: 30px;
					font-size: 20px;
				}
				#dd1 li{
					list-style-type: none;
				}
				#dd1 li p{
					font-size: 20px;
				}
				#dd1 a{
					text-decoration: none;
					color: black;
				}
				#dd1 a:hover{
					color: lightseagreen;
				}
				.al{
					padding-top: 50px;
				}
				.al li{
					list-style-type: none;
				}
				#left .al p{
					font-size: 20px;
					color: black;
				}
				#left .al a {
					text-decoration: none;
				}
				.main #right{
					width: 100%;
					height: 100%;
					/*border: 1px solid black;*/
					float: left;
				}
				.clear{
					clear: both;
				}
				.footer{
				width: 100%;
				height: 50px;
				/*border: 1px black  solid;*/
				background-image: url(images/logo.jpg);
				
			}
			.copyright{
	           text-align: center;
				line-height: 50px;
			}
		</style>
    </head>
    <body>
<%
    String driverName = "com.mysql.cj.jdbc.Driver";
    String tableName = "student";
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");
    Statement statement = connection.createStatement();
    String sql = "SELECT * FROM " + tableName;
    ResultSet rs = statement.executeQuery(sql);
%>
  <form id="form1" name="form1" method="post" action="Deletestu" enctype="application/x-www-form-urlencoded">
   <div class="header">
		<a href="./teacher/index.jsp"><p>题库管理系统</p></a>
	</div>
	 <div class="main">
	 	<div>
	 		<span style="color: black;" class="h1">
   <table width="100%" height="100%" align="center">
   <thead>
    <tr>
        <th field ="1" width="50">用户名</th>
        <th field ="2" width="50">姓名</th>
        <th field ="3" width="50">性别</th>
        <th field ="4" width="50">班级</th>
        <th field ="5" width="50">电话</th>
        <th field ="6" width="50">邮箱</th>
        <th field ="7" width="50">操作</th>
    </tr>
    </thead>

        <tbody>
    <% 
        int i = 1;
        while (rs.next()) {
        
    %>
    <tr >
        <td align="center">
            <%
                out.print(rs.getString(2));
            %>
        </td>
        <td align="center">
            <%
                out.print(rs.getString(4));
            %>
        </td >
        <td align="center">
            <%
                out.print(rs.getString(5));
            %>
        </td>
        <td align="center">
            <%
                out.print(rs.getString(6));
            %>
        </td>
        <td align="center">
            <%
                out.print(rs.getString(7));
            %>
        </td>
        <td align="center">
            <%
                out.print(rs.getString(8));
            %>
        </td >
         <td align="center">
          <input class="confirm" type="submit" name="<%=i%>" value="删除" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
        </td>
    </tr>
    </tbody>

    <%
       i++; }
    %>
       </table>
       </form>
	 <div class="clear"></div>
 	</body>
</html>