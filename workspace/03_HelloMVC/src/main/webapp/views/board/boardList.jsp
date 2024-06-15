<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/views/common/header.jsp"/>
<style>
	section#board-container{width:600px; margin:0 auto; text-align:center;}
	section#board-container h2{margin:10px 0;}
	table#tbl-board{width:100%; margin:0 auto; border:1px solid black; border-collapse:collapse; clear:both; }
	table#tbl-board th, table#tbl-board td {border:1px solid; padding: 5px 0; text-align:center;} 
	/*글쓰기버튼*/
	input#btn-add{float:right; margin: 0 0 15px;}
	/*페이지바*/
	div#pageBar{margin-top:10px; text-align:center; background-color:rgba(0, 188, 212, 0.3);}
	div#pageBar span.cPage{color: #0066ff;}
</style>
	<section id="board-container">
		<h2>게시판 </h2>
		<table id="tbl-board">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>첨부파일</th>
				<th>조회수</th>
			</tr>
			<c:if test="${not empty boards }">
				<c:forEach var="b" items="${boards }">
					<tr>
						<td>${b.boardNo }</td>
						<td>
							${b.boardTitle }
						</td>
						<td>${b.boardWriter }</td>
						<td>${b.boardDate }</td>
						<td>
							<c:if test="${not empty b.boardOriginalFilename }">
								파일있음
							</c:if>
							<c:if test="${empty b.boardOriginalFilename }">
								파일없음
							</c:if>
						</td>
						<td>${b.boardReadcount }</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</section>
<jsp:include page="/views/common/footer.jsp"/>