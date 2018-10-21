<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    <script>

        $(document).ready(function() {
            if(location.hash) {
                $('a[href=' + location.hash + ']').tab('show');
            }
            $(document.body).on("click", "a[data-toggle]", function(event) {
                location.hash = this.getAttribute("href");
            });
        });
        $(window).on('popstate', function() {
            var anchor = location.hash || $("a[data-toggle=tab]").first().attr("href");
            $('a[href=' + anchor + ']').tab('show');
        });
    </script>



    <style>


        /* 登陆按钮样式*/
        .btn-login{
            width: 75%;
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
        /*选项卡样式*/
        .one{
            width:50%;
            text-align: center;
            tab-size: 50px;
        }

        /*上边距调整*/
        .top_taable{
            margin-top: 5%;
        }
        /*整个登陆框架的样式*/
        .product-container {
            border-radius: 10px;
            background: #e7e7e7;
            margin-top: 10%;
            border:1px solid #000000;
        }

        .tab_body{
            width: 100%;
            text-align: center;
            margin-left: 10%;
        }
    </style>
</head>
<body>



<!-- 头部-->
<div class="header">
    <jsp:include page="head.jsp"/>
</div>

<%--row栅格布局 子类col-md-x选择占占比大小，栅格最大为12--%>
<div class="row tab_body">
    <div class="col-md-4"></div>
    <%--登录选项卡--%>
    <div class="tabbable col-md-4  product-container" id="login_table"  >
        <ul class="nav nav-tabs top_taable">
            <li class="active teacher"><a href="#teacher" data-toggle="tab"  onclick="teach_form()">老师</a></li>
            <li class="active student"><a href="#student" data-toggle="tab" onclick="student_form()">学生</a></li>
        </ul>

        <div class="tab-content ">
            <%--老师登录界面--%>
            <div class="tab-pane active" id="teacher" >
                <form class="form-group" action="" id="teachForm" method="POST">
                    <div class="form-group top_taable">
                        <label for="teach_name"></label>
                        <input class="form-control" type="text" id="teach_name"  placeholder="请输入教师昵称">
                    </div>
                    <div class="form-group">
                        <label for="teach_tel"></label>
                        <input class="form-control" type="text"  id="teach_tel"  placeholder="请输入手机号码">
                    </div>
                    <div class="form-group">
                        <label for="teach_password"></label>
                        <input class="form-control" type="password"  id="teach_password"  placeholder="至少6位字母或数字的密码">
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
                    <div class="row top_center">
                        <div class="col-md-8 text-left">
                            <a href="login.jsp">已有账号？点我登陆</a>
                        </div>
                        <div class="col-md-4 text-right ">
                            <a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">忘记密码</a>
                        </div>
                    </div>
                    <div class="text-center ">
                        <button class="btn btn-primary btn-login" type="submit">注册</button>
                    </div>
                </form>
            </div>

            <%--学生登陆界面--%>
            <div class="tab-pane" id="student">
                <form class="form-group"  action="" id="studentForm">
                    <div class="form-group top_taable">
                        <label for="student_name"></label>
                        <input class="form-control" type="text" id="student_name"  placeholder="请输入学生昵称">
                    </div>
                    <div class="form-group">
                        <label for="student_tel"></label>
                        <input class="form-control" type="text"  id="student_tel"  placeholder="请输入手机号码">
                    </div>
                    <div class="form-group">
                        <label for="student_password"></label>
                        <input class="form-control" type="password"  id="student_password"  placeholder="至少6位字母或数字的密码">
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
                        <div class="col-md-8  text-left">
                            <a href="login.jsp">已有账号？点我登陆</a>
                        </div>
                        <div class="col-md-4 text-right ">
                            <a href="" data-toggle="modal" data-dismiss="modal" data-target="#register">忘记密码</a>
                        </div>
                    </div>
                    <div class="text-center ">
                        <button class="btn btn-primary btn-login" type="submit" href="">注册</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="col-md-4"></div>
</div><script type="text/javascript">
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