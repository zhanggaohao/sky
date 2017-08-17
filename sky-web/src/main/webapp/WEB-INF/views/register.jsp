<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/save" method="post">
	   <label>昵称</label><input name="nickname" type="text"/>
	   <label>帐号</label><input name="account" type="text"/>
	   <label>密码</label><input name="password" type="password"/>
	   <input type="submit" value="提交"/>
	</form>
</body>
</html>