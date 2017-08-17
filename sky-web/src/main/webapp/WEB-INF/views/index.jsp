<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/index.css" />
</head>
<body>
    <a href="/user/register">注册</a>
    <a href="/login">登录</a>
    Welcome<br/><input id="text" type="text"/>
	<button onclick="send()">发送消息</button>
	<hr />
	<button onclick="closeWebSocket()">关闭WebSocket连接</button>
	<hr />
	<div id="message"></div>
</body>
<script type="text/javascript" src="/resource/javascript/index.js"></script>
</html>