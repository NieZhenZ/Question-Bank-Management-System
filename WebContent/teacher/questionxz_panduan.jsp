<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

            String checkbox_1=request.getParameter("1");
            String checkbox_2=request.getParameter("2");
            String checkbox_3=request.getParameter("3");
            String checkbox_4=request.getParameter("4");
            String checkbox_5=request.getParameter("5");
            String checkbox_6=request.getParameter("6");
            String checkbox_7=request.getParameter("7");
            String checkbox_8=request.getParameter("8");
            String checkbox_9=request.getParameter("9");
            String checkbox_10=request.getParameter("10");
            String checkbox_11=request.getParameter("11");
            String a,b,c,d,e,f,g,h,i,j=null;
            String[] shuzu = new String[5];
            int ti = 0;
            if(checkbox_1!=null)
            {
              shuzu[ti] = checkbox_1;
              ti++;
            }
            if(checkbox_2!=null)
            {
              shuzu[ti] = checkbox_2;
              ti++;
            }
            if(checkbox_3!=null)
            {
              shuzu[ti] = checkbox_3;
              ti++;
            }
            if(checkbox_4!=null)
            {
               shuzu[ti] = checkbox_4;
               ti++;
            }
            if(checkbox_5!=null)
            {
               shuzu[ti] = checkbox_5;
               ti++;
            }
            if(checkbox_5!=null)
            {
               shuzu[ti] = checkbox_5;
               ti++;
            }
            if(checkbox_6!=null)
            {
               shuzu[ti] = checkbox_6;
               ti++;
            }
            if(checkbox_7!=null)
            {
               shuzu[ti] = checkbox_7;
               ti++;
            }
            if(checkbox_8!=null)
            {
               shuzu[ti] = checkbox_8;
               ti++;
            }
            if(checkbox_9!=null)
            {
               shuzu[ti] = checkbox_9;
               ti++;
            }
            if(checkbox_10!=null)
            {
               shuzu[ti] = checkbox_10;
               ti++;
            }
            if(checkbox_11!=null)
            {
               shuzu[ti] = checkbox_11;
               ti++;
            }

 Connection con = null;    
 Statement stmt = null;     
 
 Class.forName("com.mysql.cj.jdbc.Driver"); 
 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");  
 System.out.println(shuzu);
 String SQL = "insert into paper(xzt1,xzt2,xzt3,xzt4,xzt5) values('"+shuzu[0]+"','"+shuzu[1]+"','"+shuzu[2]+"','"+shuzu[3]+"','"+shuzu[4]+"')";    
 stmt = con.createStatement();    
 int sq = stmt.executeUpdate(SQL);
 if(sq == 1){
	 System.out.println("插入成功");
 }
 else{
	 System.out.println("插入失败");
 }
  stmt.close();
  con.close();  
%>