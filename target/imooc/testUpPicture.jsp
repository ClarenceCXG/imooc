<%--
  Created by IntelliJ IDEA.
  User: clarence
  Date: 2018/9/28
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<% pageContext.setAttribute("PATH", request.getContextPath());%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>  
<head>  
    <script type="text/javascript" src="${PATH}/static/js/jquery-1.12.4.min.js"></script>
    <title>文件上传下载</title>  
    <%--<script type="text/javascript" src="js/testUpDataPicture.js"></script>--%>
    <script>
        function testUpload(){
            var form = new FormData(document.getElementById("test"));
            alert("11111111111111")
            var url = "${PATH}/file/test";   //这里的“项目访问路径”要改为你自己的路径
            alert(url)
            $.ajax({
                url : "${PATH}/file/test",
                data : form,
                type : 'POST',
                success : function(data){
                    alert("成功")
                },
                error : function(data){
                    alert("失败")
                }
            });
        }
    </script>
</head>  
<body>  
  <form id="test"  methon="post" enctype="multipart/form-data">
        选择文件:<input data-role="none" type="file" name="file" width="120px">
    <button data-role="none" onclick="testUpload()">测试</button>

    <img src="${BasePath}/static/img/${booking.url}">
</form>

</body>  
</html>  
