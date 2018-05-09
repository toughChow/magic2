<link href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<link href="http://cdn.bootcss.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="cassets/ss/htmleaf-demo.css">
<body>
<div class="htmleaf-container">
    <header class="htmleaf-header">
    </header>
    <div class="container">
        <div class="row">
            <div class="col-md-3" style="padding:2em 0;">
                <button type="button" class="btn btn-success btn-block" id="generate-excel"><i class="fa fa-file-excel-o" aria-hidden="true"></i> 将表格转换为Excel</button>
            </div>
            <div class="col-md-12" style="padding:2em 0;">
                <div class="table-responsive">
                    <table class="table table-bordered table-striped" id="test_table">
                        <thead>
                        <tr>
                            <td>排序</td>
                            <td>游戏名</td>
                            <td>类型</td>
                            <td>创建时间</td>
                            <td>预约人数</td>
                            <td>游戏厂商</td>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>
                                <span>1</span>
                            </td>
                            <td>
                                <span>Small, Steve </span>
                            </td>
                            <td>
                                <span>New York</span>
                            </td>
                            <td>
                                <span>NY</span>
                            </td>
                            <td>
                                <span>Eastern</span>
                            </td>
                            <td>
                                <span>Metropolitan Region</span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <span>2</span>
                            </td>
                            <td>
                                <span>Novello, Rodolfo </span>
                            </td>
                            <td>
                                <span>Lawrence</span>
                            </td>
                            <td>
                                <span>NY</span>
                            </td>
                            <td>
                                <span>Eastern</span>
                            </td>
                            <td>
                                <span>Long Island Region</span>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="assets/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="assets/js/jszip.js"></script>
<script type="text/javascript" src="assets/js/FileSaver.js"></script>
<script type="text/javascript" src="assets/js/excel-gen.js"></script>
<script type="text/javascript" src="assets/js/demo.page.js"></script>