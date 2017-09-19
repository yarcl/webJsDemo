<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css" type="text/css">
<div class="product-list">

    <div class="product-title">
        <div><h4>>>产品列表</h4></div>
        <div class="razor-btn"><div class="btn-block btn-info text-center">新增</div></div>
    </div>
    <div class="product-content">
        <table class="table table-bordered table-hover">
            <thead>
                <th width="16.6%">编号</th>
                <th width="16.6%">名称</th>
                <th width="16.6%">描述</th>
                <th width="16.6%">时间</th>
                <th width="16.6%">appKey</th>
                <th width="16.6%">操作</th>
            </thead>
            <c:forEach var="item" items="${razorProductList}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.date}</td>
                    <td>${item.productKey}</td>
                    <td><a href="#">修改</a>&nbsp;&nbsp;&nbsp;<a href="#">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>