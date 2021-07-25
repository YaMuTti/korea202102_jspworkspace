<%@ page contentType="text/html;charset=utf-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<table width="100%" border="1px">
		<tr>
			<th>No</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<%for(int i=1;i<=10;i++){%>
		<tr>
			<th>1</th>
			<th>안녕</th>
			<th>홍길동</th>
			<th>2021-06-14</th>
			<th>23</th>
		</tr>
		<%}%>
	</table>
</body>
</html>
