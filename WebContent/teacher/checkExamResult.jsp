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
        <title>教师查看成绩页面</title>
        <link rel="stylesheet" href="css/checkExamResult.css" />
        <script type="text/javascript">
        window.onload=function(){
        	fun2(){
        		window.open("teacherpic.jsp");
        	}
        }
        </script>
        		<style>
			*{
				margin: 0;
				padding: 0;
			}
			
			.naver{
				width: 100%;
				height: 80px;
				background-color:  ghostwhite;
				border: 1px solid black;
				background-image: url(../images/logo.jpg);
			}
			.naver a{
				text-decoration: none;
			}
			.naver p{
				font-size: 30px;
				color: white;
				text-align: center;
				line-height: 80px;
				
			}
			body{
				background-color: ghostwhite;
			}
			#b1{
				width: 85px;
				height: 30px;
				background-color: lightblue;
			}

			.main{
				margin: 0 auto;
				width: 100%;
				height: 483px;
				/*background-color: grey;*/
			}
			.t1{
				margin: 0 auto;
				margin-top: 50px;
				width:80%;
				border-color: gainsboro;
			}
			.footer{
				width: 100%;
				height: 50px;
				/*border: 1px black  solid;*/
				background-image: url(../images/logo.jpg);
				
			}
			.copyright{
	           line-height: 50px;
	           text-align: center;
	           font-size: 15px;
			}
			
			<style type="text/css">
	   .pagination{
 overflow:hidden;
 margin-left: 450px;
 margin-top: 390px;
 padding:10px 10px 6px 10px;
 /*border-top:1px solid #f60;*/
 _zoom:1;
}
.pagination *{
 display:inline;
 float:left;
 margin:0;
 padding:0;
 font-size:12px;
}
.pagination i{
 float:none;
 padding-right:1px;
}
.currentPage b{
 float:none;
 color:#f00;
}
.pagination li{
 list-style:none;
 margin:0 5px;
}
.pagination li li{
 position:relative;
 margin:-2px 0 0;
 font-family: Arial, Helvetica, sans-serif
}
.firstPage a,.previousPage a,.nextPage a,.lastPage a{
 overflow:hidden;
 height:0;
 text-indent:-9999em;
 border-top:8px solid #fff;
 border-bottom:8px solid #fff;
}
.pagination li li a{
 margin:0 1px;
 padding:0 4px;
 border:3px double #fff;
 +border-color:#eee;
 background:#eee;
 color:#06f;
 text-decoration:none;
}
.pagination li li a:hover{
 background:#f60;
 border-color:#fff;
 +border-color:#f60;
 color:#fff;
}
li.firstPage{
 margin-left:40px;
 border-left:3px solid #06f;
}
.firstPage a,.previousPage a{
 border-right:12px solid #06f;
}
.firstPage a:hover,.previousPage a:hover{
 border-right-color: #f60;
}
.nextPage a,.lastPage a{
 border-left:12px solid #06f;
}
.nextPage a:hover,.lastPage a:hover{
 border-left-color:#f60;
}
li.lastPage{
 border-right:3px solid #06f;
}
li li.currentState a{
 position:relative;
 margin:-1px 3px;
 padding:1px 4px;
 border:3px double #fff;
 +border-color:#f60;
 background:#f60;
 color:#fff;
}
li.currentState,.currentState a,.currentState a:hover{
 border-color:#fff #ccc;
 cursor:default;
}

.fy{
   margin-top: 380px;
   margin-left: 450px;
}
		</style>
    </head>
    <body>
<%
    String driverName = "com.mysql.cj.jdbc.Driver";
    String tableName = "studentgrade";
    Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/person?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT","root", "root");
    Statement statement = connection.createStatement();
    String sql = "SELECT * FROM " + tableName;
    ResultSet rs = statement.executeQuery(sql);
%>
    	<div class="header">
    		<a href="index.jsp"><p>题库管理系统</p></a>
    	</div>
   <table class="t1" border="1px solid " cellspacing="0" >
    <tr>
                    <th >学生名</th>
					<th >试卷名</th>
					<th >选择题成绩</th>
					<th >填空题成绩</th>
					<th >编程题成绩</th>
					<th >总成绩</th>
    </tr>
 <tbody>
    <% 
        int i = 1;
        while (rs.next()) {
        
    %>
    <tr>        
        <td>
            <%
                out.print(rs.getString(2));
            %>
        </td>
        <td>
            <%
                out.print(rs.getString(6));
            %>
        </td>
        <td>
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
                out.print(rs.getInt(3)+rs.getInt(4)+rs.getInt(5));
            %>
        </td>

    </tr>
    </tbody>
    <%
       i++; }
    %>
	</table>
 	</body>
</html>