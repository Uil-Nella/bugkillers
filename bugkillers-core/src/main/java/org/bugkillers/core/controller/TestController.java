package org.bugkillers.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuxinyu on 15/7/6.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @ResponseBody
    @RequestMapping(value = {"/alive"}, method = RequestMethod.GET)
    public Map<String, Object> monitorAlive() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("alive", "ok");
        return result;
    }
}
