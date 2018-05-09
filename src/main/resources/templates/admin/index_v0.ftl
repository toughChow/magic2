
<link href="/assets/style/style.css" type="text/css" rel="stylesheet">
<div class="gray-bg">
<div class="tj_top"></div>
<div class="tj_tit">当前在线人数</div>
<div class="dataStatistics">

    <div class="digit_set"></div>
    <div class="digit_set"></div>
    <div class="digit_set"></div>
    <div class="digit_set"></div>
    <div class="digit_set"></div>
    <div class="digit_set set_last">
        <div class="tj_foot" style="width: 100%;height: 100%;margin: 0 auto;"></div>
    </div>
</div>


<script type="text/javascript" src="/assets/js/jquery.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        $('.dataStatistics').dataStatistics({min:100,max:1500,time:1000,len:6});
    });
</script>
</div>

<#--</html>-->