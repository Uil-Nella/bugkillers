/**
 * Created by wangming on 2015/3/11.
 */
var UFFC = {
    widgets: {},//组件
    pages: {},//页面对象
    tools: {//工具对象
        /*返回jquery对象*/
        get: function (id) {
            return $('#' + id);
        },
        /*获取dom对象*/
        dom: function (id) {
            return document.getElementById(id);
        },
        /*return Number*/
        getHeight: function (i) {
            return this.get(i)[0].offsetHeight ? this.get(i)[0].offsetHeight : this.get(i).height();
        },
        /*return Number*/
        getWidth: function (i) {
            return this.get(i)[0].offsetWidth ? this.get(i)[0].offsetWidth : this.get(i).width();
        },
        /*根据类名获取jquery对象*/
        cls: function (c) {
            return $('.' + c);
        },
        /*获取匹配元素在当前视口的相对偏移。*/
        positionXY: function (i) {
            var o = {};
            o.x = this.get(i).offset().left;
            o.y = this.get(i).offset().top;
            return o;
        },
        /* 验证是否为空 return true*/
        isEmpty: function (o) {
            return o === null || o === undefined || ((Object.prototype.toString.apply(o) === "[object Array]" && !o.length)) || o === "";
        }
    }
};
//UUID
UFFC.tools.UUID = function () {
    this.id = this.createUUID();
};
UFFC.tools.UUID.prototype.valueOf = function () {
    return this.id;
};
UFFC.tools.UUID.prototype.toString = function () {
    return this.id;
};
UFFC.tools.UUID.returnBase = function (number, base) {
    return (number).toString(base).toUpperCase();
};
UFFC.tools.UUID.rand = function (max) {
    return Math.floor(Math.random() * (max + 1));
};
UFFC.tools.UUID.getIntegerBits = function (val, start, end) {
    var base16 = UFFC.tools.UUID.returnBase(val, 16);
    var quadArray = new Array();
    var quadString = '';
    var i = 0;
    for (i = 0; i < base16.length; i++) {
        quadArray.push(base16.substring(i, i + 1));
    }
    for (i = Math.floor(start / 4); i <= Math.floor(end / 4); i++) {
        if (!quadArray[i] || quadArray[i] == '')
            quadString += '0';
        else
            quadString += quadArray[i];
    }
    return quadString;
};
UFFC.tools.UUID.prototype.createUUID = function () {
    var dg = new Date(1582, 10, 15, 0, 0, 0, 0);
    var dc = new Date();
    var t = dc.getTime() - dg.getTime();
    var tl = UFFC.tools.UUID.getIntegerBits(t, 0, 31);
    var tm = UFFC.tools.UUID.getIntegerBits(t, 32, 47);
    var thv = UFFC.tools.UUID.getIntegerBits(t, 48, 59) + '1'; // version 1, security version is 2
    var csar = UFFC.tools.UUID.getIntegerBits(UFFC.tools.UUID.rand(4095), 0, 7);
    var csl = UFFC.tools.UUID.getIntegerBits(UFFC.tools.UUID.rand(4095), 0, 7);
    var n = UFFC.tools.UUID.getIntegerBits(UFFC.tools.UUID.rand(8191), 0, 7)
        + UFFC.tools.UUID.getIntegerBits(UFFC.tools.UUID.rand(8191), 8, 15)
        + UFFC.tools.UUID.getIntegerBits(UFFC.tools.UUID.rand(8191), 0, 7)
        + UFFC.tools.UUID.getIntegerBits(UFFC.tools.UUID.rand(8191), 8, 15)
        + UFFC.tools.UUID.getIntegerBits(UFFC.tools.UUID.rand(8191), 0, 15); // this last number is two octets long
    return tl + tm + thv + csar + csl + n;
};
//模拟顺序map
UFFC.tools.OrderedMap = function () {
    this.keys = new Array();
    this.data = new Object();
};
//数组工具
UFFC.tools.Array = function () {
};

