<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>

    <style>

        table tbody tr:nth-of-type(even){
            background-color: greenyellow;
        }
        table thead tr{
            background-color: aqua;
        }
    </style>
</head>
<body>
    <div>
        <h1>在线问答</h1>
        <div><a href="${ctx}/question.jsp">我要提问</a></div>
    </div>
    <table>
        <thead>
        <tr>
            <th>序号</th>
            <th>问题</th>
            <th>回答次数</th>
            <th>最后修改时间</th>
        </tr>
        </thead>
        <tbody>

            <c:forEach items="${questions}" var="obj" varStatus="status">
                <tr>
                    <td>${status.index+1}</td>
                    <td><a href="${ctx}/questions/get/answers/${obj.id}" <c:if test="${obj.answerCount eq 0}">
                        style="color:red"
                    </c:if>>${obj.title}</a></td>
                    <td>${obj.answerCount}</td>
                    <td><fmt:formatDate value="${obj.lastModified}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
