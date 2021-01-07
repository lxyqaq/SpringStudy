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
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript">
			$(function () {
				$("#btn01").click(function () {
					$.ajax({
						url:"returnStudentJsonArray.do",
						data:{
						    name:"楚子航",
							age:18
						},
						type:"post",
						dataType:"json",
						success:function (resp) {
							// alert(resp.name + "---------" + resp.age);
							$.each(resp, function (i, n) {
								alert(n.name + "---------" + n.age);
                            })
                        }
					})
                })
            })
		</script>
	</head>
	<body>

		<p>处理器方法返回String表示视图名称</p>
		<form action="returnString-view.do" method="post">
			姓名：<input type="text" name="name"> <br/>
			年龄：<input type="text" name="age"> <br/>
			<input type="submit" value="提交参数">
		</form>
		<br/>
		<p>处理器方法返回String表示视图完整路径</p>
		<form action="returnString-view2.do" method="post">
			姓名：<input type="text" name="name"> <br/>
			年龄：<input type="text" name="age"> <br/>
			<input type="submit" value="提交参数">
		</form>

		<button id="btn01">发起Ajax请求</button>

	</body>
</html>
