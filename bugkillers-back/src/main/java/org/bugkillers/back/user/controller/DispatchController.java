package org.bugkillers.back.user.controller;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 跳转分发器
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月30日 下午1:22:33
 * <p> @version 0.0.1
 */
@Controller
public class DispatchController {
	//TODO 
	@RequestMapping("/job")
	public String job(){
		return "index.html";
	}
	
	//TODO 
		@RequestMapping("/job/send")
		public String send(){
			return "OK";
		}

}
