<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2021/4/7
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()
            +"://"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>微商城综合实战</title>
    <base href="<%=basePath%>">
    <link type="text/css" rel="stylesheet" href="css/wang.css">
    <script type="text/javascript" src="js/wang.js"></script>
</head>
<body>
<h1>对不起，程序出现了错误，请与管理员联系！</h1>
</body>
</html>
