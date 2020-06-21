<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>教师出卷</title>
        <link rel="stylesheet" type="text/css" href="css/createPaper.css"/>
    </head>
    <div class="header">
		<a href="index.jsp"><p>题库管理系统</p></a>
	</div>
	<!--nave开始-->
	<div id="nave">
		<table align="center">
			<tr id="tr1" align="center">
				<!--这里需要添加js事件-->
				<td class="td1">
					<a href="createPaperXz.jsp" target="if">选择题</a>
				</td>
				<td class="td1">
					<a href="createPaperTk.jsp" target="if">填空题</a>
				</td>
				<td class="td1">
					<a href="createPaperBc.jsp" target="if">编程题</a>
				</td>
			</tr>
		</table>
	</div>
	<!--nave结束-->
	
	<!--main开始-->
	<div id="main">
		<form action="" method="post">
		<iframe src="createPaperXz.jsp" width="100%" height="640px"
			frameborder="0" scrolling="yes" name="if"></iframe>
		
		</form>
	</div>
	<!--main结束-->
	
	
	<div id="footer">
        <div class="copyright">Copyright © 2020- . All Rights Reserved.</div>
    </div>
    <div class="top">
		<a href="#" title="返回顶部"><img src="../images/top.png"></a>
	</div>
 	</body>
</html>