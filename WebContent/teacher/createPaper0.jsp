<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>进入出卷页面前的跳转页面</title>
        <style type="text/css">
        	#div1{
        		border: 1px ghostwhite solid;
        		width: 400px;
        		height: 200px;
        		margin: 0 auto;
        		margin-top: 100px;
        	}
        	#div2{
        		margin-top: 50px;
        		margin-left: 20px;
        		line-height: 30px;
        	}
        	#div1 select{
        		width: 100px;
        		height: 30px;
        	}
        	a{
        		text-decoration: none;
        		margin-top: 10px;
        		margin: 0 auto;
        	}
        	/*td{
        		border: 1px red solid;
        	}*/
        	.td1{
        		text-align: right;
        	}
        	.td2{
        		width: 190px;
        		height: 30px;
        	}
        </style>
    </head>
    <body>
    <form id="form2" name="form2" method="post" action="../Questionpanduan" enctype="application/x-www-form-urlencoded">
    	<div id="div1">
    		<div id="div2" >
    			<table>
    			<tr>
    				<td class="td1">请输入试卷名称:</td>
    				<td >
    					<input type="text" id="papername" name="papername" class="td2" value=""/>
    				</td>
    			</tr>
    			<tr>
    				<td class="td1">请选择试卷开始时间：</td>
    				<td >
    					<input type="date" id="starttime" name="starttime" class="td2" value=""/>
    				</td>
    			</tr>
    			<tr>
    				<td class="td1">请选择试卷结束时间：</td>
    				<td >
    					<input type="date" id="endtime" name="endtime" class="td2" value=""/>
    				</td>
    			</tr>
    			<tr>
    			    <td  style="text-align: right;">
    				<input class="confirm" type="submit" name="submitpaper" value="提交" style="border: none;width: 100px;height: 30px;background-color: lightskyblue;"/>
    				</td>
    			</tr>
    			</table>
    		</div>
    	</div>
    	</form>
 	</body>
</html>