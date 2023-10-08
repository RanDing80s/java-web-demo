<%--
  Created by IntelliJ IDEA.
  User: dingran
  Date: 2023/10/6
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
  <div>
      <form action="../member/doLogin-servlet" method="post" enctype="application/x-www-form-urlencoded">
          <div>用户名：<input type="text" name="uname"></div>
          <div>密码：<input type="password" name="pwd"></div>
          <div><input type="submit" value="提交"></div>
      </form>
  </div>
</body>
</html>
