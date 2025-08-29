<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 수정</title>
</head>
<body>
<h2>글 내용 수정</h2>
<hr>
<form action="contentModifyOk">
<intput type="hidden" name="bnum" value="${iDto.bnum}">
글제목 : <input type="text" name="btitle" value="${iDto.btitle }"><br>
글내용 : <input type="text" name="bcontent" value="${iDto.bcotent }"><br>
글작성자 : <input type="text" name="bname" value="${iDto.bname }"><br>
등록일 : ${iDto.bdate }<br>
<hr>
<input type="submit" value="수정 완료">
<input type="button" value="수정 취소" onclick="javascript:history.go()-1)">
</form>
</body>
</html>