<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>微商城综合实战</title>
    <link type="text/css" rel="stylesheet" href="css/wang.css">
    <script type="text/javascript" src="js/wang.js"></script>
</head>
<body>
<jsp:include page="/pages/"/>
<div id="mainDiv">
    首页信息
</div>
<jsp:include page="/pages/footer.jsp"/>
</body>
</html>
