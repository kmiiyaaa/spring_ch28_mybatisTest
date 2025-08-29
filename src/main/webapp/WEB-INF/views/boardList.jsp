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
	<h3 style="color:blue;">총 게시글 수 : ${bCount}  개</h3>
	<hr>
	글번호/글제목/글쓴이/조회수/등록일
	<hr>
	<c:forEach items="${iDtos}" var="iDtos"> 
		${iDtos.bnum} / <a href="contentView?bnum=${iDtos.bnum }">${iDtos.btitle}</a> / ${iDtos.bname} / ${iDtos.bhit} / ${iDtos.bdate} <br>
	</c:forEach>
	<input type="button" value="글쓰기" onclick="javascript:window.location.href='writeForm'">


</body>
</html>