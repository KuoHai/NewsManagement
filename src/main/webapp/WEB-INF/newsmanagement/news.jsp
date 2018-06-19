<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        /* 隔行换色 */
        $(document).ready(function () {
            $("#myTable").find("tr:odd").css("background-color", "aqua");
        });
    </script>
    <title>新闻列表</title>
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
<table border="1" cellpadding="0" cellspacing="0" align="center" width="1200px">
    <thead>
    <div align="center" style="margin:    15px">
        <form action="news" method="post">
            新闻标题
            <input type="text" value="${newsTitle }" name="newsTitle"/>
            <input type="submit" value="查询"/>
        </form>
    </div>
    <td colspan="6"><h1 style="text-align: center; margin-top: 10px">新闻列表</h1></td>
    </thead>
    <tbody id="myTable">
    <tr class="odd">
        <td>新闻编号</td>
        <td>新闻标题</td>
        <td>新闻摘要</td>
        <td>作者</td>
        <td>创建时间</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageNum.rows}" var="news">
        <tr class="news">
            <td>${news.id}</td>
            <td>${news.title}</td>
            <td>${news.summary}</td>
            <td>${news.author}</td>
            <td>
                <fmt:formatDate value="${news.createDate}" pattern="yyyy-MM-dd HH：mm"/>
            </td>
            <td>
                <a href="comments?id=${news.id}">查看评论</a>|
                <a href="toAdd?id=${news.id}">评论</a>
                <a onclick="confirm('是否确认删除?')?location.href='delete?id=${news.id}': 'javascript:'" href="#">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    <tr>
        <td colspan="7" style="text-align: right;">
            <c:if test="${ empty newsTitle }">
                <a href="news?pageNo=1&newsTitle=${newsTitle }">首页</a> |
                <a href="news?pageNo=${pageNum.currPageNo-1 }&newsTitle=${newsTitle }">上一页</a>&nbsp;|
                <a href="news?pageNo=${pageNum.currPageNo+1 }&newsTitle=${newsTitle }">下一页</a>&nbsp;|
                <a href="news?pageNo=${pageNum.pageCount }&newsTitle=${newsTitle }">末页</a>&nbsp;&nbsp;
                <span>第${pageNum.currPageNo}页/共${pageNum.pageCount }页</span>
            </c:if>
        </td>
    </tr>
</table>
</body>
</html>
