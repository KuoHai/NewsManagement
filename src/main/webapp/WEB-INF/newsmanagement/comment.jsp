<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        /* 隔行换色 */
        $(document).ready(function () {
            $("#myTable").find("tr:odd").css("background-color", "aqua");
        });
    </script>
    <title>评论列表</title>
    <style type="text/css">
        tr {
            height: 40px;
        }

        .odd {
            background-color: plum;

        }
    </style>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0" align="center" width="1000px">
    <td colspan="4">
        <h1 style="text-align: center; margin-top: 10px">回复列表
            <button onclick="window.location.href='news'">返回新闻列表</button>
        </h1>
    </td>
    </thead>
    <tbody id="myTable">
    <tr class="odd">
        <td>评论编号</td>
        <td>评论内容</td>
        <td>评论人</td>
        <td>评论时间</td>
    </tr>
    <c:forEach items="${comment}" var="comment">
    <tr>
        <td>${comment.id}</td>
        <td>${comment.content}</td>
        <td>${comment.author}</td>
        <td><fmt:formatDate value="${comment.createDate}"
                            pattern="yyyy-MM-dd HH:mm:ss"/>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
