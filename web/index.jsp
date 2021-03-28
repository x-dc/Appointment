<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cmn-Hans">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>图书预约系统</title>
    <link rel="stylesheet" href="layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">后台管理面板</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <%--    <ul class="layui-nav layui-layout-left">--%>
        <%--      <li class="layui-nav-item"><a href="">控制台</a></li>--%>
        <%--      <li class="layui-nav-item"><a href="">商品管理</a></li>--%>
        <%--      <li class="layui-nav-item"><a href="">用户</a></li>--%>
        <%--      <li class="layui-nav-item">--%>
        <%--        <a href="javascript:;">其它系统</a>--%>
        <%--        <dl class="layui-nav-child">--%>
        <%--          <dd><a href="">邮件管理</a></dd>--%>
        <%--          <dd><a href="">消息管理</a></dd>--%>
        <%--          <dd><a href="">授权管理</a></dd>--%>
        <%--        </dl>--%>
        <%--      </li>--%>
        <%--    </ul>--%>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <%--          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">--%>
                    你好
                </a>
                <%--        <dl class="layui-nav-child">--%>
                <%--          <dd><a href="">基本资料</a></dd>--%>
                <%--          <dd><a href="">安全设置</a></dd>--%>
                <%--        </dl>--%>
            </li>
            <li class="layui-nav-item"><a href="">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">用户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="${pageContext.request.contextPath}/studentList" target="iframe">查看用户</a></dd>
                        <dd><a href="${pageContext.request.contextPath}/badstudentList" target="iframe">违规用户管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">管理员管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">查看管理员</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">预约信息管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">所有预约信息</a></dd>
                        <dd><a href="javascript:;">违规预约</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">阅览室管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">阅览室管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">位置管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">查看位置</a></dd>
                        <dd><a href="javascript:;">释放位置</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">公告管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">发布公告</a></dd>
                        <dd><a href="javascript:;">历史公告</a></dd>
                    </dl>
                </li>

            </ul>
        </div>
    </div>

    <div class="layui-body" style="width: 100%;height: 100%">
        <iframe href="" src="${pageContext.request.contextPath}/main" width="100%" height="100%"
                name="iframe"></iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        Copyright © 2018 idcs.vip All Rights Reserved.
    </div>
</div>

<script src="layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function () {
        var element = layui.element;

    });
</script>
</body>
</html>