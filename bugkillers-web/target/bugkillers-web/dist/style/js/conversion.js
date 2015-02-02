var youdao_conv_host = window.youdao_conv_host || "conv.youdao.com";
var youdao = window.youdao || {};
youdao.param_names = ["youdao_conv_id", "youdao_conv_label", "youdao_conv_value", "youdao_order_id", "youdao_passport", "youdao_conv_params"];
youdao.escape = function(a) {
    return a == null ? "" : escape(a.toString())
};
youdao.concat = function(b, a) {
    a = youdao.escape(a);
    if ("" != a) {
        b = youdao.escape(b);
        if ("" != b) {
            return "&".concat(b, "=", a)
        }
    }
    return ""
};
youdao.protocol = function() {
    var a = document;
    return a && a.location && a.location.protocol && "https:" == a.location.protocol.toString().toLowerCase() ? "https:" : "http:"
};
youdao.formatObj = function(b) {
    var a = [];
    if (b) {
        for (k in b) {
            if ("" != k) {
                a.push("" + youdao.escape(k) + "*" + youdao.escape(b[k]))
            }
        }
    }
    return a.join("-")
};
youdao.formatArray = function(c) {
    var b = "";
    if (c && c.length && c.length > 0) {
        for (var d = 0; d < c.length; d++) {
            var e = youdao.formatObj(c[d]);
            if ("" != e) {
                b += e + "~"
            }
        }
    }
    return b.length > 0 ? b.substr(0, b.length - 1) : ""
};
youdao.convertId = function(b) {
    var a = {};
    a[1026] = 242527;
    a[1030] = 224890;
    a[1032] = 231450;
    a[1038] = 235785;
    a[1041] = 236525;
    a[1042] = 239007;
    a[1046] = 251398;
    a[1048] = 228427;
    a[1050] = 243047;
    a[1062] = 223746;
    a[1071] = 231129;
    a[1073] = 244395;
    a[1074] = 233021;
    var c = a[b];
    if (c == null) {
        c = b
    }
    return c
};
youdao.envInfo = function() {
    return ""
};
youdao.urlInfo = function(c) {
    var b = window;
    var g = document;
    var e = g.referrer == null ? "" : g.referrer.toString().substring(0, 256);
    var a = youdao.concat("ref", e);
    var f = youdao.loc();
    a += youdao.concat("url", f + c);
    return a
};
youdao.loc = function() {
    var a = window;
    var c = document;
    var b = c.location;
    if ( typeof (youdao_url_type) == "undefined" || youdao_url_type == null) {
        youdao_url_type = 0
    }
    if (youdao_url_type == 0) {
        b = c.location
    } else {
        if (youdao_url_type == 1) {
            b = c.referrer && "" != c.referrer ? c.referrer : c.location
        } else {
            if (youdao_url_type == 2) {
                if ( typeof (youdao_virtual_url) == "undefined" || youdao_virtual_url == null || youdao_virtual_url == "") {
                    b = a && a.top && a.top.location && "" != a.top.location ? a.top.location : c.location
                } else {
                    if (youdao_virtual_url.charAt(0) != "/") {
                        youdao_virtual_url = "/" + youdao_virtual_url
                    }
                    if (a && a.location && a.location.protocol && a.location.host) {
                        b = a.location.protocol + "//" + a.location.host + youdao_virtual_url
                    } else {
                        b = a && a.top && a.top.location && "" != a.top.location ? a.top.location : c.location
                    }
                }
            }
        }
    }
    b = b == null ? "" : b.toString().substring(0, 256);
    return b
};
youdao.mapUrlPattern = function(g) {
    var a = {
        label : "",
        value : ""
    };
    if ( typeof (youdao_conv_url_map) != "undefined" && youdao_conv_url_map) {
        for (var b in youdao_conv_url_map) {
            if ("" != b) {
                var f = new RegExp(b, "ig");
                if (f.exec(g)) {
                    var c = youdao_conv_url_map[b];
                    if (c && "" != c) {
                        try {
                            a.label = c[0];
                            a.value = c[1]
                        } catch(d) {
                        }
                        return a
                    }
                    break
                }
            }
        }
    }
    return a
};
youdao.serviceUrl = function(g) {
    var f;
    var c = "/conv/";
    var j = "";
    var e = youdao.loc();
    var a = youdao.param_names;
    for (var d = 0; d < a.length; d++) {
        if (a[d] && "" != a[d]) {
            var h = window[a[d]];
            if ("youdao_conv_id" == a[d]) {
                h = youdao.convertId(h);
                f = h
            } else if ("youdao_conv_label" == a[d] && ((!h) || "" == h)) {
                    var b = youdao.mapUrlPattern(e);
                    h = b.label;
                    j += youdao.concat("youdao_conv_value", b.value)
            }
            j += youdao.concat(a[d], h)
        }
    }
    j = youdao.protocol() + "//" + youdao_conv_host + c + f + "/conv.s?random=" + (new Date()).getTime() + j;
    return j + youdao.urlInfo(g)
};
youdao.pageView = function() {
    youdao.imageRequest(youdao.serviceUrl(""));
    if ( typeof youdao_record_click != "undefined" && youdao_record_click) {
        var a = document;
        a.addEventListener ? a.addEventListener("click", youdao.click, false) : a.attachEvent("onclick", youdao.click)
    }
};
youdao.click = function(d) {
    if (youdao_record_click == "undefined" || !youdao_record_click) {
        return
    }
    var a = d || window.event;
    var c = a.target || a.srcElement;
    if (!c.href && !c.id && !c.className && !c.name) {
        return
    }
    var b = "&click=true";
    if (c.id) {
        b += "&clickid=" + c.id
    }
    if (c.className) {
        b += "&clickclass=" + c.className
    }
    if (c.name) {
        b += "&clickname=" + c.name
    }
    youdao.imageRequest(youdao.serviceUrl(b))
};
youdao.cmImageRequest = function() {
    var a = youdao_conv_id || "EADCU";
    var b = "cm_" + (+new Date());
    youdao.img
    youdao.img = window[b] = new Image(1, 1);
    youdao.img.src = "http://dsp.youdao.com/cf.gif?source=" + a + "&r=" + (new Date()).getTime() + "&dgul=1559324";
    youdao.img.style.display = 'none';
    youdao.img.onload = function() {
        window[b] = null
    };
    youdao.img.onerror = function() {
        window[b] = null
    };
    youdao.img = null
};
youdao.imageRequest = function(b) {
    var c = "log_" + (+new Date());
    youdao.img
    youdao.img = window[c] = new Image(1, 1);
    youdao.img.src = b;
    youdao.img.style.display = 'none';
    youdao.img.onload = function() {
        window[c] = null;
        youdao.cmImageRequest()
    };
    youdao.img.onerror = function() {
        window[c] = null;
        youdao.cmImageRequest()
    };
    youdao.img = null
};
youdao.pageView(); 