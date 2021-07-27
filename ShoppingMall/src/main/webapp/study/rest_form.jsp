<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>REST 클라이언트 (form으로 요청시)</h2>

<pre>
<form id="form1">
	<input type="text" name="member_id" placeholder="member_id 입력">
	<input type="text" name="user_id" placeholder="user_id 입력">
	<input type="text" name="pass" placeholder="pass 입력">
	<input type="text" name="name" placeholder="name 입력">
</form>
</pre>
	<button type="button">Get요청</button>
	<button type="button">Post요청</button>
	<button type="button">Put요청</button>
	<button type="button">Delete요청</button>
</body>
</html>