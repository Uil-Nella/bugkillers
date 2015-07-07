package org.bugkillers.core.controller;

import org.bugkillers.core.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuxinyu on 15/7/7.
 */

//@Controller
public class RESTfulController /*extends Context*/ {
    /**
     * 查询单个用户
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public User get(@PathVariable("userId") int userId) {
        //Log4jUtil.debug(this, "获取用户userId=" + userId);
        User user = createUser(userId);
        return user;
    }
    /**
     * 查询用户列表
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.PATCH)
    @ResponseBody
    public List<User> getList(@RequestBody User user) {
        // 可以根据具体参数来查询所有符合的用户，比如查询用户名称为张三的人，username='张三'
        //Log4jUtil.debug(this, "获取用户列表user=" + user);
        List<User> list = new ArrayList<User>();
        list.add(createUser(1));
        list.add(createUser(2));
        list.add(createUser(3));
        list.add(createUser(4));
        list.add(createUser(5));
        return list;
    }
    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody User user) {
        //Log4jUtil.debug(this, "新增用户：" + user);
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("user", user);
        dataMap.put("result", "新增用户成功");
        return dataMap;
    }
    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseBody
    public Object update(@RequestBody User user) {
        User u = createUser(5);
        u.setUserName(user.getUserName());
        //Log4jUtil.debug(this, "更新用户：" + user);
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("user", user);
        dataMap.put("result", "更新用户成功");
        return dataMap;
    }
    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
    @ResponseBody
    public Object delete(@PathVariable("userId") int userId) {
        //Log4jUtil.debug(this, "删除用户userId=" + userId);
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("result", "删除用户成功");
        return dataMap;
    }
    /**
     * 创建用户
     *
     * @param userId
     * @return
     */
    private User createUser(int userId) {
        User user = new User();
        user.setId(userId);
        user.setUserName("user" + userId);
        user.setPassword("123456");
        user.setEmail("user" + userId + "@xxx.com");
        return user;
    }
}
