<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据绑定</title>
</head>
<body>
	<form:form modelAttribute="user">
		用户名：<form:input path="name"/>
	</form:form>
</body>
</html>