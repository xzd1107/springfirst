<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增学生</title>
</head>
<body>
	<form action="insert.action" method="post">
	姓名:<input type="text" name="name">
	性别:<select name="gender">
			<c:forEach items="${sexname }" varStatus="v" var="s">
			<option value="${v.index}">${s}</option>
			</c:forEach>
		</select>
	班级:<select name="batchid">
			<c:forEach items="${batchlist}" var="b">
				<option value="${b.batchid }">${b.batchname }</option>
			</c:forEach>
		</select>
		<input type="submit" value="提交">
	</form>
</body>
</html>