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
        <title>查看试卷</title>
        <link rel="stylesheet" href="css/seePaper.css" />
        <script type="text/javascript" src="js/seePaper2.js" ></script>
    </head>
    <body>
<%

    String driverName = "com.mysql.cj.jdbc.Driver";
    String tableName = "paper";
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");
    Statement statement = connection.createStatement();
    String sql = "SELECT * FROM " + tableName;
    ResultSet rs = statement.executeQuery(sql);
%>

	 <div class="header">
		<a href="index.jsp"><p>题库管理系统</p></a>
	</div>
	 <div class="main">
	 	<div>
	 		<span style="color: black;" class="h1">
   <table width="100%" height="100%" align="center">
   <thead>
    <tr>
        <th field ="1" width="100">试卷名</th>
        <th field ="2" width="100">开始时间</th>
        <th field ="3" width="100">结束时间</th>
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
                out.print(rs.getString(4));
            %>
        </td>
        <td align="center">
            <%
                out.print(rs.getString(2));
            %>
        </td >
        <td align="center">
            <%
                out.print(rs.getString(3));
            %>
        </td>

    </tr>
    </tbody>

    <%
       i++; }
    %>
       </table>
	 <div class="clear"></div>
 	</body>
</html>