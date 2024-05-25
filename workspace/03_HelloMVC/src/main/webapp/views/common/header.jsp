<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloMVC</title>
<link rel="stylesheet" href="${path }/css/style.css">
<script src="${path }/js/jquery-3.7.1.min.js"></script>
</head>
<body>
	<div id="container">
		<header>
			<h1>HelloMVC</h1>
			<div class="login-container">
				<form id="loginFrm" action="" method="post">
					<table>
						<tr>
							<td>
								<input type="text" name="userId" id="userId" placeholder="아이디입력">
							</td>
							<td>
							</td>
						</tr>
						<tr>
							<td>
								<input type="password" name="password" id="password" placeholder="패스워드입력">
							</td>
							<td>
								<input type="submit" value="로그인">
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="checkbox" name="saveId" id="saveId">
								<label for="saveId">아이디저장</label>
								<input type="button" value="회원가입">
							</td>
						</tr>
					</table>
				</form>
			</div>
			<nav>
				<ul class="main-nav">
					<li class="home">
						<a href="">Home</a>
					</li>
					<li id="board">
						<a href="">게시판</a>
					</li>
				</ul>
			</nav>
		</header>
	</div>
</body>
</html>