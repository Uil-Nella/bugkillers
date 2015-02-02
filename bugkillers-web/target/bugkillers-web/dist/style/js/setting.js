$(function(){
	/***************************
	 * 注册激活页: 重新发送验证邮件
	 */
	$('#thirdBind_resend').click(function(){
		var recordCode = $('#recordCode').val(); 
		$.ajax({
			data:{recordCode:recordCode},
        	type:'POST',        	
        	url:ctx+'/user/resendActive.json'
        }).done(function(result) {
        	if(result.success){
        		$.colorbox({inline:true, href:$("#resend_success"),title:"验证邮件发送成功"});
        	}else{
        		alert(result.msg);
        	}
        });
	});
	
	/*bindEmail*/
	/**没有进行帐号绑定的时候，如果点击logo离开，出现弹窗**/
	var isLeave=true;
	window.onbeforeunload = function(){
		if(isLeave){
			return;
		}else{
			return "内容还未保存，确认离开该页面吗？ ";	
		}
	 }
	$('#confirmLeave').click(function(){
		isLeave = false;
	})
	
	/*判断是否有拉勾帐号*/
	$('.user_firstMainContent').css({"padding-bottom":"10px"});
	$('#user_selectAccount label').not('.agreeNotice').click(function(){		
		$(this).addClass('checked').parent('form').siblings('form').children('label').removeClass('checked');		
		$(this).siblings('div').show();
		$(this).parent('form').siblings('form').children('div').hide();
		if($(this).siblings('div:has("ul")').length>0){
			$('.user_warn').hide();
		}else{
			$('.user_warn').show();
		}
	});	
	/*解决placeholder和value的颜色问题（默认为一致，需求为不一致）*/
	function placeholderSupportUserBind() {
	    return 'placeholder' in document.createElement('input');
	}
	function placeholderFnUserBindFn(){
		if(!placeholderSupportUserBind()){   
		    $('[placeholder]').focus(function() {
		        var input = $(this);
		        if (input.val() == input.attr('placeholder')) {
		            input.val('');
		            input.removeClass('placeholder');
		            input.css('color','#333');
		        }else{
		        	input.css('color','#333');
		        }
		    }).blur(function() {
		        var input = $(this);
		        if (input.val() == '' || input.val() == input.attr('placeholder')) {
		            input.addClass('placeholder');
		            input.val(input.attr('placeholder'));
		            input.css('color','#999');
		        }
		    }).blur();
		}
		
		 //样式初始化
	    if ($('[placeholder]').value === "") {
	    	$('[placeholder]').value = $('[placeholder]').attr('placeholder'); 
	    }
	}
	placeholderFnUserBindFn();
	/*单选按钮 选择用户类型  招人还是找工作*/
	$('.register_radio li').click(function(){		
		$(this).children('input').attr('checked',true);			
		$(this).siblings().children('input').removeAttr('checked');	
		$(this).addClass('current').append('<em></em>').siblings().removeClass('current').find('em').remove();	
		$("#user_regBindForm").validate().element($(this).find('input'));		
	});
	/*解决同时出现两个错误提示*/
	$('#user_LoginEmail,#user_hasLoginEmail,#user_hasLoginPassword,#user_LoginPassword').focus(function(){
		$('#noLagouAccount_beError').hide();
		$('#hasLagouAccount_EmailBeError').hide();
		$('#hasLagouAccount_beError').hide();
		$('#hasNoAccount_beError').hide();
	});	
	/*验证绑定帐号表单  已有帐号*/
	$('#user_bindForm').validate({
		/*onkeyup: false,
    	focusCleanup:true,*/
    	rules: {
    	   	email: {
    	    	required: true,
    	    	email: true
    	   	},
    	   	password: {
    	    	required: true,
    	    	rangelength: [6,16]
    	   	}
    	},
    	messages: {
    	   	email: {
    	    	required: "请输入登录邮箱地址",
    	    	email: "请输入有效的邮箱地址，如：vivi@lagou.com"
    	   	},
    	   	password: {
    	    	required: "请输入密码",
    	    	rangelength: "请输入6-16位密码，字母区分大小写"
    	   	}
    	},
    	errorPlacement:function(label, element){
    		if(element.attr("type") == "radio"){
    			label.insertAfter($(element).parents('ul')).css('marginTop','-20px');
    		}else if(element.attr("type") == "checkbox"){
    			label.insertAfter($(element).parent()).css('clear','left');
    			$('#user_saveRegAccount').css('margin-top','20px');
    		}else{
    			label.insertAfter(element);
    		};		    		   		
    	},
    	submitHandler:function(form){
    		isLeave = true;
    		var email = $('#user_hasLoginEmail').val();    		 
    		var password = $('#user_hasLoginPassword').val();
    		var type=$('#user_HasAccount').attr('value');//默认  0新帐号   1 已有帐号 null当做0	
    		var resubmitToken = $('#resubmitToken').val();
    		var idCode = $('#idCode').val();   
    		$(form).find(":submit").attr("disabled", true);
    		$.ajax({
    			type:'post',
    			data:{idCode:idCode,resubmitToken:resubmitToken,type:type,confirm:false,choseUser:1,email:email,password:password},
    			url:ctx+'/user/bindEmail.json',	   
    			dataType:'json',
    			success:function(result){
    				$('#resubmitToken').val(result.resubmitToken);	    				
    				if(result.success){
    					if(result.code==5 || result.code ==8 || result.code ==11 || result.code ==14 ){
    						window.location.href = ctx+'/user/registerSuccess.html';
    					}else{
    						//result.content == recordCode  == idCode
    						window.location.href = ctx+'/user/bindAccountActive.html?recordCode=' + result.content;	
    					}  					
    				}else if(result.success == false && result.code ==0 ){
    					/*密码错误和页面超时的提示信息*/
						$('#hasLagouAccount_beError').html(result.msg).show();   					
    				}else if(result.success == false && result.code ==100){
    					//邮箱未注册提示的错误
    					$('#hasLagouAccount_EmailBeError').html(result.msg).show(); 
    				}else if(result.success == false && result.code ==1){
    					$('#accountBindType').html('邮箱');
    					$('#user_hasBindAccount').html(result.msg);
    					$('#user_loginCurrentAccount').html(result.content);
    					$('#user_confirmBindTips').html('换个邮箱绑定');
    					$.colorbox({inline:true, href:$("#bindTips"),title:"帐号绑定"});
    					$('#user_confirmBindTips').on('click',function(){
    						isLeave = true;
    						$.colorbox.close();
    						parent.jQuery.colorbox.close();
    					});	    					
    				}else if(result.success == false && result.code == 2){
    					$.colorbox({inline:true, href:$("#bindReplace"),title:"帐号绑定"});
    					$('#user_oldAccount').html(result.content[1]);
    					$('#user_typeAccount').html(result.content[2]);    					
    					$('#user_replaceAccount').html(result.content[3]);
    					//$('#user_name').html(result.content[1]);
    					$('#user_resumeScore').html(result.content[0][0]["resumeStatus"]);
    					$('#user_jobCount').html(result.content[0][0]["deliverCount"]);
    					$('#user_publishJob').html(result.content[0][0]["publishCount"]);
    					$('#user_receiveCount').html(result.content[0][0]["receiveCount"]);   					
    					$('#user_replaceResumeScore').html(result.content[0][1]["resumeStatus"]);
    					$('#user_replaceJobCount').html(result.content[0][1]["deliverCount"]);
    					$('#user_replacePublishJob').html(result.content[0][1]["publishCount"]);
    					$('#user_replaceReceiveCount').html(result.content[0][1]["receiveCount"]);   					   					 					
    				}
    				$(form).find(":submit").attr("disabled", false);
    			},
    			error:function(){
    				$(form).find(":submit").attr("disabled", false);
    			}			
    		});    		
        }  
	});	
	
	var userChoose = $('.chooseAccount label');
	var choseUser = $('.chooseAccount label.current').find('span.c3').attr('value');
	
	/*选择保留帐号的确定按钮*/
	$('#user_confirmReplace').on('click' , function(){
		var isOldChecked = $('#user_HasAccount').attr('class') == 'checked';
		if(userChoose.hasClass('current')){  							
			$('#chooseRemainError').html('请选择需要保留的帐号').hide();    							
			$('#user_confirmReplace').attr("disabled", false); 		
			/*if($('#hasSidebar').val() == 1){
				$.colorbox({inline:true, href:$("#confirmBind2"),title:"帐号绑定"});
			}else{
				$.colorbox({inline:true, href:$("#confirmBind1"),title:"帐号绑定"});
			}*/
			if($('#hasSidebar').val() == 1){
				$.colorbox({inline:true, href:$("#confirmBind2"),title:"帐号绑定"});
			}else if(isOldChecked){
				$.colorbox({inline:true, href:$("#confirmBind1"),title:"帐号绑定"});	
			}else{
				$.colorbox({inline:true, href:$("#confirmBind3"),title:"帐号绑定"});	
			}
		}else{
			$('#chooseRemainError').html('请选择需要保留的帐号').show();    							
		}					
	} );	
	/*选择保留帐号*/
	$('.chooseAccount label em,.chooseAccount .c7').click(function(){
		$('#chooseRemainError').html('请选择需要保留的帐号').hide(); 
		$(this).parents('label').addClass('current').siblings('label').removeClass('current'); 
	})
	
	/*返回修改按钮*/
	$('.user_backReplace').on('click',function(){					
		$.colorbox({inline:true, href:$("#bindReplace"),title:"帐号绑定"});
	});	
	/*确认绑定按钮的ajax*/
	$('#user_confirmBind1').on('click',function(){
		var email = $('#user_hasLoginEmail').val();    		 
		var password = $('#user_hasLoginPassword').val();
		var type=$('#user_HasAccount').attr('value');//默认  0新帐号   1 已有帐号 null当做0	
		var userType = $('.register_radio li.current input').val();//0-个人用户 1-企业用户  null-未选择
		var idCode = $('#idCode').val();   
		var resubmitToken = $('#resubmitToken').val();
		var choseUser = $('.chooseAccount label.current').find('span.c3').attr('value');
		$.ajax({
			type:'post',
			data:{idCode:idCode, resubmitToken:resubmitToken, type:type,comfirm:true,choseUser:choseUser,userType:userType,email:email,password:password},
			url:ctx+'/user/bindEmail.json',	
			success:function(result){
				isLeave = true;
				$('#resubmitToken').val(result.resubmitToken);
				if(result.success){
					if(result.code==5 || result.code ==8 || result.code ==11 || result.code ==14 ){
						window.location.href = ctx+'/user/registerSuccess.html';
					}else{
						window.location.href = ctx+'/user/bindAccountActive.html?recordCode=' + result.content;
					} 				    					
				}else{	
					if(result.msg == undefined){//重复提交
						result = eval('(' + result + ')');
					}
					if(result.msg == '' || result.msg == undefined || result.msg == null ){
						alert('绑定失败');
					}else if(result.msg =='页面超时，请刷新页面重新操作'){
						alert('你已成功点击“确认绑定”，不要重复点击哦');
					}else{
						errorTips("绑定失败：" + result.msg,"帐号绑定");
					}					
				}    									
			}
		});
	});	
	
	/*注册拉勾帐号的表单验证  新帐号*/	
	$("#user_regBindForm").validate({  
		/*onkeyup: false,
    	focusCleanup:true,*/
		rules: {
        	type:{
        		required: true
        	},
	   	   	email: {
	   	    	required: true,
	   	    	email: true
	   	   	},
	   	   	password: {
	   	    	required: true,
	   	    	rangelength: [6,16]
	   	   	},
	   	   	checkbox:{required:true}
    	},
    	messages: {
    		type:{
        		required:"请选择使用拉勾的目的"
        	},
    	 	email: {
    	    	required: "请输入常用邮箱地址",
    	    	email: "请输入有效的邮箱地址，如：vivi@lagou.com"
    	   	},
    	   	password: {
    	    	required: "请输入密码",
    	    	rangelength: "请输入6-16位密码，字母区分大小写"
    	   	},
    	   	checkbox: {
    	    	required: "请接受拉勾用户协议"
    	   	}
    	},
    	errorPlacement:function(label, element){
    		if(element.attr("type") == "radio"){
    			label.insertAfter($(element).parents('ul')).css('marginTop','-20px');
				$('.user_registerRadio').css({'margin-top':'-10px','margin-bottom':'5px;'});
				$('.agreeNotice').css('margin-top','14px')
    		}else if(element.attr("type") == "checkbox"){
    			label.insertAfter($(element).parent()).css('clear','left');
    			$('#user_saveRegAccount').css('margin-top','20px');
    		}else{
    			label.insertAfter(element);
    		};	   		
    	},
    	submitHandler:function(form){    
    		var email = $('#user_LoginEmail').val();    		 
    		var password = $('#user_LoginPassword').val();
    		var type=$('#user_NoAccount').attr('value');//默认  0新帐号   1 已有帐号 null当做0	
    		var resubmitToken = $('#resubmitToken').val();
    		var userType = $('.register_radio li.current input').val();//0-个人用户 1-企业用户  null-未选择
    		var idCode = $('#idCode').val();   
    		$(form).find(":submit").attr("disabled", true);
    		$.ajax({
    			type:'post',
    			data:{idCode:idCode,resubmitToken:resubmitToken,type:type,confirm:false,choseUser:1,userType:userType,email:email,password:password},
    			url:ctx+'/user/bindEmail.json',	   
    			dataType:'json',
    			success:function(result){
    				$('#resubmitToken').val(result.resubmitToken);	    				
    				if(result.success){
    					if(result.code==5 || result.code ==8 || result.code ==11 || result.code ==14 ){
    						window.location.href = ctx+'/user/registerSuccess.html';
    					}else{
    						//result.content == recordCode  == idCode
    						window.location.href = ctx+'/user/bindAccountActive.html?recordCode=' + result.content;	
    					}  					
    				}else if(result.success == false && result.code ==0 ){
    					/*密码错误和页面超时的提示信息*/
						//$('#hasNoAccount_beError').html(result.msg).show();
    					$('#noLagouAccount_beError').html(result.msg).show();
    				}else if(result.success == false && result.code ==100){
    					//邮箱未注册提示的错误
    					//$('#noLagouAccount_beError').html(result.msg).show(); 
    				}else if(result.success == false && result.code ==1){
    					$('#accountBindType').html('邮箱');
    					$('#user_hasBindAccount').html(result.msg);
    					$('#user_loginCurrentAccount').html(result.content);
    					$('#user_confirmBindTips').html('换个邮箱绑定');
    					$.colorbox({inline:true, href:$("#bindTips"),title:"帐号绑定"});
    					$('#user_confirmBindTips').on('click',function(){
    						isLeave = true;
    						$.colorbox.close();
    						parent.jQuery.colorbox.close();
    					});	    					
    				}else if(result.success == false && result.code == 2){
    					$.colorbox({inline:true, href:$("#bindReplace"),title:"帐号绑定"});
    					$('#user_oldAccount').html(result.content[1]);
    					$('#user_typeAccount').html(result.content[2]);    					
    					$('#user_replaceAccount').html(result.content[3]);
    					//$('#user_name').html(result.content[1]);
    					$('#user_resumeScore').html(result.content[0][0]["resumeStatus"]);
    					$('#user_jobCount').html(result.content[0][0]["deliverCount"]);
    					$('#user_publishJob').html(result.content[0][0]["publishCount"]);
    					$('#user_receiveCount').html(result.content[0][0]["receiveCount"]);   					
    					$('#user_replaceResumeScore').html(result.content[0][1]["resumeStatus"]);
    					$('#user_replaceJobCount').html(result.content[0][1]["deliverCount"]);
    					$('#user_replacePublishJob').html(result.content[0][1]["publishCount"]);
    					$('#user_replaceReceiveCount').html(result.content[0][1]["receiveCount"]);   					   					 					
    				}
    				$(form).find(":submit").attr("disabled", false);
    			},
    			error:function(){
    				$(form).find(":submit").attr("disabled", false);
    			}			
    		});    
    	}
	});

	
	/**新帐号时的二次确认按钮**/
	$('#newAccount_confirmBind1').click(function(){
		var email = $('#user_LoginEmail').val();    		 
		var password = $('#user_LoginPassword').val();
		var type=$('#user_NoAccount').attr('value');//默认  0新帐号   1 已有帐号 null当做0	
		var userType = $('.register_radio li.current input').val();//0-个人用户 1-企业用户  null-未选择
		var idCode = $('#idCode').val();   
		var resubmitToken = $('#resubmitToken').val();
		var choseUser = $('.chooseAccount label.current').find('span.c3').attr('value');
		$.ajax({
			type:'post',
			data:{idCode:idCode, resubmitToken:resubmitToken, type:type,comfirm:true,choseUser:choseUser,userType:userType,email:email,password:password},
			url:ctx+'/user/bindEmail.json',	
			success:function(result){
				isLeave = true;
				$('#resubmitToken').val(result.resubmitToken);
				if(result.success){
					if(result.code==5 || result.code ==8 || result.code ==11 || result.code ==14 ){
						window.location.href = ctx+'/user/registerSuccess.html';
					}else{
						window.location.href = ctx+'/user/bindAccountActive.html?recordCode=' + result.content;
					} 				    					
				}else{	
					if(result.msg == undefined){//重复提交
						result = eval('(' + result + ')');
					}
					if(result.msg == '' || result.msg == undefined || result.msg == null ){
						alert('绑定失败');
					}else if(result.msg =='页面超时，请刷新页面重新操作'){
						alert('你已成功点击“确认绑定”，不要重复点击哦');
					}else{
						errorTips("绑定失败：" + result.msg,"帐号绑定");
					}					
				}    									
			}
		});
	})
	/*** accountBind.html | wrote by vee ***/
	/*弹出确认取消绑定弹窗 */
	$('#cancelBind').click(function(){
		$.colorbox({inline:true, href:$("#confirmUnbind"),title:"帐号绑定"});		
	});
	
	$('#cancleSina').click(function(){
		$.colorbox({inline:true, href:$("#confirmUnbindSina"),title:"帐号绑定"});
	});
	
	/*弹出确认取消绑定qq弹窗后的确定按钮*/
	$('#user_confirmUnbind').click(function(){
		window.location.href=ctx+'/ologin/unbindOAuthAccount.html?origin=qq';
	})
	/*弹出确认取消绑定微博弹窗后的确定按钮*/
	$('#user_confirmUnbindSina').click(function(){
		window.location.href=ctx+'/ologin/unbindOAuthAccount.html?origin=sina';
	})
	/*确认取消绑定的取消按钮，无刷新，直接关闭弹窗*/
	$('#confirmUnbind .cancel,#confirmUnbindSina .cancel , #confirm_unbindService .cancel').click(function(){
		$.colorbox.close();
		parent.jQuery.colorbox.close();
	});
	
	$('#bindTips .btn,#bindTips .cancel').bind('click',function(){
		$.colorbox.close();
		parent.jQuery.colorbox.close();
	});
	$('#bindReplace .cancel').bind('click',function(){
		$('#chooseRemainError').html('请选择需要保留的帐号').hide();    
		$.colorbox.close();
		parent.jQuery.colorbox.close();
	})
	/*$('#bindReplaceForm .chooseAccount label').click(function(){
		if($(this).hasClass('current')){	
			$('#userIdCode').addClass('replaceChecked');			
			return;
		}else{		
			$('#userIdCode').removeClass('replaceChecked');
			$(this).removeClass('current').siblings('label').addClass('current');			
		}
	});*/

	//修改密码页面
	$('#oldpassword').focus(function(){
		$('#updatePwd_beError').hide();
	})
	$('#updatePswForm').validate({
		/*onkeyup: false,
    	focusCleanup:false,*/
        rules: {
        	oldpassword: {
        		required:true,
    	    	rangelength: [6,16]
    	   	}, 
    	   	newpassword: {
    	   		required: true,
    	    	rangelength: [6,16]
    	   	},
    	   	comfirmpassword: {
    	   		required: true,
    	   	    equalTo: "#newpassword"
    	   	}
    	},
    	messages: {
        	oldpassword: {
        		required:"请输入当前密码",
    	    	rangelength: "请输入6-16位密码，字母区分大小写"
    	   	}, 
    	   	newpassword: {
    	   		required: "请输入新密码",
    	    	rangelength: "请输入6-16位密码，字母区分大小写"
    	   	},
    	   	comfirmpassword: {
    	   		required: "请再次输入新密码",
    	    	equalTo: "两次输入的密码不一致，请重新输入"
    	   	}
    	},
    	submitHandler:function(form){
    		var oldpassword = $('#oldpassword').val();
    		var newpassword = $('#newpassword').val();
    		var comfirmpassword = $('#comfirmpassword').val();
    		var resubmitToken = $('#resubmitToken').val();
    		$.ajax({
    			url:ctx+'/user/updatePwd.json',
    			type:'POST',
    			data:{
    				oldPassword:oldpassword,
    				newPassword:newpassword,
    				newPassword2:comfirmpassword,
    				resubmitToken:resubmitToken
    			},
            	dataType:'json'
    		}).done(function(result){
				$('#resubmitToken').val(result.resubmitToken);
    			if(result.success){
    				$.colorbox({inline:true, href:$("#updatePassword"),title:"修改密码成功"});
    				setCountdown(4,'updatePassword h4 span',ctx+"/user/logout.html");	//调用倒计时
    			}else{
    				$('#updatePwd_beError').html(result.msg).show();
    			}
    		});
        }  
    });
	
	//解除招聘服务页面
	/*$('.user_confirmDel').click(function(){
		$.ajax({
			url:ctx+'/user/closeService.json',
			type:'POST',
			dataType:'json'
		}).done(function(result){
			if(result.success){
				$.colorbox({inline:true, href:$("#unbindService"),title:"确定解除招聘服务"});
				//setCountdown(4,'unbindService h4 span',ctx+"/corpCenter/bindStep1.html");	//调用倒计时
			}else{
				alert(result.msg);
			}
		});
	});*/
	$('.user_confirmDel').click(function(){
		$.colorbox({inline:true, href:$("#confirm_unbindService"),title:"解除招聘服务"});
	});
	$('#confirm_unbind').click(function(){
		$.ajax({
			url:ctx+'/user/closeService.json',
			type:'POST',
			dataType:'json'
		}).done(function(result){
			if(result.success){
				$.colorbox({inline:true, href:$("#unbindService"),title:"解除招聘服务"});
				setCountdown(4,'unbindService h4 span',ctx+"/corpCenter/bindStep1.html");	//调用倒计时
			}else{
				alert(result.msg);
			}
		});
	})
});

function setCountdown(time,id,url){
	var count = setTimeout(function(){$("#"+id).html(time);setCountdown(time-1,id,url)},1000);
	if(time==0){
		clearTimeout(count);
		top.location.href=url;
	}
}