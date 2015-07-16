/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package org.bugkillers.core.controller;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
 
/**
 * API访问Controller
 * 使用HttpClient中转请求
 * Created by liuxinyu on 15/4/24.
 */
@Controller
@ApiIgnore
@RequestMapping("/api")
public class SpringFoxController {
 
//    private final static Log logger = LogFactory.getLog(LogConstants.LOG_LEVEL_INFO);
    private final static String COLON = ":";
    private final static String API_DOC = "/v2/api-docs";
 
    @RequestMapping("/")
    public void api(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取url地址
        String reqUrl = request.getRequestURL().toString();
        //logger.info("api页面请求：" + reqUrl);
        reqUrl = reqUrl.replace("api", "api") + "index.html";
        HttpClient client = new HttpClient();
        HttpMethod method = new GetMethod(reqUrl);
        client.executeMethod(method);
        //api url
        String apiUrl = request.getServerName() + COLON + request.getServerPort() + API_DOC;
 
        String html = method.getResponseBodyAsString();
        //处理html页面内容,使其可以访问静态资源
        String body = html.replace("petstore.swagger.io/v2/swagger.json", apiUrl)
                .replace("css/", "/api/css/")
                .replace("lib/", "/api/lib/")
                .replace("swagger-ui.js", "/api/swagger-ui.js");
        response.getWriter().write(body);
        response.getWriter().flush();
    }
}