<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assets/3D/css/demo.css" />
    <link rel="stylesheet" type="text/css" href="assets/3D/css/graph.css" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:700,300,300italic' rel='stylesheet' type='text/css'>
</head>
<body>
<div class="container">
    <header>
        <div style="width: 100%;height: 5px;"></div>
    </header>
    <section class="main">
        <span class="button-label">Size:</span>
        <input type="radio" name="resize-graph" id="graph-normal" checked="checked" /><label for="graph-normal">Normal</label>

        <span class="button-label">Color:</span>
        <input type="radio" name="paint-graph" id="graph-blue" checked="checked" /><label for="graph-blue">Blue</label>
        <input type="radio" name="paint-graph" id="graph-green" /><label for="graph-green">Green</label>
        <input type="radio" name="paint-graph" id="graph-rainbow" /><label for="graph-rainbow">Rainbow</label>

        <span class="button-label">年份:</span>
        <input type="radio" name="fill-graph" id="f-none" /><label for="f-none">None</label>
        <input type="radio" name="fill-graph" id="f-product1" checked="checked" /><label for="f-product1">2017</label>
        <input type="radio" name="fill-graph" id="f-product2" /><label for="f-product2">2016</label>
        <input type="radio" name="fill-graph" id="f-product3" /><label for="f-product3">2015</label>

        <ul class="graph-container">
            <li>
                <span>第一季</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">25</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>第二季</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">50</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>第三季</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">75</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>第四季</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">100</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>第五季</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">50</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <ul class="graph-marker-container">
                    <li style="bottom:25%;"><span>25W</span></li>
                    <li style="bottom:50%;"><span>50W</span></li>
                    <li style="bottom:75%;"><span>75W</span></li>
                    <li style="bottom:100%;"><span>100W</span></li>
                </ul>
            </li>
        </ul>

    </section>

</div>

</body>
</html>
