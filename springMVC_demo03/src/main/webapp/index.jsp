<%--
  Created by IntelliJ IDEA.
  User: lxyqaq
  Date: 2021/1/5
  Time: 22:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<title>Title</title>
	</head>
	<body>

		<p>提交参数给Controller</p>

		<form action="receiveProperty.do" method="post">
			姓名：<input type="text" name="name"><br>
			年龄：<input type="text" name="age"><br>
			<input type="submit" value="提交参数">
		</form>

		<p>使用java对象接收请求参数</p>

		<form action="receiveObject.do" method="post">
			姓名：<input type="text" name="name"><br>
			年龄：<input type="text" name="age"><br>
			<input type="submit" value="提交参数">
		</form>

	</body>
</html>
