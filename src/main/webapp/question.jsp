<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/4/14
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>question</title>
</head>
<body>
<h1>我要提问</h1>
<div>
    <a href="${ctx}/">返回首页</a>
</div>

<div>
    <form action="${ctx}/questions/add" method="post">
        问题: <input type="text" name="title"><br>
        问题描述: <textarea name="detailDesc" id="" cols="30" rows="10"></textarea><br>
        <input type="submit" value="保存问题">
    </form>
</div>

</body>
</html>
