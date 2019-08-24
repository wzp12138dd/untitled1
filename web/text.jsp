<%--
  Created by IntelliJ IDEA.
  User: DFG
  Date: 2019/8/23
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登入</title>
</head>
<body>
<form action="login" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="text" name="passwoed"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登入"></td>
        </tr>
    </table>
</form>
</body>
</html>
