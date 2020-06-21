<!--<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>-->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>主页</title>
		<link href="css/slideshow.css" rel="stylesheet" />
		<link href="css/index.css" rel="stylesheet" />
		<link href="css/basic.css" type="text/css" rel="stylesheet" />
		<link href="css/style.css" type="text/css" rel="stylesheet" />
		<link rel="stylesheet" href="css/5imoban.css" type="text/css">
		<script src="js/slideshow.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="header">
			<p>题库管理系统</p>
		</div>
		<div id="nave">
			<table id="tab1">
				<tr>
					<td id="td1"></td>
					<td id="td2">
						<a href="login.jsp">登录</a>
					</td>
					<td width="5px"style="text-align: center;">|</td>
					<td id="td3">
						<a href="register.jsp">注册</a>
					</td>
				</tr>
			</table>
		</div>
		
		<!--下面是轮播图部分-->
		<div class="comiis_wrapad" id="slideContainer">
        <div id="frameHlicAe" class="frame cl">
            <div class="block">
                <div class="cl" >
                    <ul class="slideshow" id="slidesImgs" >
                        <li><a href="#" target="_blank">
                            <img src="images/lb01.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="images/lb02.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="images/lb03.PNG" width="1040" height="390" alt="" /></a></li>
                        <li><a href="#" target="_blank">
                            <img src="images/lb04.PNG" width="1040" height="390" alt="" /></a></li>
                    </ul>
                </div>
                <div class="slidebar" id="slideBar">
                    <ul>
                        <li class="on">1</li>
                        <li>2</li>
                        <li>3</li>
                        <li>4</li>
                    </ul>
                </div>
            </div>
        </div>
        </div>
    	<script type="text/javascript">
        	SlideShow(3000);
    	</script>
    	<!--图片轮播结束-->
    	<!--公告-->
    	<div id="main">
    	<div id="index_newslist" class="pc_overflow mt10 w980">
    	<div id="company_info_gsgg" class="fl pc_overflow">
        <dl>
            <dt class="pc_overflow"><b>回家看看</b><span>more+</span></dt>
            <dd>
            	<ul>
                	<li><a href="http://www.tju.edu.cn/" title="">天津大学官网</a></li>
                </ul>
            </dd>
        </dl>
    </div>
    <div id="company_info_yyys" class="fl pc_overflow">
        <dl>
            <dt class="pc_overflow"><b>学部在这里</b><span>more+</span></dt>
            <dd>
            	<ul>
                	<li><a href="http://cic.tju.edu.cn/" title="">智能与计算学部</a></li>
                </ul>
            </dd>
        </dl>
    </div>
    <div id="company_info_zxrx" class="fl pc_overflow">
        <dl>
            <dt class="pc_overflow"><b>课表和成绩</b><span>more+</span></dt>
            <dd>
            	<ul>
                	<li><a href="http://classes.tju.edu.cn" title="">个人办公网</a></li>
                </ul>
            </dd>
        </dl>
    </div>
</div>
<div class="border_bottom clear">&nbsp;</div>	
    		
    		
    		
    		
    		
    		
    		
    		
    	</div>
		<div id="footer">
            <div class="copyright">Copyright © 2020- . All Rights Reserved. </div>
        </div>
	</body>
</html>
