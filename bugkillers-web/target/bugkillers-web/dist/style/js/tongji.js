	var _script = document.createElement('script');
	var hostHeader = "http://";
	var hostStr = "data.lagou.com/tongji/cookie/";
	var requestMapping = "ajaxCross.json";
	var requestParams = "?some=1";
	_script.src = hostHeader+hostStr+requestMapping+requestParams;
	_script.charset = "UTF-8";
	document.getElementsByTagName('head')[0].appendChild(_script);