<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-cmn-Hans">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css">
</head>

<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <table id="demo" lay-filter="test"></table>
</div>

<script src="layui/layui.js"></script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script>
    layui.use('table', function () {
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#demo'
            , height: 500
            , url: '${pageContext.request.contextPath}/student/selectAllStudentByPage' //数据接口
            , page: true //开启分页
            , toolbar: 'default' //开启工具栏
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'},
                {field: 'sid', title: 'ID', width: 100, sort: true, fixed: 'left'}
                , {field: 'name', title: '用户名', width: 100}
                , {field: 'pwd', title: '密码', width: 100}
                , {
                    field: 'status', title: '账户状态', width: 177, templet: function (res) {
                        if (res.status == 1) {
                            return '<span style="color:#FF5722">锁定</span>';
                        } else if (res.status == 2) {
                            return '<span style="color:#3E8AF4">正常</span>';
                        }
                    }
                },
                {field: 'flag', title: '违规次数', width: 120, sort: true}
                , {field: 'time', title: '违规记时时间', width: 160, sort: true}
                , {fixed: 'right', title: '操作', width: 165, align: 'center', toolbar: '#barDemo'}
            ]]
        });
    });
</script>
</body>
</html>