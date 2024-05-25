<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mybatis 이용하기</title>
</head>
<body>
	<h2>연결확인</h2>
	<h3>
		<a href="${path }/connecttest.do">DB연결</a>
	</h3>
	<h3>mybatis이용하기</h3>
	<h4>
		<a href="${path }/student/insertstudent.do">학생등록</a>
	</h4>
	<form action="${path }/student/insertstudentbyname.do">
		<input type="text" name="name">
		<input type="submit" value="학생저장">
	</form>
	<h4>학생전체정보를 저장하기</h4>
	<!-- /student/insertstudentall.do post -->
	<form action="${path }/student/insertstudentall.do" 
		method="post">
		이름 : <input type="text" name="name"> <br>
		전화번호 : <input type="text" name="tel"> <br>
		이메일 : <input type="text" name="email"> <br>
		주소 : <input type="text" name="address"> <br>
		<input type="submit" value="저장"> <br>
	</form>
	<!-- update, delete 구현
		전화번호, 이메일 수정
		학생번호 입력 받아 삭제
	 -->
	 
	 <h2>DB에 저장된 데이터 조회하기</h2>
	 <h3>저장된 학생수 조회하기</h3>
	 <h4>
	 	<a href="${path }/student/studentcount.do">학생 수 조회</a>
	 </h4>
	  <h4>
	 	<a href="${path }/student/studentdata.do?no=87">87번 학생 조회</a>
	 </h4>
	 <!-- 학생번호를 입력받아 학생 조회하기 -->
	 
	 <a href="${path }/student/studentall.do">전체학생조회</a>
</body>
</html>













