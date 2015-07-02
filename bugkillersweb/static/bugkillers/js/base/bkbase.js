/**
 * Created by dongbin on 2015/6/27.
 * bugkillers的js全局对象
 */

/**
 * 全局对象BK
 * 通过pages实现命名空间的不同来屏蔽js全局污染
 * @type {{}}
 */
var BK = {
    pages: [],
    tools: {},
    url: {}
};
/**
 * 数组工具对象
 * @constructor
 */
BK.tools.Array = function () {
};
BK.tools.Array.prototype.inArray = function (value) {
    var i;
    for (i = 0; i < this.length; i++) {
        if (this[i] === value) {
            return true;
        }
    }
    return false
};
//项目的url
BK.url = {};