<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<% pageContext.setAttribute("PATH", request.getContextPath());%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录页面</title>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script type="text/javascript" src="${PATH}/static/js/jquery-1.12.4.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="${PATH}/static/bootstrap/js/bootstrap.min.js"></script>
    <!-- Bootstrap -->
    <link href="${PATH}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <%-- 自设css和js --%>
    <%--<link href="${PATH}/static/css/reg_log.css" rel="stylesheet">--%>

</head>
<body>

<form id="test">
    选择文件:<input data-role="none" type="file" name="file" width="120px">
    <button data-role="none" onclick="testUpload();">测试</button>
</form>
<form id="www">
    <input type="text">
    <button onclick="test()">提交</button>
</form>



<script type="text/javascript">
    function test() {
        $.ajax({
            url:"/file/ffff",
            data: $("#www").serialize(),
            type:"GET"
        });
    }

    function testUpload(){
        var form = new FormData(document.getElementById("test"));
        var url = "${PATH}/file/test";    //这里的“项目访问路径”要改为你自己的路径
        $.ajax({
            url : url,
            data : form,
            type : 'POST',
            success : function(data){
                alert("成功")
                alert(data)
            },
            error : function(data){
                alert("失败")
            }
        });

    }

</script>
</body>