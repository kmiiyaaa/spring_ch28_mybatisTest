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


	<h2>게시판 글목록</h2>
	<hr>
	글번호/글제목/글쓴이/조회수/등록일
	<hr>
	<c:forEach items="${iDtos}" var="iDtos"> 
		${iDtos.bnum} /${iDtos.btitle} / ${iDtos.bname} / ${iDtos.bhit} / ${iDtos.bdate} <br>
	</c:forEach>


</body>
</html>