<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>被踢出</title>
</head>
<body>
被踢出 或则在另一地方登录，或已经达到此账号登录上限被挤掉。
<input type="button" id="login" value="重新登录"/>
<script type="text/javascript" src="../../js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $("#login").click(function () {
        window.open("/auth/login");
    });
</script>
</body>
</html>