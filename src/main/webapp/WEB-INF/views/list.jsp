<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %> 
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %><!-- https://easy7.tistory.com/200 -->

<%@ page session="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="<c:url value='/resources/css/bootstrap.min.css'/>" rel="stylesheet">
</head>
<body>
	<form action="input" method="post">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="5" cols="50" name="content"></textarea></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="저장">
					<input type="reset" value="취소">
					<input type="button" value="목록보기" onclick="location.href='list'">
				</td>
			</tr>

		</table>
	</form>
	<!--url -->
	<div id="writeLink">
	    <a href="/bbs/write.bbs?pageNum=${pageNum}">글쓰기</a>
	</div>
	
</body>
</html>