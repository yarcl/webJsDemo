<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/page/admin/usersInfo.css" type="text/css">
<div class="admin-list">

    <div class="admin-title">
        <div><h4>>>用户列表</h4></div>
        <div class="razor-btn"><div class="btn-block btn-info text-center">新增</div></div>
    </div>
    <div class="admin-content">
        <table class="table table-bordered table-hover">
            <thead>
            <th width="8%">ID</th>
            <th width="15%">登陆名</th>
            <th width="13%">真实姓名</th>
            <th width="15%">角色</th>
            <th width="15%">状态</th>
            <th width="44%">操作</th>
            </thead>
            <c:forEach var="item" items="${userList}">
                <tr>
                    <td>${item.userId}</td>
                    <td>${item.loginName}</td>
                    <td>${item.name}</td>
                    <td>${item.roleId}</td>
                    <td>${item.isActive}</td>
                    <td>
                        <c:if test="${user.roleId==0}">
                            <a href="#" class="btn btn-sm btn-default">密码</a>
                        </c:if>
                        <a href="#" class="btn btn-sm btn-info">修改</a>
                        <a href="#" class="btn btn-sm btn-danger">删除</a>
                        <a href="#" class="btn btn-sm btn-warning">关闭采集</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>