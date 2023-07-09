<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>

    <form action="/bbs/write.bbs" method="post">
        <div id="contentForm">
            <input type="hidden" name="pageNum" value="${pageNum}">
 
            <!-- 컨트롤러에서 DTO로 받을 때 400에러(Bad Request) 뜬다. -->
            <%-- 
                <input type="hidden" name="depth" value="${article.depth}">
                <input type="hidden" name="pos" value="${article.pos}">
                <input type="hidden" name="groupId" value="${article.groupId}">
            --%>
		</div>
	</form>
</body>
</html>