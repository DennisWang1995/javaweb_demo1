<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	/*
		js：Number String Boolean Undefined Null Object
	
		js中的if和for中的判断条件可以是任意类型：
		其中：0，false，null,undefined,NaN,'' 这几个都是false
	*/
	
	function do_submit(form_1){
		var id_str=form_1.operatorId.value;
		if(!id_str){
			alert('账号不能为空');
			return false;
		}else if(!form_1.name.value){
			alert('姓名不能为空');
			return false;
		}else if(!form_1.password.value){
			alert('密码不能为空');
			return false;
		}else if(!form_1.status.value){
			alert('状态不能为空');
			return false;
		}else{
			var id=parseInt(id_str);
			if(id == id_str){//判断账户是不是数字
				//判断数字的大小
				if(id_str.length > 10 ){
					alert('账号不能超过10个数字');
					return false;
				}else{
					return true;
				}
			}else{
				alert('账号不是数字');
				return false;
			}
		}
		
	}
	
</script>
<style type="text/css">
	#message{
		color:red;
	}
</style>
</head>
<body>
<div id="message"></div>
<form action="${pageContext.request.contextPath}/AddUserServlet" method="POST" onsubmit="return do_submit(this);">
	<table>
		<tr>
			<td>账号：</td>
			<td><input  type="text" name="operatorId" /></td>
		</tr>
		<tr>
			<td>姓名：</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td>
				<select name="status">
					<option value="1">有效</option>
					<option value="0">无效</option>
				</select>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="提交"></td>
			<td>
			</td>
		</tr>
	</table>
</form>
<script type="text/javascript">
var msg='${msg }';
if(msg){
	if(msg === 'success'){
		window.opener.location.reload(true);
		window.close();
	}else{
		var msg_div=document.getElementById('message');
		msg_div.innerHTML=msg;
	}
}
</script>
</body>
</html>