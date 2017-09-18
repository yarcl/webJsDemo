<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/main.css" type="text/css">

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
