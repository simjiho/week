<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
	<divclass="row">
		<div class="col-10">
			<label for="searchkeyword" class="form-label">검색</label>
			<input id="searchkeyword" class="form-control" name="keyword">
		</div>
		<div class="col-2">
			<button class="btn btn-outline-sucess">조회</button>
		</div>
	</div>
	<table class="table table-dark table-striped">
		<tr>
			<th>학생번호</th>
			<th>학생이름</th>
			<th>학생전화번호</th>
			<th>학생이메일</th>
			<th>학생주소</th>
			<th>등록일</th>
		</tr>
		<c:forEach var="student" items="${students }">
			<tr>
				<td><c:out value="${student.studentNo }"/></td>
				<td><c:out value="${student.studentName }"/></td>
				<td><c:out value="${student.studentTel }"/></td>
				<td><c:out value="${student.studentEmail }"/></td>
				<td><c:out value="${student.studentAddr }"/></td>
				<td><fmt:formatDate value="${student.enrollDate }" pattern="yyyy-MM-dd"/></td>
			</tr>
		</c:forEach>
	</table>
	<div id="pageBar">
		${pageBar }
	</div>
</body>
</html>