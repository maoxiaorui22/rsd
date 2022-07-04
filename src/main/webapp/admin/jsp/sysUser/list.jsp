<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>网站后台管理系统HTML模板--模板之家 www.cssmoban.com</title>
    <link href="/admin/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/admin/js/jquery.js"></script>

    <script type="text/javascript">
        function toAddPage() {
            location.href="/admin/jsp/sysUser/add.jsp"
        }
        function toUpdatePage(id) {
            location.href="/sysUser/toUpdatePage/"+id;
        }
        function doDelete(id) {
            if(confirm("您确定删除吗？")){
            location.href="/sysUser/delete/"+id;
            }
        }
        $(document).ready(function(){
            $(".click").click(function(){
                $(".tip").fadeIn(200);
            });

            $(".tiptop a").click(function(){
                $(".tip").fadeOut(200);
            });

            $(".sure").click(function(){
                $(".tip").fadeOut(100);
            });

            $(".cancel").click(function(){
                $(".tip").fadeOut(100);
            });

        });
    </script>


</head>


<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">数据表</a></li>
        <li><a href="#">基本内容</a></li>
    </ul>
</div>

<div class="rightinfo">

    <div class="tools">

        <ul class="toolbar">
            <li onclick="toAddPage();"><span><img src="/admin/images/t01.png" /></span>添加</li>
            <li class="click"><span><img src="/admin/images/t02.png" /></span>修改</li>
            <li><span><img src="/admin/images/t03.png" /></span>删除</li>
            <li><span><img src="/admin/images/t04.png" /></span>统计</li>
        </ul>


        <ul class="toolbar1">
            <li><span><img src="/admin/images/t05.png" /></span>设置</li>
        </ul>

    </div>


    <table class="tablelist">
        <thead>
        <tr>
            <th>序号</th>
            <th>登录名称</th>
            <th>密码</th>
            <th>用户姓名</th>
            <th>用户角色</th>
            <th>用户性别</th>
            <th>用户电话</th>
            <th>更新时间</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${list}" var="sysUser" varStatus="i">
            <tr>
                <td>${i.count}</td>
                <td>${sysUser.loginName}</td>
                <td>${sysUser.password}</td>
                <td>${sysUser.realName}</td>
                <td>${sysUser.roleId}</td>
                <td>${sysUser.sex}</td>
                <td>${sysUser.tel}</td>
                <td><fmt:formatDate value="${sysUser.createTime}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate></td>
                <td>
                    <a href="javascript:toUpdatePage(${sysUser.id})" class="tablelink">修改</a>
                    <a href="javascript:doDelete(${sysUser.id})" class="tablelink"> 删除</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <div class="pagin">
        <div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页</div>
        <ul class="paginList">
            <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
            <li class="paginItem"><a href="javascript:;">1</a></li>
            <li class="paginItem current"><a href="javascript:;">2</a></li>
            <li class="paginItem"><a href="javascript:;">3</a></li>
            <li class="paginItem"><a href="javascript:;">4</a></li>
            <li class="paginItem"><a href="javascript:;">5</a></li>
            <li class="paginItem more"><a href="javascript:;">...</a></li>
            <li class="paginItem"><a href="javascript:;">10</a></li>
            <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>


    <div class="tip">
        <div class="tiptop"><span>提示信息</span><a></a></div>

        <div class="tipinfo">
            <span><img src="/admin/images/ticon.png" /></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>

        <div class="tipbtn">
            <input name="" type="button"  class="sure" value="确定" />&nbsp;
            <input name="" type="button"  class="cancel" value="取消" />
        </div>

    </div>




</div>

<script type="text/javascript">
    $('.tablelist tbody tr:odd').addClass('odd');
</script>
</body>
</html>
