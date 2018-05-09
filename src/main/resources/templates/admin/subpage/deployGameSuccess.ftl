<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link href="/assets/css/public.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/admin.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/houtai.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/smartMenu.css" type="text/css" rel="stylesheet">
    <title>校友网</title>
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
    <link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="assets/css/htmleaf-demo.css">
</head>
<body>
<div id="admin">
    <div class="ad-menu" id="ad-menu">
        <div class="ad-logo"><img src="/assets/images/logo.png" height="80%" width="80%"></div>
        <div class="ad-list">
            <ul style="padding: 0;">
                    <@shiro.hasRole name="商家">
                    <li>
                        <div class="li-item" style="font-size: 24px"><em class="scm li-ico ic2"></em>商务平台<span
                                class="scm arrow"></span></div>
                    </li>
                    <li>
                        <div class="li-item"><em class="scm li-ico ic1"></em>个人首页<span class="scm arrow"></span></div>
                        <dl>
                            <dd>
                                <a href="/VendorInformation" class="dd-item">厂商信息<span class="scm dd-ar"></span></a>
                            </dd>
                            <dd>
                                <a href="/Onlinegame" class="dd-item">已上线游戏<span class="scm dd-ar"></span></a>
                            </dd>
                        </dl>
                    </li>
                    <li>
                        <div class="li-item"><em class="scm li-ico ic3"></em>游戏运营实况<span class="scm arrow"></span></div>
                        <dl>
                            <dd>
                                <a href="/MonthlyIncome" class="dd-item">运营收益<span class="scm dd-ar"></span></a>
                            </dd>
                        </dl>
                    </li>
                    <li>
                        <div class="li-item"><em class="scm li-ico ic3"></em>游戏管理<span class="scm arrow"></span></div>
                        <dl>
                            <dd>
                                <a href="/deployGame" class="dd-item">发布游戏<span class="scm dd-ar"></span></a>
                            </dd>
                            <dd>
                                <a href="#" class="dd-item">待审核游戏<span class="scm dd-ar"></span></a>
                            </dd>
                            <dd>
                                <a href="#" class="dd-item">游戏运行实况<span class="scm dd-ar"></span></a>
                            </dd>
                        </dl>
                    </li>
                    </@shiro.hasRole>
                    <@shiro.hasRole name="管理员">
                        <li>
                            <div class="li-item" style="font-size: 24px"><em class="scm li-ico ic2"></em>管理平台<span
                                    class="scm arrow"></span></div>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic4"></em>用户管理<span class="scm arrow"></span>
                            </div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">会员管理<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">厂商管理<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic5"></em>游戏管理<span class="scm arrow"></span>
                            </div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">已上线游戏<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">待审核游戏<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic6"></em>统计管理<span class="scm arrow"></span>
                            </div>
                            <dl>
                                <dd>
                                    <a href="#" class="dd-item">月利润<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="#" class="dd-item">年利润<span class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                    </@shiro.hasRole>
            </ul>
        </div>
    </div>
    <div class="ad-comment-box" id="ad-comment">
        <div class="ad-top-comment">
            <div class="ad-message">
                <div class="ad-top-left">
                    <div class="ad-change-btn"><a id="ad-list" href="javascript:;" class="scm ad-list-btn"></a></div>
                </div>
                <div class="ad-top-right">
                    <div class="ad-welcom">
                        <div class="ad-wel-img"><img src="/assets/images/logo.png" height="26" width="36"></div>
                        <div class="ad-wel-text">
                            <div class="font-wel">欢迎您！<strong>李春华</strong></div>
                            <div class="font-wel"><a href="javascript:;"><strong>【退出】</strong></a></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="ad-sub-nav-box content-tabs">
            <#--<a href="javascript:;" class="scm jian-a sub-sel pre j_tabBg J_tabLeft"></a>-->
                <div class="ad-sub-wraper page-tabs J_menuTabs" style="margin: 0 auto;">
                    <ul class="ad-sub-list page-tabs-content">
                        <li class="active J_menuTab" data-id="index_v0.html">首页</li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="ad-main-comment J_mainContent" id="ad-iframe">
            <!---->

            上传成功！

            <!---->
        </div>
    </div>
</div>
<script type="text/javascript" src="/assets/js/jquery.min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.dataStatistics.js"></script>
<script type="text/javascript" src="/assets/js/contabs.js"></script>
<script type="text/javascript" src="/assets/js/maintabs.js"></script>
<script type="text/javascript" src="/assets/js/jquery-smartMenu-min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.nicescroll.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".ad-menu").niceScroll({
            cursorborder: "0 none",
            cursorcolor: "#1a1a19",
            cursoropacitymin: "0",
            boxzoom: false
        });

        $('.logoUrl').on('change', function () {
            var formData = new FormData();
            formData.append("file",$('.logoUrl')[0].files[0]);
            console.log(formData.get("file"));
            $.ajax({
                url: '/uploadGamePic',
                type: 'POST',
                cache: false,
                data: formData,
                processData: false,
                contentType: false
            }).done(function (res) {
                var url = res;
                $('#logoUrl').val(url);
            }).fail(function (res) {
                // alert("文件超过指定大小")
            });
        })
        $('.imageUrl3').on('change', function () {
            var formData = new FormData();
            formData.append("file",$('.imageUrl2')[0].files[0]);
            $.ajax({
                url: '/uploadGamePic',
                type: 'POST',
                cache: false,
                data: formData,
                processData: false,
                contentType: false
            }).done(function (res) {
                var url = res;
                $('#imageUrl3').val(url);
            }).fail(function (res) {
                // alert("文件超过指定大小")
            });
        })
        $('.imageUrl2').on('change', function () {
            var formData = new FormData();
            formData.append("file",$('.imageUrl2')[0].files[0]);
            $.ajax({
                url: '/uploadGamePic',
                type: 'POST',
                cache: false,
                data: formData,
                processData: false,
                contentType: false
            }).done(function (res) {
                var url = res;
                $('#imageUrl2').val(url);
            }).fail(function (res) {
                // alert("文件超过指定大小")
            });
        })
        $('.imageUrl1').on('change', function () {
            var formData = new FormData();
            formData.append("file",$('.imageUrl1')[0].files[0]);
            $.ajax({
                url: '/uploadGamePic',
                type: 'POST',
                cache: false,
                data: formData,
                processData: false,
                contentType: false
            }).done(function (res) {
                var url = res;
                $('#imageUrl1').val(url);
            }).fail(function (res) {
                // alert("文件超过指定大小")
            });
        })
    })
</script>
</body>
</html>