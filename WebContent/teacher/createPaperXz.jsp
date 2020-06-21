<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>出选择题</title>
    <link rel="stylesheet" type="text/css" href="css/createPaper.css"/>
</head>
<body>

<%

    String driverName = "com.mysql.cj.jdbc.Driver";
    String tableName = "xzt";
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");
    Statement statement = connection.createStatement();
    String sql = "SELECT * FROM " + tableName;
    ResultSet rs = statement.executeQuery(sql);
%>
<form id="form1" name="form1" method="post" action="../Questionxzpanduan" enctype="application/x-www-form-urlencoded">
<table id="dg" title="选择题" class="easyui-datagrid" style="width:900px; height: 100%; padding-left: 200px;"  pagination="true"
       rownumbers="true" fitcolumns="true"singleselect="true">

    <thead>
    <tr>
        <th field ="0" width="50">选中</th>
        <th field ="1" width="50">题目</th>
        <th field ="2" width="50">答案</th>
        <th field ="3" width="50">A</th>
        <th field ="4" width="50">B</th>
        <th field ="5" width="50">C</th>
        <th field ="6" width="50">D</th>
        <th field ="8" width="50">类型</th>
    </tr>
    </thead>

    <tbody>
    <% 
        int i = 1;
        while (rs.next()) {
        
    %>
    <tr>
        <td align="center">
          <input  name="<%=i%>" type="checkbox" value="<%=i%>" />
        </td>
        
        <td>
            <%
                out.print(rs.getString(2));
            %>
        </td>
        <td align="center">
            <%
                out.print(rs.getString(3));
            %>
        </td>
        <td>
            <%
                out.print(rs.getString(4));
            %>
        </td>
        <td>
            <%
                out.print(rs.getString(5));
            %>
        </td>
        <td>
            <%
                out.print(rs.getString(6));
            %>
        </td>
        <td>
            <%
                out.print(rs.getString(7));
            %>
        </td>
        <td>
            <%
                out.print(rs.getString(9));
            %>
        </td>

    </tr>
    </tbody>
    <%
       i++; }
    %>
    <td align="left">             
            <input class="confirm" type="submit" name="button1" value="确认" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
    </td>
</table>
</form>

</body>
</html>