/**
 * 添加内容
 * @param key
 * @param value
 * @returns {boolean}
 */
UFFC.tools.OrderedMap.prototype.put = function (key, value) {
    if (this.data[key] == null) {
        this.keys.push(key);
        this.data[key] = value;
    } else {
        this.data[key] = value;
    }
    return true;
};
/**
 * 获取key对应的值
 * @param key
 * @returns {*}
 */
UFFC.tools.OrderedMap.prototype.get = function (key) {
    return this.data[key];
};
/**
 * 移除key对应的值
 * @param key
 * @returns {boolean}
 */
UFFC.tools.OrderedMap.prototype.remove = function (key) {
    for (var i = 0; i < this.keys.length; i++) {
        if (key === this.keys[i]) {
            var del_keys = this.keys.splice(i, 1);
            for (k in del_keys) {
                this.data[k] = null;
            }
            return true;
        }
    }
    return false;
};
/**
 * 遍历Map,执行处理函数
 *
 * @param {Function} 回调函数 function(key,value,index){..}
 */
UFFC.tools.OrderedMap.prototype.each = function (fn) {
    if (typeof fn != 'function') {
        return;
    }
    var len = this.keys.length;
    for (var i = 0; i < len; i++) {
        var k = this.keys[i];
        fn(k, this.data[k], i);
    }
};
/**
 * 获取键值数组
 * @return entity[{key,value},{key,value}]
 */
UFFC.tools.OrderedMap.prototype.entrySet = function () {
    var len = this.keys.length;
    var entrys = new Array(len);
    for (var i = 0; i < len; i++) {
        entrys[i] = {
            key: this.keys[i],
            value: this.data[this.keys[i]]
        };
    }
    return entrys;
};
/**
 * 判断Map是否为空
 */
UFFC.tools.OrderedMap.prototype.isEmpty = function () {
    return this.keys.length == 0;
};
/**
 * 获取键值对数量
 */
UFFC.tools.OrderedMap.prototype.size = function () {
    return this.keys.length;
};
/**
 * 判断是否含有指定key的值
 *
 * @param  key
 */
UFFC.tools.OrderedMap.prototype.containsKey = function (key) {
    //有的浏览器不支持filter
    //return this.keys.filter(function(v){
    //   if(v===key){
    //       return key;
    //   }
    //}).length>0;
    var find = null;
    for (var i = 0; i < this.keys.length; i++) {
        if (this.keys[i] == key) {
            find = key;
        }
    }
    return find != null;
};
/**
 * toString
 * @returns {string}
 */
UFFC.tools.OrderedMap.prototype.toString = function () {
    var s = "{";
    for (var i = 0; i < this.keys.length; i++) {
        var k = this.keys[i];
        s += k + "=" + this.data[k];
        if (this.keys.length > i + 1) {
            s += ','
        }
    }
    s += "}";
    return s;
};
/**
 * 解析字符串到Map
 * {a=A,b=B,c=B,}
 */
UFFC.tools.OrderedMap.prototype.fromString = function (str) {
    var count = 0;
    if (str && str.length > 0) {
        str = str.trim();
        var startIndex = str.indexOf("{"), endIndex = str.lastIndexOf("}");
        if (startIndex !== -1 && endIndex !== -1) {
            str = str.substring(startIndex + 1, endIndex);
            var arrs = str.split(",");
            for (var i = 0; i < arrs.length; i++) {
                var kv = arrs[i].trim();
                if (kv.length > 0 && kv.indexOf("=") !== -1) {
                    var kv_arr = kv.split("=");
                    if (kv_arr.length == 2) {
                        if (this.put(kv_arr[0].trim(), kv_arr[1].trim())) {
                            count++;
                        } else {
                            console.error('error: kv:' + kv);
                        }

                    }
                }
            }
        } else {
            console.log("data error:" + str);
        }
    } else {
        console.log('data is not empty');
    }
    return count;
};
/**
 * 数组比较
 * 数组a 要比较的数据
 * 数组b 基准数组
 */
