<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>管理员管理教师</title>
        <link rel="stylesheet" href="css/mangerTeacher.css" />
        <script type="text/javascript" src="js/managerteacher.js" ></script>
        
        <style type="text/css">
        	#popupcontent{ 
            position: absolute; 
            visibility: hidden; 
            overflow: hidden; 
            border:1px solid #CCC; 
            background-color:#F9F9F9; 
            border:1px solid #333; 
            padding:5px; 
            } 
            .bd {
            	
            	text-align: right;
            }
            .j{
            	margin-left: 150px;
            	margin-top: 30px;
            	width: 60px;
            	height: 30px;
            	background-color: lightblue;
            }

           .mm{
           	margin-top: 50px;
           	margin-left:20px ;
           }
           #b1{
           	   width: 80px;
                height: 40px;
            	background-color: lightblue;
           }
           #s{
           	width: 40px;
           	height: 30px;
           	background-color: lightblue;
           }
           .t{
           	border-color: gainsboro;
           }

        </style>
    </head>
    <body>
<%
    String driverName = "com.mysql.cj.jdbc.Driver";
    String tableName = "teacher";
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");
    Statement statement = connection.createStatement();
    String sql = "SELECT * FROM " + tableName;
    ResultSet rs = statement.executeQuery(sql);
%>
 <form id="form1" name="form1" method="post" action="../Deletetea" enctype="application/x-www-form-urlencoded">
		<div class="header">
			<p><a href="index.jsp">题库管理系统</a></p>
		</div>
    	<div class="main">
    		<table width="100%" >
    			<tr>
    				<td><p class="js">教师信息</p></td>
    				<!--<td><p class="tj" ><a href="managerTeacher0.jsp">添加教师</a></td>-->
    					<td style="text-align: right;">
    					<a class="confirm" href="registertea.jsp" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;">添加教师 </a>
    					</td>
    			</tr>
    		</table>
   <table width="100%" height="50px" align="center">
   <thead>
    <tr>
        <th field ="1" width="50">用户名</th>
        <th field ="2" width="50">姓名</th>
        <th field ="3" width="50">性别</th>
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
          <input class="confirm" type="submit" name="<%=i%>" value="删除" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
        </td>
    </tr>
    </tbody>

    <%
       i++; }
    %>
       </table>
       </div>
     </form>
	 <div class="clear"></div>
   </body>
</html>