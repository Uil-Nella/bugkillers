$(function(){
	//刷新
	$('.d_refresh').click(function(){
		top.location.reload();
	});
	
	//所投递职位的进程状态 ： 折叠菜单打开
	$('#deliveryForm').on('click','.btn_showprogress',function(e){
		e.preventDefault();
		var _this = $(this);
		if(_this.parents('li').hasClass('open')){
			_this.children('i').removeClass('transform');
			_this.parents('li').removeClass('open').children('.progress_status').hide();
		}else{
			$('#deliveryForm li').removeClass('open');
			$('#deliveryForm li').find('.btn_showprogress').children('i').removeClass('transform');
			$('#deliveryForm li .progress_status').hide();
			_this.children('i').addClass('transform');
			_this.parents('li').addClass('open').children('.progress_status').show();
		}
	});
	//所投递职位的进程状态 ： 折叠菜单关闭
	$('#deliveryForm').on('click','.btn_closeprogress',function(e){
		e.preventDefault();
		var _this = $(this);
		_this.parents('li').find('.btn_showprogress').children('i').removeClass('transform');
		_this.parents('li').removeClass('open').children('.progress_status').hide();
	});
	
	//面试体验-弹窗弹出
	$('.my_delivery .btn_record').click(function(){	
    	$.ajax({
		url:ctx+'/options/simpleRemarkList.json',
		type:'get',
		dataType:'json'
	}).done(function(result){
		if(result.success){
			for(var i = 0;i < 6;i++){
				$('#box_record ul li').eq(i).html(result.content[i].optionValue)
			}
			
		}
	})

    	$.ajax({
		url:ctx+'/options/simpleRemarkList.json',
		type:'get',
		dataType:'json'
	}).done(function(result){
		if(result.success){
			for(var i = 0;i < 6;i++){
				$('#box_record ul li').eq(i).html(result.content[i].optionValue)
			}
			
		}
	})

		var id = '';
		var score = '';
		var inRe = '';
		var remark = '';
		var inDesc = '';
		var showname = '';
		var senduid = '';
		var poid = '';
		var deid = '';
		if($(this).attr('rel')=='hasInEx'){
			id = $(this).attr('data-id'); 
			score = $(this).attr('data-score'); 
			inRe = $(this).attr('data-inRe'); //面试结果：1-已发offer 2-不合适
			remark = $(this).attr('data-remark'); 
			inDesc = $(this).attr('data-inDesc');
			inDesc = inDesc.replace(/<br\s\/>/g,'');
			showname = $(this).attr('data-showname'); //是否匿名 1-匿名 2-不匿名
		}
		senduid = $(this).attr('data-senduid');
		poid = $(this).attr('data-poid');
		deid = $(this).attr('data-deid');
		var recordPopBox = $('#recordPopBox');
		$('#recordId').val(id);
		$('#interviewResult li').removeClass('current').find('em').remove();
		$('#interviewResult li input').removeAttr("checked");
		if(inRe){
			/**nancy  prop()原来为attr()**/
			$('#interviewResult li input[value='+inRe+']').prop("checked",true).parent('li').addClass('current').append('<em></em>');
		}
		$('#recordStarSelect li').removeClass('choosed');
		$('#recordStarSelect li').each(function(i){
			if(i<score){
				$(this).addClass('choosed');
			}
		});
		$('#recordStar').val(score);
		
		if(remark != ''){
			$('#select_record_hidden').val(remark);
			$('#select_record').val(remark);
		}
		
		$('#interviewDesc').val(inDesc);
		$('#interviewDesc').siblings('.word_count').children('span').text(500 - inDesc.length);
		$('#isShowName').val(showname);
		if(showname == 1){
			$('#showName input').attr('checked','checked');
			$('#showName i').show();
		}else{
			$('#showName input').removeAttr('checked');
			$('#showName i').hide();
		}
		$('#senduid').val(senduid);
		$('#poid').val(poid);
		$('#deid').val(deid);
		$('#recordForm span.error').hide();
		$('#recordForm').find('input.error').removeClass('error');
		recordPopBox.fadeIn(200);
//		已收到面试后 弹出窗口的内容 ****elen****
		if(inRe == 1){
			$('#interviewResult li').css('display','none');
			$("<p>我已经收到offer啦O(∩_∩)O~</p>").appendTo($('#interviewResult'));
			$('#interviewResult li:eq(0)').addClass('current');
			$('#interviewResult li.current input').val(1);
		}
		else {
			$('#interviewResult').find('li').css('display','block');
		}
//  	IE 78 input内容兼容
		 if(navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.match(/7./i)=="7.")
		 {
			 if($('#select_record').val() == ''){
					$('#select_record').val('15字以内对面试的简单描述哦');
				}
			 if($('#interviewDesc').val() == ''){
					$('#interviewDesc').val('记录下自己的面试经历');
				}
		 }
		 else if(navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.match(/8./i)=="8.")
		 {
			 if($('#select_record').val() == ''){
					$('#select_record').val('15字以内对面试的简单描述哦');
				}
			 if($('#interviewDesc').val() == ''){
					$('#interviewDesc').val('记录下自己的面试经历');
				}
		 }
		 else if(navigator.appName == "Microsoft Internet Explorer" && navigator.appVersion.match(/9./i)=="9.")
		 {
			 if($('#select_record').val() == ''){
					$('#select_record').val('15字以内对面试的简单描述哦');
				}
			 if($('#interviewDesc').val() == ''){
					$('#interviewDesc').val('记录下自己的面试经历');
				}
		 }
	});

	//面试体验-弹窗-提交
	$('#recordForm').validate({		
		onkeyup: false,
    	focusCleanup:true,
        rules: {
        	type: {
        		required:true
    	   	}, 
    	   	recordStar: {
    	   		required: true
    	   	},
    	   	record: {
    	   		required: true,
    	   		ievaluean:true
    	   	},
    	   	interviewDesc: {
    	   		required: false,
    	   		length:500
    	   	}
    	},
    	messages: {
    		type: {
        		required:"请选择面试结果"
    	   	}, 
    	   	recordStar: {
    	   		required: "请给出评分"
    	   	},
    	   	record: {
    	   		required: "请填写短评"
    	   	}
    	},
    	errorPlacement:function(label, element){
    		if(element.attr("type") == "hidden"){
    			label.appendTo($(element).parent());
    		}else{
    			label.insertAfter(element);
    		}
    	},
    	submitHandler:function(form){
    		var id = $('#recordId').val();
    		var interviewResult = $('#interviewResult li.current input').val();
    		var score = $('#recordStar').val();
    		var simpleRemark = $('#select_record_hidden').val();
    		var interviewDesc = $.trim($('#interviewDesc').val());
    		if( interviewDesc == '记录下自己的面试经历'){
    			interviewDesc='';
    		}
    		var isShowName = $('#isShowName').val();
    		var sendUserId = $('#senduid').val();
    		var positionId = $('#poid').val();
    		var deliverId = $('#deid').val();
//    		var resubmitToken = $('#resubmitToken').val();
    		$.ajax({
    			url:ctx+'/mycenter/mergeInterviewExp.json',
    			type:'POST',
    			data:{
    				id:id,
    				interviewResult:interviewResult,
    				score:score,
    				simpleRemark:simpleRemark,
    				interviewDesc:interviewDesc,
    				isShowName:isShowName,
    				sendUserId:sendUserId,
    				positionId:positionId,
    				deliverId:deliverId
//    				resubmitToken:resubmitToken
    			},
            	dataType:'json'
    		}).done(function(result){
//				$('#resubmitToken').val(result.resubmitToken);
    			if(result.success){
    				top.location.href=top.location.href;
    			}else{
    				alert(result.msg);
    			}
    		});
        }
    });
	
	//countdown
	$('#interviewDesc').keyup(function(){
		var field = $(this);
		 if ($.trim(field.val()).length > 500) {
			 field.val($.trim(field.val()).substring(0, 500));
		 } else {
			 field.siblings('.word_count').children('span').text(500 - $.trim(field.val()).length);
		 }
	});
	
	//弹窗关闭
	$('#recordPopBox .boxclose').click(function(){
		$('#select_record').removeClass('select_340_focus');
		$('#box_record').hide();
		$('#recordPopBox').fadeOut(200);
		$('#interviewResult p').remove();
		$('#interviewResult li').css('display','none');
		$('#select_record').val('');
	});
	
	//弹窗 : 单选面试结果
	$('.record_radio li input').click(function(e){
		$(this).attr("checked",true).parent('li').addClass('current').append('<em></em>').siblings().removeClass('current').find('em').remove();
	});
	
	//弹窗 : 选短评

	//点击其他位置短评框消失
	$('body').click(function(){
		if($('#select_record').hasClass('select_340_focus')){
			$('#select_record').removeClass('select_340_focus');
		}
		$('#box_record').hide();
		var recordText = $('#select_record').val();
		$('#select_record_hidden').val(recordText);
	})
	// 长评
//	$('#interviewDesc').click(function(e){e.stopPropagation();
//	$('#box_record').hide()})
	

	//输入文本时短评框消失，为空时出现。
	$('#select_record').bind('keyup',function(e){
		e.stopPropagation();
		if($(this).val() == ''){
			$(this).addClass('select_340_focus');
			$('#box_record').show();
		}
		else if($(this).hasClass('select_340_focus')){
				$(this).removeClass('select_340_focus');
				$('#box_record').hide();
				
			 }
		
			$('#select_record').siblings('span').hide();
//			var curLength=$(this).val().length;	
//			if(curLength > 15){
//				$(this).val($(this).val().substring(0,15));
//			}
	});
	
	//点击短评将短评加入文本框
	$('#box_record').on('click','ul li',function(e){
		e.stopPropagation();
		var recordText = $(this).text();
		$('#select_record').val(recordText).removeClass('select_340_focus').focus();
		$('#select_record_hidden').val(recordText);
		$('#box_record').hide();
		$('#select_record').siblings('span').css('display','none');
		//$("#recordForm").validate().element( $('#select_record_hidden') ); 
	});
	
	$('#recordStarSelect li').click(function(){
		var indexNo = $('#recordStarSelect li').index($(this));
		$('#recordStarSelect li').each(function(i){
			if(i <= indexNo){
				$(this).addClass('choosed');
			}else{
				$(this).removeClass('choosed');
			}
		});
		$('#recordStar').val(indexNo+1);
		$('#recordStarSelect').siblings('span').hide();
	});
	
	//选框hover
	$('.checkbox').hover(function(){
		if(!$(this).children('input').attr('checked')){
			$(this).addClass('checkhover');
		}
	},function(){
		if(!$(this).children('input').attr('checked')){
			$(this).removeClass('checkhover');
		}
	});
	
	//匿名提交
	$('#recordPopBox .checkbox input').bind('click',function(){
		if($(this).attr('checked')){
			$(this).removeAttr('checked');
			$(this).siblings('i').fadeOut(200);
			$('#isShowName').val(2);
		}else{
			$(this).attr('checked','checked');
			$(this).siblings('i').fadeIn(200);
			$('#isShowName').val(1);
		}
		$(this).parent().removeClass('checkhover');
		return false;
	});
	//点击文本框短评框出现和消失
	$('#select_record').bind('click',function(e){
		e.stopPropagation();
		if($('#select_record').val() == '' || $('#select_record').val() == "15字以内对面试的简单描述哦"){
			$('#select_record').val('');
			if($(this).hasClass('select_340_focus')){
				$(this).removeClass('select_340_focus');
				$('#box_record').hide();
			}else{
				$(this).addClass('select_340_focus');
				$('#box_record').show();
			}
		}
	});
	$('#interviewDesc').css('width','320px');
})