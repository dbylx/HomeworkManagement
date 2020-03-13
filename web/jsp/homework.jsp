<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--http://faculty.csu.edu.cn/xjp/zh_CN/index.htm-->
<html>

<head>
	<title>
		练习二
	</title>

	<link type ="text/css" rel = "stylesheet" href = "../res/design.css">
	<style type="text/css" >
		a:link{text-decoration: none;color: white}

		a:active{text-decoration:none}

		a:hover{text-decoration:none;color: white}

		a:visited{text-decoration: none;color: white}


		*{
			margin: 0;
			padding: 0;

		}

		html{
			margin: 0;
			padding:0px;
			height:100%;

		}
		body{

			background-size:cover;
			background-attachment:fixed;



	</style>

</head>
<body>



<div id = 'menu'>



	<ul>

		<li><a href="" ><p style="font-size:20px;color:rgb(230,230,230);">teacher</p></a></li>



	</ul>
</div>
<div id = 'centerPanel2'>
	<form action="dealAddHomework">
		<div class = 'input_control2'>
			<input type="text" name="title" placeholder="请输入作业标题"/>
		</div>

		<div class = 'input_control3'>
			<textarea cols="15" rows="20" placeholder="请输入作业内容" name = "content"></textarea>
		</div>



		<div class = 'input_control2'>
			<input type="submit" name="submit" value="添加作业"/>
		</div>
	</form>
</div>


</div>
</div>









</body>



</html>