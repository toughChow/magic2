<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="shortcut icon" type="image/x-icon" href="loginFile/images/logo.png">
    <link rel="stylesheet" href="loginFile/css/bootstrap.min.css">
    <link rel="stylesheet" href="loginFile/css/login.css">
    <script src="loginFile/js/jquery-3.3.1.js"></script>
    <script src="loginFile/js/bootstrap.min.js"></script>
    <script src="loginFile/layer/layer.js"></script>
    <script src="loginFile/layer/extend/layer.ext.js"></script>
</head>
<body class="sign">
<div class="bodybg">
    <img src="loginFile/images/bg-4.jpg">
</div>
<div class="login register">
    <a href="">
        <img src="loginFile/images/logo.png" height="72" width="102">
    </a>
    <h1>这是一个标题</h1>
    <a href="/" class="signup-link gapps"><span>已有账号, 登录</span></a>
    <hr>
    <form action="/userRegister" method="post" onsubmit="return check()">
        <label for="id_name">用户名:</label>
        <div id="id_name">
            <input minlength="6" maxlength="18" required="required" class="form-control border" name="username" value="" placeholder="用户名"
                   type="text" data-required data-conditional="username" data-description="username"
                   data-describedby="message">
        </div>
        <label for="id_name">昵称:</label>
        <div id="id_name">
            <input maxlength="9" class="form-control border" required="required" minlength="1" name="name" value="" placeholder="昵称"
                   type="text" data-required>
        </div>
        <label for="id_email">短信验证:</label>
        <div id="id_email" >
            <input maxlength="15" id="call" class="form-control border" required="required" minlength="6"  value="" placeholder="请输入手机号"
                   type="text" data-describedby="message" style="width: 70%;display:inline">
            <input type="button" value="获取验证码" style="width: 28%;display:inline;font-size: 12px;background:Transparent" onclick="note()">
            <div id="hidcall">
                <input type="text" id="calltext" style="display:none;" class="form-control border" placeholder="请输入验证码">
            </div>
        </div>
        <label for="id_password">密码:</label>
        <div id="id_password">
            <input id="password" class="form-control border" required="required"  minlength="6" maxlength="18" name="password" placeholder="密码"
                   type="password" data-required>
        </div>
        <label for="id_password2">确认密码:</label>
        <div id="id_password2">
            <input id="password2" maxlength="18" class="form-control border" required="required" minlength="6" name="password2" placeholder="请再输入一次密码" type="password"
                   data-required data-conditional="confirm" data-describedby="message" data-description="confirm">
        </div>
        <input type="submit" class="btn btn-success border" value="注 册">
    </form>
</div>
<script>
    $("#calltext").blur(function(){
        var calltext=$('#calltext').val().trim();
        if (calltext!=""){
            $.ajax({
                url: '/calltext',
                type: "POST",
                data:  {"call": calltext},
                success: function (date) {
                    if (date=="1"){
                        layer.alert('验证码输入错误！', {icon: 2});
                        document.getElementById('calltext').value="";
                    }
                },error:function () {
                    layer.alert('some thing wrong！', {icon: 2});
                }
            });
        }
    });
    function check() {
        var pass=$('#password').val().trim();;
        var pass2=$('#password2').val().trim();;
        var calltext=$('#calltext').val().trim();
        if (calltext==""){
            layer.alert('请先验证手机！', {icon: 1});
            return false;
        }
        if (pass===pass2){
            layer.alert('注册成功!', {icon: 1});
            return true;
        }
        layer.alert('两次密码不一致，请重新输入!', {icon: 2});
        return false;
    }
    function  note() {
        var call=$('#call').val().trim();
        $.ajax({
            type: "POST",
            url: '/ajaxcall',
            data:  {"call":call},
            success: function (date) {
                layer.alert('发送成功，请接收验证码！', {icon: 1});
                $('#calltext').attr("style","display:block;")
            },
            error: function () {
                layer.alert('您输入的信息有误！请重新输入！', {icon: 2});
            }
        })
    }

</script>
</body>
</html>