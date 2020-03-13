<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--http://faculty.csu.edu.cn/xjp/zh_CN/index.htm-->
<%@ page import="java.util.List" %>
<%@ page import="com.code.model.StudentHomework" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<StudentHomework> home_list = (ArrayList<StudentHomework>) request.getAttribute("homeWorkList");
	if(home_list == null){
		System.out.println("null");
	}
	System.out.println(home_list.size());
	int i = 0;

%>
<html>

	<head>
		<title>
			homework
		</title>


		<script>
			function sumbitMessage(title) {

				window.location.href="dealQueryHomework?param="+title;


			}
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





	<div id = 'centerPanel2'>

			<table width="90%" class="table">
				<caption>
					<h2>作业提交情况统计</h2><br>
				</caption>
				<thead>
					<tr>
						<th>作业标题</th>
						<th>作业创建时间</th>
						<th>作业内容</th>
						<th>详细信息</th>
					</tr>
				</thead>

				<%
				for ( ;i<home_list.size();i++) {
				%>
				<tr>
					<td id = "title"><%=home_list.get(i).getHomeworkTitle()%></td>
					<td><%=home_list.get(i).getHomeworkContent()%></td>
					<td><%=home_list.get(i).getCreateTime()%></td>

					<td><button value="详细信息" onclick="sumbitMessage(<%=i%>)">查看</button>
					</td>
				</tr>

				<%
					}

				%>









			</table>

		
		
	</div>
	
	
	
	
		
		
		
		
	
	</body>
		
	
	
</html>