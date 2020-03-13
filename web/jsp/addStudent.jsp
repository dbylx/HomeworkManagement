<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--http://faculty.csu.edu.cn/xjp/zh_CN/index.htm-->
<html>

	<head>
		<title>
			练习二
		</title>
		<script type="text/javascript" src="demo.js">
		   document.write("这条语句没有执行，被忽略掉了！");
		</script>
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
	<div id = 'centerPanel'>
		<form action="dealAddStudent">
			<div class = 'input_control'>
				<input type="text" name="name" placeholder="请输入学生姓名"/>
			</div>
			<div class = 'input_control'>
				<input type="text" name="usname" placeholder="请输入学生用户名"/>
			</div>
			<div class = 'input_control'>
				<input type="text" name="password" placeholder="请输入学生登陆密码"/>
			</div>
			<div class = 'input_control'>
				<input type="submit" id = name="submit" value="添加学生"/>
			</div>
		</form>
		</div>
		
		
	</div>
	</div>
	
	
	
	
		
		
		
		
	
	</body>
		
	
	
</html>