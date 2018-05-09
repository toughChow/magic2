<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link href="/assets/css/public.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/admin.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/houtai.css" type="text/css" rel="stylesheet">
    <link href="/assets/css/smartMenu.css" type="text/css" rel="stylesheet">
    <title>魔法师</title>
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
                                <a href="#" class="dd-item">发布游戏<span class="scm dd-ar"></span></a>
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
                                    <a href="/admin/users/list" class="dd-item">会员管理<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="/admin/vendors/list" class="dd-item">厂商管理<span
                                            class="scm dd-ar"></span></a>
                                </dd>
                            </dl>
                        </li>
                        <li class="over">
                            <div class="li-item"><em class="scm li-ico ic5"></em>游戏管理<span class="scm arrow"></span>
                            </div>
                            <dl>
                                <dd class="on">
                                    <a href="/admin/game/pass" class="dd-item">已上线游戏<span class="scm dd-ar"></span></a>
                                </dd>
                                <dd>
                                    <a href="/admin/game/pending" class="dd-item">待审核游戏<span
                                            class="scm dd-ar"></span></a>
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
        <#--start-->
            <link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
            <link href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
            <link rel="stylesheet" type="text/css" href="/assets/css/htmleaf-demo.css">
            <div class="htmleaf-container">
                <header class="htmleaf-header">
                </header>
                <div class="container">
                    <div class="row">
                        <div class="col-md-3" style="padding:2em 0;">
                            <button type="button" class="btn btn-success btn-block" id="generate-excel"><i
                                    class="fa fa-file-excel-o" aria-hidden="true"></i> 将表格转换为Excel
                            </button>
                        </div>
                        <div class="col-md-12" style="padding:2em 0;">
                            <div class="table-responsive">
                                <table class="table table-bordered table-striped" id="test_table">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>游戏名称</th>
                                        <th>发布商</th>
                                        <th>游戏背景</th>
                                        <th>版本</th>
                                        <th>状态</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <#list page.content as row>
                                    <tr>
                                        <td>
                                            <span>${row_index+1}</span>
                                        </td>
                                        <td>
                                            <span>${row.name}</span>
                                        </td>
                                        <td>
                                            <span>${row.publisher}</span>
                                        </td>
                                        <td>
                                            <span>${row.background}</span>
                                        </td>
                                        <td>
                                            <span>${row.version}</span>
                                        </td>
                                        <td>
                                                <#if row.status==0>
                                                    <span class="label label-default">待审核</span>
                                                <#elseif row.status==1>
                                                    <span class="label label-success">已上线</span>
                                                </#if>
                                        </td>
                                        <td>
                                            <#if row.status == 0>
                                                <a href="javascript:void(0);" class="btn btn-xs btn-default"
                                                   data-id="${row.id}"
                                                   data-action="offline">
                                                    <i class="fa fa-close"></i> 下线
                                                </a>
                                                <a href="javascript:void(0);" class="btn btn-xs btn-success"
                                                   data-id="${row.id}"
                                                   data-action="online">
                                                    <i class="fa fa-close"></i> 通过
                                                </a>
                                            <#elseif row.status==1>
                                            <a href="javascript:void(0);" class="btn btn-xs btn-default"
                                               data-id="${row.id}" data-action="check">
                                                <i class="fa fa-check"></i> 重审
                                            </a>
                                            </#if>
                                        </td>
                                    </tr>
                                    </#list>
                                    </tbody>
                                </table>
                                <#include "/util/pager.ftl">
                                <@pager "" page 5/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <script type="text/javascript" src="/assets/js/jquery-1.8.2.js"></script>
            <script type="text/javascript" src="/assets/js/jszip.js"></script>
            <script type="text/javascript" src="/assets/js/FileSaver.js"></script>
            <script type="text/javascript" src="/assets/js/excel-gen.js"></script>
            <script type="text/javascript" src="/assets/js/demo.page.js"></script>
        <#--end-->
        </div>
    </div>
</div>
<script type="text/javascript" src="/assets/js/jquery.min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.dataStatistics.js"></script>
<script type="text/javascript" src="/assets/js/contabs.js"></script>
<script type="text/javascript" src="/assets/js/maintabs.js"></script>
<script type="text/javascript" src="/assets/js/jquery-smartMenu-min.js"></script>
<script type="text/javascript" src="/assets/js/jquery.nicescroll.min.js"></script>
<script type="text/javascript" src="/assets/plugins/layer/layer.js"></script>
<script type="text/javascript">
    $(function () {
        $(".ad-menu").niceScroll({
            cursorborder: "0 none",
            cursorcolor: "#1a1a19",
            cursoropacitymin: "0",
            boxzoom: false
        });
    })
    var J = jQuery;

    function ajaxReload(json) {
        if (json.code >= 0) {
            if (json.message != null && json.message != '') {
                layer.msg(json.message, {icon: 1});
            }
            location.reload();
        } else {
            layer.msg(json.message, {icon: 2});
        }
    }

    $(function () {
        // 重审
        $('a[data-action="check"]').bind('click', function () {
            var that = $(this);
            layer.confirm('该账号停用后，将不能登录系统，确定要停用?', {
                btn: ['确定', '取消'], //按钮
                shade: false //不显示遮罩
            }, function () {
                J.getJSON('/admin/game/check', {id: that.attr('data-id'), active: false}, ajaxReload);
            }, function () {
            });
            return false;
        });

        // 上线
        $('a[data-action="online"]').bind('click', function () {
            var that = $(this);
            layer.confirm('该账号激活后，将可访问系统中的已授权功能，确定要激活?', {
                btn: ['确定', '取消'], //按钮
                shade: false //不显示遮罩
            }, function () {
                J.getJSON('/admin/game/online', {id: that.attr('data-id'), active: true}, ajaxReload);
            }, function () {
            });
            return false;
        });
        // 下线
        $('a[data-action="offline"]').bind('click', function () {
            var that = $(this);
            layer.confirm('该账号激活后，将可访问系统中的已授权功能，确定要激活?', {
                btn: ['确定', '取消'], //按钮
                shade: false //不显示遮罩
            }, function () {
                J.getJSON('/admin/game/offline', {id: that.attr('data-id'), active: true}, ajaxReload);
            }, function () {
            });
            return false;
        });
    })
</script>
</body>
</html>