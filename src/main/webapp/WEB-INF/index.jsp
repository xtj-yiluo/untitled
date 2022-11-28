<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SSM框架测试</title>
</head>
<body>
<table border="1" cellspacing="0" align="center" style="text-align:center">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
    </tr>
    <c:forEach items="${list}" var="l">
        <tr>
            <td>${l.id}</td>
            <td>${l.name}</td>
            <td>${l.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
