<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="게시글" onclick="location.assign('${pageContext.request.contextPath}/board/boardlist.do')">
	<input type="button" value="공지글" onclick="location.assign('${pageContext.request.contextPath}/notice/noticelist.do')">
</body>
</html>
<script>
	
</script>