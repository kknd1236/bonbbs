<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %> 
<%@ page session="false"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %><!-- https://easy7.tistory.com/200 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>seoha</title>
</head>
<body>

	<table border="1">
	
		<tr>
			<td colspan="5" align="right">
			<a href ="input">글쓰기</a>
			</td>
	
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
			<c:forEach items="${list}" var="board">
				<tr> 
					<td>${board.bno }</td>
					<td><a href="update?bno=${board.bno}">${board.title }</a></td>
					<td>${board.writer}</td>
					<td><fmt:formatDate pattern="yy.MM.dd hh:mm" value="${board.regdate }" /></td>
					<td>${board.readcount }</td>
				</tr>
			</c:forEach>
	</table>
</body>
</html>