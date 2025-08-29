<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

주문리스트
	
	<h2>tiger의 주문리스트</h2>
	<hr>
	<c:forEach items="${userOrderDtos }" var="oDto">
		주문번호 : ${oDto.orderid }
		주문상품이름 : ${oDto.ordername }
		<hr>
	</c:forEach>

</body>
</html>