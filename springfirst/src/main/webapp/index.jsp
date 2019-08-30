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
<a href="add.action">新增</a>
<table>
<tr>
<td>编号</td>
<td>姓名</td>
<td>性别</td>
<td>班级</td>
<td>删除</td>
<td>修改</td>
</tr>
<c:forEach items="${list }" var="s">
	<tr>
	<td>${s.id }</td>
	<td>${s.name }</td>
	<td>${s.sexname }</td>
	<td>${s.batchname }</td>
	<td><a href="delete.action?id=${s.id}">删除</a></td>
	<td><a href="edit.action?id=${s.id }">修改</a></td>
	</tr>
</c:forEach>
</table>
</body>
</html>