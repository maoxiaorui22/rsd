<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>修改页面</title>
        <link href="/admin/css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
    <div class="place">
        <span>位置：</span>
        <ul class="placeul">
            <li><a href="#">首页</a></li>
            <li><a href="#">表单</a></li>
        </ul>
    </div>

    <div class="formbody">

        <div class="formtitle"><span>基本信息</span></div>
        <form action="/sysUser/update" method="post">
            <input type="hidden" name="id" value="${sysUser.id}" />
            <ul class="forminfo">
                <li><label>登录名称</label><input name="loginName" type="text" class="dfinput" value="${sysUser.loginName}" /><i>手机号/个人邮箱</i></li>
                <li><label>密码</label><input name="password" type="text" class="dfinput" value="${sysUser.password}" /><i>必须为字母与数字的组合</i></li>
                <li><label>用户姓名</label><input name="realName" type="text" class="dfinput" value="${sysUser.realName}" /><i>必须为身份证上的真实姓名</i></li>
                <li><label>用户角色</label><input name="roleId" type="text" class="dfinput" value="${sysUser.roleId}" /><i></i></li>
                <li><label>用户性别</label><input name="sex" type="text" class="dfinput" value="${sysUser.sex}" /><i></i></li>
                <li><label>用户电话</label><input name="tel" type="text" class="dfinput" value="${sysUser.tel}" /><i>手机号和座机都可（非空号）</i></li>
                <li><label>更新时间</label><input name="createTime" type="text" class="dfinput" value="${sysUser.createTime}" /><i>最后更新提交的时间</i></li>
                <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存" /></li>
            </ul>
        </form>
    </div>
    </body>
</html>
