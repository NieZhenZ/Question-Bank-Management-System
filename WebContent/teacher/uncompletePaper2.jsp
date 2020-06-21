<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>未批改试卷</title>
        <link rel="stylesheet" href="css/uncompletePaper2.css" />
        <script src="js/uncomepletePaper2.js"></script>
    </head>
    <body>
    	<!--批改编程题然后提交到后台-->
    	
    	<form name="form1" method="post" action="../Bctscore?papername=20200601&username=xie">
		<table id="tab3">
			<tr>
				<td class="bc">三、编程题</td>
			</tr>
			<c:forEach  var="aa" items="${Bctanwseryp}">
			<tr>
				<td class="bc_title">
				
					1.<a >${aa.answerpath1}</a>
					</br>
					</br>
					分数<input type="text" name="score1">
					</br>
					</br>
					2.<a >${aa.answerpath2}</a>
					</br>
					</br>
					分数<input type="text" name="score2">
				</td>
				<td>
					<input type="submit" value="提交分数" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
				</td>
			</tr>
			</c:forEach>
			
		</table>
		</form>
 	</body>
</html>