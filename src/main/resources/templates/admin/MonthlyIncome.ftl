<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
        <#--<input type="radio" name="resize-graph" id="graph-small" /><label for="graph-small">Small</label>-->
        <input type="radio" name="resize-graph" id="graph-normal" checked="checked" /><label for="graph-normal">Normal</label>
        <#--<input type="radio" name="resize-graph" id="graph-large" /><label for="graph-large">Large</label>-->

        <span class="button-label">Color:</span>
        <input type="radio" name="paint-graph" id="graph-blue" checked="checked" /><label for="graph-blue">Blue</label>
        <input type="radio" name="paint-graph" id="graph-green" /><label for="graph-green">Green</label>
        <input type="radio" name="paint-graph" id="graph-rainbow" /><label for="graph-rainbow">Rainbow</label>

        <span class="button-label">Product:</span>
        <input type="radio" name="fill-graph" id="f-none" /><label for="f-none">None</label>
        <input type="radio" name="fill-graph" id="f-product1" checked="checked" /><label for="f-product1">Product 1</label>
        <input type="radio" name="fill-graph" id="f-product2" /><label for="f-product2">Product 2</label>
        <input type="radio" name="fill-graph" id="f-product3" /><label for="f-product3">Product 3</label>

        <ul class="graph-container">
            <li>
                <span>2010</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">25</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>2011</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">50</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>2012</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">75</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>2013</span>
                <div class="bar-wrapper">
                    <div class="bar-container">
                        <div class="bar-background"></div>
                        <div class="bar-inner">100</div>
                        <div class="bar-foreground"></div>
                    </div>
                </div>
            </li>
            <li>
                <span>2012</span>
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
                    <li style="bottom:25%;"><span>25%</span></li>
                    <li style="bottom:50%;"><span>50%</span></li>
                    <li style="bottom:75%;"><span>75%</span></li>
                    <li style="bottom:100%;"><span>100%</span></li>
                </ul>
            </li>
        </ul>

    </section>

</div>

</body>
</html>
