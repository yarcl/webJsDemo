<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/18
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="css/main.css" type="text/css">
</head>
<body>
    <div class="nav navbar">

        <div class="logo"><img src="img/global.logo"/><span class="logo-title">南京西桥科技</span></div>
        <div class="nav-right">
            <ul>
                <li><span class="head-bk"></span><a href="#">${user.name}</a></li>
                <li><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
    <div class="product-list">

        <div class="product-title">
            <div><h4>>>产品列表</h4></div>
            <div class="razor-btn"><div class="btn-block btn-info text-center">新增</div></div>
        </div>
        <div class="product-content">
            <table class="table table-bordered table-hover">
                <thead>
                    <th>编号</th>
                    <th>名称</th>
                    <th>描述</th>
                    <th>时间</th>
                    <th>appKey</th>
                </thead>
                <c:forEach var="item" items="${razorProductList}">
                    <tr>
                        <td>${item.id}</td>
                        <td>${item.name}</td>
                        <td>${item.description}</td>
                        <td>${item.date}</td>
                        <td>${item.productKey}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
</html>
