<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<% pageContext.setAttribute("PATH", request.getContextPath());%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>星盾网安</title>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <%-- 自设css和js --%>
    <link href="${PATH}/static/css/reg_log.css" rel="stylesheet">
    <style>
        /* .imgSize{
             width: 200px;
             height: 60px;
         }
         .navbaraSize{
             height: 70px;
         }*/


        .logo {
            margin-left: -10px;
            margin-top:-15px;
            padding-left: 15px;
            padding-right: 15px;
            float: left;
            height: 50px
        }


    </style>
</head>
<body>

<!-- 头部-->
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="#">
                <a class="navbar-brand" href="#">
                    <img class="logo" src="/static/img/1.png" alt="星盾">

                </a>
            </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <ul class="nav navbar-nav ">
                <li ><a href="index.jsp">首页 <span class="sr-only">(current)</span></a></li>
                <li ><a href="freeCourse.jsp">免费课程 <span class="sr-only">(current)</span></a></li>
                <li ><a href="#">精品课程 <span class="sr-only">(current)</span></a></li>
            </ul>
            <!--搜索框及按钮 -->
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入课程名">
                </div>
                <button type="submit" class="btn btn-default">
                    搜索
                </button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="registered.jsp"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
                <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
</body>
</html>
