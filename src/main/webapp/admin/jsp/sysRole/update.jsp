<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
        <form action="/sysRole/update" method="post">
            <input type="hidden" name="id" value="${sysRole.id}" />
            <ul class="forminfo">
                <li><label>用户角色</label><input name="name" type="text" class="dfinput" value="${sysRole.name}" /><i>根据自身职务选择</i></li>
                <li><label>更新时间</label><input name="createTime" type="text" class="dfinput" value="${sysUser.createTime}" /><i>最后更新提交的时间</i></li>
                <li><label>&nbsp;</label><input type="submit" class="btn" value="确认保存" /></li>
            </ul>
        </form>
    </div>
    </body>
    </body>
</html>
