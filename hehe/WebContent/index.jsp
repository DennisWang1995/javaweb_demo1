<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有用户</title>
<style type="text/css">
	.top{
		text-align: left;
	}
	
	.search{
		text-align: center;
	}
	
	.main{
		text-align: center;
	}
	
	table{
		/*margin:100px;外补白，该元素和父元素或者四周元素的距离*/
		margin:10px auto;
		/*
			如果写4个值，按照上右下左
			如果写1个值，上下左右全是这个值
			如果写2个值，第1个值用于上下，第2值用于左右，这里auto的意思是左右相等
		*/
		width:600px;
	}
</style>
<script type="text/javascript">
	function create_user(){
		window.open('${pageContext.request.contextPath}/add.jsp','','width=500,height=300');
	}
	
	function delete_user(operatorId,name){
		var flg=confirm('真的要删除用户 '+name);
		if(flg){
			location.href='${pageContext.request.contextPath}/DeleteUserServlet?operatorId='+operatorId;	
		}
	}
	
	function update_user(operatorId){
		window.open('${pageContext.request.contextPath}/GetUserServlet?operatorId='+operatorId,'','width=500,height=300');
	}
</script>
</head>
<body>
<div class="top">
	<a href="javascript:void(0)" onclick="create_user();">创建用户</a>
</div>
<form class="search" action="${pageContext.request.contextPath}/SearchServlet" method="POST">
	按姓名查找：
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="text" name="name" value="${param.name }" /><!-- 这种写法是请求参数回显，暂时可以不用 -->
	&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="status">
		<option value="1">有效</option>
		<option value="0">无效</option>
	</select>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit" value="查询" />
</form>
<div class="main">
	<table>
		<tr><td>账号</td><td>姓名</td><td>密码</td><td>状态</td><td>删除</td><td>修改</td></tr>
		<c:forEach var="user" items="${allUsers }">
			<tr>
				<td>${user.operatorId }</td>
				<td>${user.name }</td>
				<td>${user.password }</td>
				<td>${user.status == 1?'有效':'无效' }</td>
				<td><a href="javascript:void(0)" onclick="delete_user('${user.operatorId}','${user.name }');" >删除</a></td>
				<td><a href="javascript:void(0)" onclick="update_user('${user.operatorId}');">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>