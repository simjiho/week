<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section id="board-container">
	<h2>게시판</h2>
	<table id="tbl-board">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>첨부파일</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:if test="${not empty boards }">
			<c:forEach var="b" items="${boards }">
				 <!-- 반복되는 내용 -->
				 <tr>
				 	<td>
				 		${b.boardNo }
				 	</td>
				 	<td>
						${b.boardTitle }
					</td>
					<td>
						${b.boardWriter }
					</td>
					<td>
						<c:if test="${not empty b.boardOriginalFilename }">
							파일있음
						</c:if>
						<c:if test="${empty b.boardOriginalFilename }">
							파일없음
						</c:if>
					</td>
					<td>
						${b.boardDate }
					</td>
					<td>
						${b.boardReadcount }
					</td>
				 </tr>
			</c:forEach>
		</c:if>
	</table>
</section>