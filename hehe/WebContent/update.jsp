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
	
	var msg='${msg }';
	if(msg === 'success'){
		alert('用户修改成功');
		window.opener.location.reload(true);
		window.close();
	}
	
	function do_submit(form_1){
		var id_str=form_1.operatorId.value;
		if(!form_1.name.value){
			alert('姓名不能为空');
			return false;
		}else if(!form_1.password.value){
			alert('密码不能为空');
			return false;
		}else if(!form_1.status.value){
			alert('状态不能为空');
			return false;
		}else{
			return true;
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
<form action="${pageContext.request.contextPath}/UpdateUserServlet" method="POST" onsubmit="return do_submit(this);">
	<input type="hidden" name="operatorId" value="${user.operatorId }" />
	<table>
		<tr>
			<td>账号：</td>
			<td>${user.operatorId }</td>
		</tr>
		<tr>
			<td>姓名：</td>
			<td><input type="text" name="name" value="${user.name }" /></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="text" name="password" value="${user.password }" /></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td>
				<select name="status">
					<option value="1" ${user.status == 1?'selected':''}>有效</option>
					<option value="0" ${user.status == 0?'selected':''}>无效</option>
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
</body>
</html>