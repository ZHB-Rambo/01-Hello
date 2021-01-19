<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>学生信息</title>
    <base href="<%= basePath %>">
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
</head>
<body>
    <button id="btn">获取</button>
    <br />
    <br />
    学生1：<br />
    姓名：<span id="name1"></span> <br />
    年龄：<span id="age1"></span> <br />
    <br />
    <br />
    <br />
    学生1：<br />
    姓名：<span id="name2"></span> <br />
    年龄：<span id="age2"></span> <br />
</body>
<script>
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                url:"StudentServlet",
                type:"get",
                dataType:"json",
                /*这里设置位json类型，则后台返回的值必须是json类型，否则success是拿不到任何数据的*/
                success : function (data) {
                    // alert(data)
                    $("#name1").html(data.s1.name)
                    $("#age1").html(data.s1.age)

                    $("#name2").html(data.s2.name)
                    $("#age2").html(data.s2.age)
                }
            })
        })
    })
</script>
</html>
