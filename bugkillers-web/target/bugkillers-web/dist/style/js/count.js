$(function(){
	var ccount = $("#cc").val();
	var pcount = $("#cp").val();
	show_num('companycount',ccount);
	show_num('positioncount',pcount);
});

function show_num(o,n){
	if(navigator.userAgent.indexOf("Firefox")>0){
		$("#loginToolBar ."+o).html(n);
	}else{
		var it = $("#loginToolBar ."+o+" i");
		var len = String(n).length;
		for(var i=0;i<len;i++){
			if(i!=0 && len%3==i%3 && len>3){
				$("#loginToolBar ."+o).append("<b></b>");
			}
			if(it.length<=i){
				$("#loginToolBar ."+o).append("<i></i>");
			}
			var num=String(n).charAt(i);
			var y = -parseInt(num)*30;
			var obj = $("#loginToolBar ."+o+" i").eq(i);
			
			obj.animate({
				backgroundPositionY :String(y)+'px'
				}, '3000','swing',function(){}
			);
		}
	}	
}