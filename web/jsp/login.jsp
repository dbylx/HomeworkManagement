<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>

	<head>
		<title>
			login
		</title>

		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script type="text/javascript">
            function checklogin()
            {
                var username=document.getElementById("myname").value;
                var pwd=document.getElementById("mypwd").value;
                if(username=="")  //两者中有一个为空
                {
                    alert("用户名不能为空！！");
                    document.getElementById("myname").focus();
                    return false;
                }
                else
                {
                    if(username.length<8||username.length>20)
                    {
                        alert("用户名太短，应在8~20个字符之间！！");
                        document.getElementById("myname").focus();
                        return false;
                    }
                }


				$("#form1").submit();

                return true;
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

			<li><a href="login" ><p style="font-size:20px;color:rgb(230,230,230);">登陆界面</p></a></li>
			

			
		</ul>
	</div>
	
	
	<div id = 'centerPanel11'>
		<div id = 'loginPanel'>
			<form name="loginform" method="get" action="dealLogin" onsubmit="return checklogin()">
				
				<legend class = 'font-yahei2' ><p align = 'center'>用户登录</p></legend>
				<div class = 'input_control'>
					<input type="text" placeholder="输入你的用户名" name = 'myname'/>
				</div>
				<div class = 'input_control'>
					<input type="text" placeholder="输入你的密码" name = 'mypwd'/>
				</div>
				
				<div class = 'input_control'>
					<input type="submit"  value="登陆">
					</br></br>
					<input type="reset">
				</div>
				
			</form>
			
			
			
        </form>
			
			
		</div>
	</div>

		
		
		
	</div>
	
	
	
	
		
		
		
		
	
	</body>
		
	
	
</html>