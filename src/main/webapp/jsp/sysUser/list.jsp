<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="jspl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script>
        function doDel(id) {
            window.location.href="/sysUser/delete?id="+id;
        }
        function toAdd() {
            window.location.href="/sysUser/insert";
        }
    </script>
</head>
<body>
${list}
<h2>用户注册表登记信息</h2>
<a href=javascript:toAdd()>新建</a>
<form action="/sysUser/list" method="post">
    <input type="search" name="searchLoginName" title="请输入登录用户" placeholder="登录用户" value="${searchLoginName}" >
    <input type="search" name="searchRealName" title="请输入用户姓名"  placeholder="用户姓名" value="${searchRealName}">
    <select name="searchRoleId">
        <jspl:forEach items="${sysRoleList}" var="sysRole">
            <option value="${sysRole.id}">${sysrole.name}</option>
        </jspl:forEach>
    </select>
    <input type="submit" value="查找">

</form>
<table border="2" cellspacing="0" cellpadding="1" width="800">
    <tr>
        <td>id</td>
        <td>登录用户</td>
        <td>用户姓名</td>
        <td>用户角色</td>
        <td>性别</td>
        <td>电话</td>
        <td>注册时间</td>
        <td>操作</td>

    </tr>
    <jspl:forEach items="${list}" var="sysUser">
        <tr>
            <td>${sysUser.id}</td>
            <td>${sysUser.loginName}</td>
            <td>${sysUser.realName}</td>
            <td>${sysUser.roleName}</td>
            <td>${sysUser.sex}</td>
            <td>${sysUser.tel}</td>
            <td><fmt:formatDate value="${sysUser.createTime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
            <td>
                <a href=javascript:doDel(${sysUser.id})>删除</a>
                <a href="/sysUser/Update?id=${sysUser.id}">修改</a>
            </td>
        </tr>
    </jspl:forEach>


</table>
</body>
</html>