<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="checkId-container">
	
 		<c:if test="${result }">
			[<span> ${param.userId } </span>]는 사용가능합니다.
			<br><br>
			<button type="button" >닫기</button>
			
 		</c:if>
 		<c:if test="${not result}">
			[<span id="duplicated">${param.userId }</span>]는 사용중입니다.
			<br><br>
			<!-- 아이디 재입력창 구성 -->
			<form action="${pageContext.request.contextPath }/member/idduplicate.do" method="get">
				<input type="text" name="userId" id="userId">
				<input type="submit" value="중복검사" >
			</form>
 		</c:if>
	</div>
	<script>
		const $closeBtn = document.querySelector("#checkId-container>button");
		$closeBtn.addEventListener("click",e=>{
			const $userId = opener.document.getElementById("userId_");
			$userId.value='${param.userId}';
			$userId.readOnly=true;
			$userId.style.backgroundColor="lightgray";
			close();
		});
	</script>
</body>
</html>