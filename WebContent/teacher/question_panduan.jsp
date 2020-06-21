<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.text.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% 
       SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String starttime = df.format(request.getParameter("starttime"));
       String endtime = df.format(request.getParameter("endtime"));
       String papername=request.getParameter("papername");
         
      //System.out.println(checkbox_0+checkbox_1+checkbox_2);  
  Connection con = null;    
  Statement stmt = null;     
 
 Class.forName("com.mysql.cj.jdbc.Driver"); 
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");  
 
 String SQL = "insert into paper values('"+papername+"','"+starttime+"','"+endtime+"')";    
 stmt = con.createStatement();    
 int i = stmt.executeUpdate(SQL);
 if(i == 1){
	 System.out.println("插入成功");
 }
 else{
	 System.out.println("插入失败");
 }
  stmt.close();
  con.close();  
%>