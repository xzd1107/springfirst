<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
td{
	width: 100px;
}

</style>
</head>
<body>
<form action="select.action" method="post">
	<input type="text" name="txt" placeholder="请输入要查询的姓名">
	<input type="submit" value="提交">
</form>
<form action="selectall.action" method="post">
	<input type="text" name="txt" placeholder="请输入要查询的姓名1">
	<input type="submit" value="提交">
</form>
<table>
<tr>
<td>编号</td>
<td>姓名</td>
<td>性别</td>
<td>班级</td>
</tr>
<c:forEach items="${list }" var="s">
	<tr>
	<td>${s.id }</td>
	<td>${s.name }</td>
	<td>${s.sexname }</td>
	<td>${s.batchname }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>