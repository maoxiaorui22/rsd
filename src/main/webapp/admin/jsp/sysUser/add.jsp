<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
        <title></title>
        <link href="/admin/css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
    </div>

    <div class="formbody">

        <div class="formtitle"><span>基本信息</span></div>

        <form action="/sysUser/insert" method="post">
            <ul class="forminfo">
                <li><label>登录名称</label><input name="loginName" type="text" class="dfinput" /><i>手机号/个人邮箱</i></li>
                <li><label>密码</label><input name="password" type="text" class="dfinput" /><i>必须为字母与数字的组合</i></li>
                <li><label>用户姓名</label><input name="realName" type="text" class="dfinput" /><i>必须为身份证上的真实姓名</i></li>
                <li><label>用户角色</label><input name="roleId" type="text" class="dfinput" /><i></i></li>
                <li><label>用户性别</label><input name="sex" type="text" class="dfinput" /><i></i></li>
                <li><label>用户电话</label><input name="tel" type="text" class="dfinput" /><i>手机号和座机都可（非空号）</i></li>
                <li><label>更新时间</label><input name="createTime" type="text" class="dfinput" /><i>最后更新提交的时间</i></li>
                <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存" /></li>
            </ul>
        </form>
        <!--
            <ul class="forminfo">
            <li><label>文章标题</label><input name="" type="text" class="dfinput" /><i>标题不能超过30个字符</i></li>
            <li><label>关键字</label><input name="" type="text" class="dfinput" /><i>多个关键字用,隔开</i></li>
            <li><label>是否审核</label><cite><input name="" type="radio" value="" checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input name="" type="radio" value="" />否</cite></li>
            <li><label>引用地址</label><input name="" type="text" class="dfinput" value="http://www..com/html/uidesign/" /></li>
            <li><label>文章内容</label><textarea name="" cols="" rows="" class="textinput"></textarea></li>
            <li><label>&nbsp;</label><input name="" type="button" class="btn" value="确认保存"/></li>
        </ul>
        -->



    </div>
    </body>
</html>