UFFC.tools.Array.prototype.getArray = function (a, b, isEquals) {
    var resultEquals = new Array();
    var resultNotEquals = new Array();
    var ai = 0, bi = 0;
    while (ai < a.length && bi < b.length) {
        if (a[ai] < b[bi]) {
            resultNotEquals.push(a[ai]);
            ai++;
        } else if (a[ai] > b[bi]) {
            bi++;
        } else {//相等
            resultEquals.push(a[ai]);
            ai++;
            bi++;
        }
    }
    if (isEquals) {
        return resultEquals;//返回a中和b相同的元素
    } else {
        return resultNotEquals;//返回a中和b不相同的元素
    }
};
/**
 * 判断数据内容是否相同 不考虑顺序
 */
UFFC.tools.Array.prototype.isEqual = function (a, b) {
    if (a.length != b.length) {
        return false;
    }
    a = a.sort();
    b = b.sort();
    for (var i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
            return false;
        }
    }
    return true;
};
/**
 * 判断数组内容是否相同 考虑顺序
 */
UFFC.tools.Array.prototype.isAbsoluteEqual = function (a, b) {
    if (a.length != b.length) {
        return false;
    }
    for (var i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
            return false;
        }
    }
    return true;
};
/**
 * 遮罩层插件
 */
(function () {
    $.extend($.fn, {
        mask: function (msg, maskDivClass) {
            this.unmask();
            // 参数
            var op = {
                opacity: 0.8,
                z: 10000,
                bgcolor: '#ccc'
            };
            var original = $(document.body);
            var position = {top: 0, left: 0};
            if (this[0] && this[0] !== window.document) {
                original = this;
                position = original.position();
            }
            // 创建一个 Mask 层，追加到对象中
            var maskDiv = $('<div class="maskdivgen">&nbsp;</div>');
            maskDiv.appendTo(original);
            var maskWidth = original.outerWidth();
            if (!maskWidth) {
                maskWidth = original.width();
            }
            var maskHeight = original.outerHeight();
            if (!maskHeight) {
                maskHeight = original.height();
            }
            maskDiv.css({
                position: 'absolute',
                top: position.top,
                left: position.left,
                'z-index': op.z,
                width: maskWidth,
                height: maskHeight,
                'background-color': op.bgcolor,
                opacity: 0
            });
            if (maskDivClass) {
                maskDiv.addClass(maskDivClass);
            }
            if (msg) {
                var msgDiv = $('<div style="position:absolute;border:#fff 1px solid; padding:2px;background:#fff"><div style="line-height:16px;background:#fff;padding:2px 10px 2px 10px"><img align="left" src="/static/organization/easyui/themes/default/images/pagination_loading.gif" />&nbsp' + msg + '</div></div>');
                msgDiv.appendTo(maskDiv);
                var widthspace = (maskDiv.width() - msgDiv.width());
                var heightspace = (maskDiv.height() - msgDiv.height());
                msgDiv.css({
                    cursor: 'wait',
                    top: (heightspace / 2 - 2),
                    left: (widthspace / 2 - 2)
                });
            }
            maskDiv.fadeIn('fast', function () {
                // 淡入淡出效果
                $(this).fadeTo('fast', op.opacity);
            });
            return maskDiv;
        },
        unmask: function () {
            var original = $(document.body);
            if (this[0] && this[0] !== window.document) {
                original = $(this[0]);
            }
            original.find("> div.maskdivgen").fadeOut('fast', 0, function () {
                $(this).remove();
            });
        }
    });
})(jQuery);

Array.prototype.inArray = function (value) {
    var i;
    for (i = 0; i < this.length; i++) {
        if (this[i] === value) {
            return true;
        }
    }
    return false
};

