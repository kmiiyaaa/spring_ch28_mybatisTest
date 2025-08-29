<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새글 작성</title>
</head>
<body>

	<h2>게시판 글쓰기</h2>
	<hr>
	<form action="writeOk" method="post">
    제목: <input type="text" name="btitle"><br>
    내용: <textarea rows="10" cols="20" name="bcontent"></textarea><br>
    작성자: <input type="text" name="bname"><br>
    <button type="submit">등록</button>
    	<input type="button" value="취소" onclick="javascript:window.location.href='boardList'">
	</form>
</body>
</html>