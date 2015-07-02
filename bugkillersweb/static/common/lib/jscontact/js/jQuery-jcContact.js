/*
 * jQuery - jcContact v 2.0
 * Copyright(c) 2012 by Adam’
 * Date: 2012-08-29
 * qq : 1741498
 */
;(function($){
	$.fn.jcContact = function(options) {
		var defaults = {
            speed:200,                   //设置动画时间（mm）
			scrollSpeed : 200,
			position:'center',           //外层框架垂直位置，提供"top","center","bottom"
			posOffsetY : 0,              //微调设置外层框架垂直位置
			btnPosition : 'top',      //按钮垂直位置，提供"top","center","bottom"
			btnPosoffsetY : 0 ,          //微调设置按钮垂直位置
			float:'left',                //框架位置，提供"left","right"
			Event : "mouseover",              //设置展开框架事件，提供"mouseover","lick"
			defaultFun : function(wraper){}
		};
		var options = $.extend(defaults,options);
		return this.each(function() {
			$("body").css("overflow-x","hidden");
			var $this = $(this),
			    _self = this,
				wrapTop = 0,
				BtmTop = 0,
				_width = 0,
				$window = $(window),
				winWidth = $window.width(),
				winHeight = $window.height(),
				$Con = $this.children(":eq(0)"),
				nConWidth = $Con.width(),
				nConHeight = $Con.height(),
				$btn = $this.children(":eq(1)"),
				nbtnWidth = $btn.width(),
				nbtnHeight = $btn.height(),
				//新建参数类
				fnMode = function(){
					this.left = setWrapPos;
					this.right = setWrapPos;
					this.top = setWrapTop;
					this.center = setWrapTop;
					this.bottom = setWrapTop;
					this.btntop = setBtnTop;
					this.btncenter = setBtnTop;
					this.btnbottom = setBtnTop;
				};
			fnMode.prototype.Mode = function(mode,btnPos,wrapPos,winX){
				this[mode](mode,winX);
				this[wrapPos](wrapPos);
				this[btnPos](btnPos);
			};
			//初始化位置
			options.defaultFun(_self);
			var o = new fnMode,
			    speed = Math.round(options.speed*0.5);
			o.Mode(options.float,"btn"+options.btnPosition,options.position,winWidth);
			//滚动事件
			$window.scroll(function(){
				var nScrollTop = $(this).scrollTop();
				setAnimate(nScrollTop,setWrapTop);
				return false;
			}).resize(function(){
				if(options.float === "right"){
					winWidth = $window.width();
					o.Mode(options.float,"btn"+options.btnPosition,options.position,winWidth);
				    return false;
				};
			});
			$btn.bind(options.Event,function(e){
				var obool = null;
				if(options.float == "left"){
					_width = 0;
					obool = parseInt($this.css("left")) < _width;
				} else if(options.float == "right"){
					_width = winWidth - nConWidth;
					obool = parseInt($this.css("left")) > _width;
				};
				if(obool){
					$this.animate({"left": _width},speed);
				};
			})
			$this.bind("mouseleave",function(){
				if(options.float == "left"){
					_width = -nConWidth;
				} else if(options.float == "right"){
					_width = winWidth;
				};
				$this.animate({"left": _width},speed);
			});
			//功能方法
			function setBtnTop(pos){
				var setPos;
				if(pos == "btntop"){
					setPos = 0;
				} else if(pos == "btncenter") {
					setPos = (nConHeight-nbtnHeight)/2;
				} if(pos == "btnbottom") {
					setPos = nConHeight-nbtnHeight;
				};
				BtmTop = setPos+options.btnPosoffsetY;
				$btn.css("top",BtmTop);
				return false;
			};
            function setWrapTop(pos){
				var _st,setVal;
				if(pos == "top"){
					_st = $(window).scrollTop();
					setVal = 0;
				} else if(pos == "center") {
					_st = $(window).scrollTop();
					setVal = (winHeight-nConHeight)/2;
				} else if(pos == "bottom") {
					_st = $(window).scrollTop();
					setVal = winHeight-nConHeight;
				};
				setWrapTop = setVal + options.posOffsetY;
				setAnimate(_st,setWrapTop);
				return false;
			};
			function setWrapPos(sPos,winX){
				var wrapLeft,btnLeft;
				if(sPos == "left"){
			        wrapLeft = -nConWidth;
			        btnLeft = nConWidth;
				} else if(sPos == "right"){
			        wrapLeft = winX;
			        btnLeft =-nbtnWidth;
				};
				$btn.css("left",btnLeft);
				$this.css("left",wrapLeft).show();
				return false;
			};
			function setAnimate(st,val){
				//$this.stop().animate({"top":val+st},options.speed);
				$this.stop().animate({"top":val+st},{ duration: options.scrollSpeed, easing: "easeInOutQuart"  });
				return false;
			};
			
			return false;
		});
	};
})(jQuery)