<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Banking</title>
	</head>
	<body>
		<h3>
			<%= request.getAttribute("message") %>
		</h3>
		<jsp:include page="/WEB-INF/views/login.jsp"></jsp:include>
	</body>
</html>