<%--
  Created by IntelliJ IDEA.
  User: DFG
  Date: 2019/8/22
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登入失败</title>
</head>
<body>
<form action="login" method="post">
    <h3>登入失败，重新登入</h3>
    账号：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
