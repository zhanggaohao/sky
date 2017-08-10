<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user List</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>昵称</th>
                <th>帐号</th>
                <th>密码</th>
                <th>创建时间</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${userList }" var="u">
                <tr>
                    <td>${u.id }</td>
                    <td>${u.nickname }</td>
                    <td>${u.account }</td>
                    <td>${u.password }</td>
                    <td>
                        <fmt:formatDate value="${u.createtime }" pattern="yyyy-MM-dd HH:mm:ss"/>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>