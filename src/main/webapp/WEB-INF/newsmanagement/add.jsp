<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加评论</title>
    <style type="text/css">
        tr {
            height: 40px;
        }

        .odd {
            background-color: aqua;

        }
    </style>
</head>
<body>
<form action="add" method="post">
<input type="hidden" value="${id}" name="newsid">
<table border="1" cellpadding="0" cellspacing="0" align="center" width="1000px">
    <tr class="odd">
        <td colspan="2">
            <h1 style="text-align: center; margin-top: 10px">增加评论
            </h1>
        </td>
    </tr>
    <tbody id="myTable">
    <tr align="center">
        <td>评论内容(*)</td>
        <td><input class="text" name="content"/></td>
    </tr>
    <tr align="center">
        <td>评论人</td>
        <td><input class="text" name="author"/></td>
    </tr>
    <tr align="center">
        <td colspan="2">
            <input type="submit" value="提交"/>
            <button onclick="window.location.href='news'">返回</button>
        </td>
    </tr>
</table>
</form>
</body>
</html>
