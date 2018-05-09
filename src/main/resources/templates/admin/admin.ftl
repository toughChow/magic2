<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link href="/assets/css/public.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/admin.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/houtai.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/smartMenu.css" type="text/css" rel="stylesheet">
    <title>校友网</title>
    <style>
        /*dd>a{*/
            /*padding: 0 0 0 40px!important;*/
        /*}*/
    </style>
</head>
<body>
        <div id="admin">
            <div class="ad-menu" id="ad-menu">
                <div class="ad-logo"><img src="/assets/images/logo.png" height="80%" width="80%"></div>
                <div class="ad-list">
                    <ul style="padding: 0;">
                    <@shiro.hasRole name="商家">
                    <li>
                        <div class="li-item" style="font-size: 24px"><em class="scm li-ico ic2"></em>商务平台<span class="scm arrow"></span></div>
                    </li>
                    <li>
                        <div class="li-item"><em class="scm li-ico ic1"></em>个人首页<span class="scm arrow"></span></div>
                        <dl>
                            <dd>
                                <a href="/VendorInformation" class="dd-item" >厂商信息<span class="scm dd-ar"></span></a>
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
                            <div class="li-item"  style="font-size: 24px"><em class="scm li-ico ic2"></em>管理平台<span class="scm arrow"></span></div>
                        </li>
                        <li>
                            <div class="li-item"><em class="scm li-ico ic4"></em>用户管理<span class="scm arrow"></span></div>
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
                            <div class="li-item"><em class="scm li-ico ic5"></em>游戏管理<span class="scm arrow"></span></div>
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
                            <div class="li-item"><em class="scm li-ico ic6"></em>统计管理<span class="scm arrow"></span></div>
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



                    <#--<iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="/admin/index_v0.ftl" frameborder="0"  seamless></iframe>-->
                    <#--<#include "/admin/VendorInformation.ftl">-->
                    <#include "/admin/Audit.ftl">



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
    $(function(){
        $(".ad-menu").niceScroll({cursorborder:"0 none",cursorcolor:"#1a1a19",cursoropacitymin:"0",boxzoom:false});
    })
</script>
</body>
</html>