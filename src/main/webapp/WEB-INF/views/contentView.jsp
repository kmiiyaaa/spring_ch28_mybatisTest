<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
<h2>글 내용</h2>
<hr>
글제목 : ${iDto.btitle }<br>
글내용 : ${iDto.bcontent }<br>
글작성자 : ${iDto.bname }<br>
등록일 : ${iDto.bdate }<br>
<hr>
<input type="button" value="글수정" onclick="javascript:window.location.href='contentModify?bnum=${iDto.bnum}'">

</body>
</html>