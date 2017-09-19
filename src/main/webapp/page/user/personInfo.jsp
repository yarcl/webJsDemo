<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/page/user/personInfo.css" type="text/css">
<div class="person-info">
    <div class="person-info-title">
        <div><h4>>>个人信息</h4></div>
    </div>
    <div class="person-info-content">
        <table class="person-table table table-bordered table-hover">
            <tr>
                <td>ID</td>
                <td>${user.id}</td>
            </tr>
            <tr>
                <td>用户名</td>
                <td>${user.loginName}</td>
            </tr>
            <tr>
                <td>真实姓名</td>
                <td>${user.name}</td>
            </tr>
            <tr>
                <td>角色</td>
                <td>${user.roleId}</td>
            </tr>
            <tr>
                <td>状态</td>
                <td>${user.isActive=='1'?'激活':'停用'}</td>
            </tr>
        </table>
    </div>
</div>
