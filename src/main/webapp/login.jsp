<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<% pageContext.setAttribute("PATH", request.getContextPath());%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录页面</title>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <%-- 自设css和js --%>
    <link href="${PATH}/static/css/reg_log.css" rel="stylesheet">
    <style>
        /*选项卡样式*/
        .one{
            width:50%;
            text-align: center;
            tab-size: 50px;
        }
        /* 登陆按钮样式*/
        .btn-login{
            width: 75%;
        }

        /*上边距调整*/
        .top_taable{
            margin-top: 5%;
        }
        /*整个登陆框架的样式*/
        .product-container {
            border-radius: 10px;
            background: #ffffff;
            margin-top: 10%;
            border:1px solid #000000;
        }

        .tab_body{
            width: 100%;
            text-align: center;
            margin-left: 10%;
        }
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
<div class="header">
    <jsp:include page="head.jsp"/>
</div>
<div class="row tab_body">
    <div class="col-md-4"></div>
    <%--登陆选项卡--%>
    <div class="tabbable col-md-4  product-container" id="login_table"  > <!-- Only required for left/right tabs -->
        <ul class="nav nav-tabs top_taable">
            <li class="active one"><a href="#teacher" data-toggle="tab" onclick="teach_form()">老师</a></li>
            <li class="one"><a href="#student" data-toggle="tab" onclick="student_form()">学生</a></li>
        </ul>

        <div class="tab-content ">
            <%--老师登陆界面--%>
            <div class="tab-pane active" id="teacher" >
                <form class="form-group" action="" id="teachForm">
                    <div class="form-group top_taable">
                        <label for="teach_name"></label>
                        <input class="form-control" type="text" id="teach_name"  placeholder="请输入教师账号">
                    </div>
                    <div class="form-group">
                        <label for="teach_password"></label>
                        <input class="form-control" type="password"  id="teach_password"  placeholder="至少6位字母或数字">
                    </div>
                    <div class="form-group">
                        <div class="row text-center">
                            <div class="col-md-8 ">
                                <input class="form-control" id="verifycode" placeholder="验证码">
                                <span class="help-block"></span>
                            </div>
                            <div class="col-md-offset-4 ">
                                    <span onclick="changeImage()">
                                        <img src="/tp/Reg_log/getVerifyCode" id="verifyCodeImage" width="70" height="35" onclick="changeImage()"> <a>刷新</a>
                                    </span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 text-left">
                            <a href="registered.jsp" data-toggle="modla" data-dismiss="modal" data-target="#register">还没有账号？点我注册</a>
                        </div>
                        <div class="col-md-4 text-right ">
                            <a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">忘记密码</a>
                        </div>
                    </div>
                    <div class="text-center ">
                        <button class="btn btn-primary btn-login" onclick="window.location.href='index.jsp'" type="submit">登录</button>
                    </div>
                </form>
            </div>
            <%--学生登陆界面--%>
            <div class="tab-pane" id="student">
                <form class="form-group" action="" id="studentForm">
                    <div class="form-group top_taable">
                        <label for="student_name"></label>
                        <input class="form-control" type="text" id="student_name"  placeholder="请输入学生账号">
                    </div>
                    <div class="form-group">
                        <label for="student_password"></label>
                        <input class="form-control" type="password"  id="student_password"  placeholder="至少6位字母或数字">
                    </div>
                    <div class="form-group">
                        <div class="row text-center">
                            <div class="col-md-8 ">
                                <input class="form-control" id="verifycode2" placeholder="验证码">
                                <span class="help-block"></span>
                            </div>
                            <div class="col-md-offset-4 ">
                                    <span onclick="changeImage()">
                                        <img src="/tp/Reg_log/getVerifyCode" id="verifyCodeImage2" width="70" height="35" onclick="changeImage()"> <a>刷新</a>
                                    </span>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 text-left ">
                            <a href="registered.jsp">还没有账号？点我注册</a>
                        </div>
                        <div class="col-md-4 text-right ">
                            <a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">忘记密码</a>
                        </div>
                    </div>
                    <div class="text-center ">
                        <button class="btn btn-primary btn-login"  onclick="window.location.href='index.jsp'" type="submit">登录</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <div class="col-md-4"></div>
</div>
<!--轮播图 -->

<%--<div id="myCarousel" class="carousel slide">
    <!-- 轮播（Carousel）指标 -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <!-- 轮播（Carousel）项目 -->
    <div class="carousel-inner">
        <div class="item active">
            <img src="/static/img/1.png" alt="First slide">
        </div>
        <div class="item">
            <img src="/static/img/1.png" alt="Second slide">
        </div>
        <div class="item">
            <img src="/static/img/1.png" alt="Third slide">
        </div>
    </div>
    <!-- 轮播（Carousel）导航 -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>--%>

<script type="text/javascript">
    function teach_form()
    {
        document.getElementById("teachForm").reset()
    }

    function student_form()
    {
        document.getElementById("studentForm").reset()
    }
</script>
</body>
</html>