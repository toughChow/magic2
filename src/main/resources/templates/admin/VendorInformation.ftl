<link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="assets/css/htmleaf-demo.css">
<style type="text/css">
    .demo{
        padding: 2em 0;
    }
    a:hover,a:focus{
        text-decoration: none;
        outline: none;
    }
    .tab .nav-tabs{
        border: none;
        border-bottom: 2px solid #079fc9;
        margin: 0;
    }
    .tab .nav-tabs li a{
        padding: 10px 20px;
        margin: 0 10px -1px 0;
        font-size: 17px;
        font-weight: 600;
        color: #293241;
        text-transform: uppercase;
        border: 2px solid #e6e5e1;
        border-bottom: none;
        border-radius: 5px 5px 0 0;
        z-index: 1;
        position: relative;
        transition: all 0.3s ease 0s;
    }
    .tab .nav-tabs li a:hover,
    .tab .nav-tabs li.active a{
        background: #fff;
        color: #079fc9;
        border: 2px solid #079fc9;
        border-bottom-color: transparent;
    }
    .tab .nav-tabs li a:before{
        content: "";
        display: block;
        height: 2px;
        background: #fff;
        position: absolute;
        bottom: -2px;
        left: 0;
        right: 0;
        transform: scaleX(0);
        transition: all 0.3s ease-in-out 0s;
    }
    .tab .nav-tabs li.active a:before,
    .tab .nav-tabs li a:hover:before{ transform: scaleX(1); }
    .tab .tab-content{
        padding: 10px;
        font-size: 17px;
        color: #6f6f6f;
        line-height: 30px;
        letter-spacing: 1px;
        position: relative;
    }
    @media only screen and (max-width: 479px){
        .tab .nav-tabs{ border: none; }
        .tab .nav-tabs li{
            width: 100%;
            text-align: center;
            margin-bottom: 15px;
        }
        .tab .nav-tabs li a{
            margin: 0;
            border-bottom: 2px solid transparent;
        }
        .tab .nav-tabs li a:before{
            content: "";
            width: 100%;
            height: 2px;
            background: #079fc9;
            position: absolute;
            bottom: -2px;
            left: 0;
        }
    }
</style>
</head>
<body>
<div class="htmleaf-container"
    <header class="htmleaf-header">
        <h1 style="text-align:center">魔法师平台欢迎您的加入</h1>
        <div class="htmleaf-links">
            <a class="htmleaf-icon icon-htmleaf-home-outline" href="http://www.htmleaf.com/" title="jQuery之家" target="_blank"><span> jQuery之家</span></a>
            <a class="htmleaf-icon icon-htmleaf-arrow-forward-outline" href="http://www.htmleaf.com/jQuery/Tabs/201804195080.html" title="返回下载页" target="_blank"><span> 返回下载页</span></a>
        </div>
    </header>

    <div class="demo">
        <div class="container">
            <div class="row">
                <div class="col-md-offset-3 col-md-6" >
                    <div class="tab" role="tabpanel" style="width: 100%">
                        <!-- Nav tabs -->
                        <ul class="nav nav-tabs" role="tablist">
                            <li role="presentation" class="active" style="width: 30%"><a href="#Section1" aria-controls="home" role="tab" data-toggle="tab">公司信息录入</a></li>
                            <li role="presentation" style="width: 30%"><a href="#Section2" aria-controls="profile" role="tab" data-toggle="tab">年度排名</a></li>
                        </ul>
                        <!-- Tab panes -->
                        <div class="tab-content tabs">
                            <div role="tabpanel" class="tab-pane fade in active" id="Section1">
                                <form action="" class="form-horizontal" method="post">
                                    <div class="form-group">
                                        <label class="col-sm-5 control-label">昵称</label>
                                        <div class="col-sm-4">
                                            <input type="text" id="updatename" style="width: 150px" class="form-control " value="">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-5 control-label" for="gender">性别</label>
                                        <div class="col-sm-5">
                                            <select name="gender" id="gender" style="width: 150px" class="form-control">
                                            <#--<#if user.sex=1>-->
                                                <#--<option value="1" selected="">男</option>-->
                                            <#--<#elseif user.sex=0>-->
                                                <#--<option value="0" selected="">女</option>-->
                                            <#--<#else >-->
                                                <option value="" selected="">请选择</option>
                                            <#--</#if>-->
                                                <option value="1">男</option>
                                                <option value="0">女</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-5 control-label" for="mobile">手机号</label>
                                        <div class="col-sm-5">
                                            <input type="tel" name="mobile" id="mobile" class="form-control" style="width: 150px" value="">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-sm-5 control-label" for="consignee_name">年龄</label>
                                        <div class="col-sm-5">
                                            <input type="text" name="consignee_name" id="age" class="form-control " style="width: 150px" value="">
                                        </div>
                                    </div>
                                    <div class="col-sm-5 col-sm-offset-5" style="height: 80px;">
                                        <button type="button" class="btn width" onclick="user()" style=" color: #fff;background: #12A7B4;width: 80px">保存</button>
                                    </div>
                                </form>
                            </div>
                            <div role="tabpanel" class="tab-pane fade" id="Section2">
                                <h3>Section 2</h3>
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce semper, magna a ultricies volutpat, mi eros viverra massa, vitae consequat nisi justo in tortor. Proin accumsan felis ac felis dapibus, non iaculis mi varius.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="http://cdn.bootcss.com/jquery/1.11.0/jquery.min.js" type="text/javascript"></script>
<script>window.jQuery || document.write('<script src="assets/js/jquery-1.11.0.min.js"><\/script>')</script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>