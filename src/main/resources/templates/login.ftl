<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="shortcut icon" type="image/x-icon" href="/loginFile/images/logo.png">
    <link rel="stylesheet" href="/loginFile/css/bootstrap.min.css">
    <link rel="stylesheet" href="/loginFile/css/login.css">
    <script src="/loginFile/js/jquery-3.3.1.js"></script>
    <script src="/loginFile/js/bootstrap.min.js"></script>
    <script src="/loginFile/layer/layer.js"></script>
    <script src="/loginFile/layer/extend/layer.ext.js"></script>
</head>
<body class="sign">
<div class="bodybg">
    <img src="loginFile/images/bg-4.jpg">
</div>
<div class="login">
    <a href="">
        <img src="loginFile/images/logo.png" height="72" width="102">
    </a>
    <h1>魔法师</h1>
    <hr>
    <form action="/loginUser" id="qForm" method="post"  onsubmit="return check();">
        <label for="id_email">登录名:</label>
        <div id="id_email">
            <input id="username" name="username" class="form-control border" placeholder="用户名" type="text" data-required>
        </div>
        <label for="id_password">密码:</label>
        <div id="id_password">
            <input id="password" name="password" class="form-control border" placeholder="密码" type="password" data-required>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" name="rememberMe" value="1"> 记住登录
            </label>
        </div>

        <div style="margin-top: 15px;">
            <input type="submit" id="form-submit" class="btn btn-success border" value="登录" >
            <div class="forgot">
                <a href="/registered">
                    注册
                </a>
                <a href="">
                    忘记密码
                </a>
            </div>
        </div>
    </form>
</div>
<script type="text/javascript">
    $("#password").blur(function(){
        var username=$('#username').val().trim();
        var password=$('#password').val().trim();
        if (username!="" && password!=""){
            $.ajax({
                url: '/ajaxNamePass',
                type: "POST",
                data:  {"name": username,"pass":password},
                success: function (date) {
                    if (date=="1"){
                        layer.alert('账户名或者密码不正确！', {icon: 2});
                    }
                },error:function () {
                    alert("some thing wrong");
                }
            });
        }
    });
    function  check() {
        var username=$('#username').val().trim();
        var password=$('#password').val().trim();
        if (username=="" || password==""){
            layer.alert('账户名或者密码不能为空！', {icon: 2});
            return false;
        }
    }
</script>
</body>
</html>