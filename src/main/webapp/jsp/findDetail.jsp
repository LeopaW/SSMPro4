<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Leopa
  Date: 2019/4/14
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail</title>
    <style>
        .left{
            float:left;
        }

        .clearfix::after{
            content:'.';
            display: block;
            height:0;
            visibility: hidden;
            clear: both;
        }

    </style>
</head>
<body>
<div>
    <div>
        <div>
            问题: ${questions.title}
        </div>
        <div>
            问题描述:${questions.detailDesc}
        </div>
        <div class="clearfix">
            <div class="left">
                网友回答:
            </div>
            <div class="left">
                <c:forEach items="${questions.answers}" var="obj">
                    <div>
                        <div><fmt:formatDate value="${obj.ansDate}" pattern="yyyy-MM-dd HH:ss:mm"></fmt:formatDate> </div>
                        <div>${obj.ansContent}</div>
                    </div>
                </c:forEach>
            </div>
        </div>

        <div class="clearfix">
            <div class="left">我来回答</div>
            <div class="left">
                <form action="${ctx}/answers/add" method="post">
                    <input type="hidden" name="qid" value="${questions.id}">
                    <textarea name="ansContent" id="" cols="30" rows="10">

                    </textarea><br>
                    <input type="submit" value="提交答案"> <a href="${ctx}/">返回首页</a>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
