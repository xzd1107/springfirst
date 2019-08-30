<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>修改</title>
</head>
<body>
	<form action="update.action" method="post">
		<input type="hidden" value="id" name="${stu.id }">
	姓名:<input type="text" name="name" value="${stu.name }">
	性别:<select name="gender">
			<c:forEach items="${sexname }" varStatus="v" var="s">
			
			<option value="${v.index}" <c:if test="${stu.gender==v.index}">selected="selected"</c:if>>${s}</option>
			</c:forEach>
			
		</select>
	班级:<select name="batchid">
			<c:forEach items="${batchlist}" var="b">
			
				<option value="${b.batchid }" <c:if test="${stu.batchid==b.batchid }">selected="selected"</c:if>>${b.batchname }</option>
			</c:forEach>
		</select>
		<input type="submit" value="提交">
	</form>
</body>
</html>