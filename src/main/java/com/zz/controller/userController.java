package com.zz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.pojo.User;
import com.zz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeDebug.map;

@RestController
@RequestMapping("after/user")
public class userController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public Map findAll(Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<User> users = userService.findAll();
        System.out.println(users);
        PageInfo<User> pageInfo = new PageInfo<>(users);

        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());

        return map;
    }


    @RequestMapping("deleteById")
    public int deleteById (Integer id){
        return userService.deleteById(id);
    }

    @RequestMapping("updateById")
    public void updateById(User user){
        userService.updateById(user);
    }

    @RequestMapping("addUser")
    public int addUser(User user){
        return userService.addUser(user);
    }
    @RequestMapping("deleteByIds")
    public int deleteByIds(Integer[] ids){
        return userService.deleteByIds(ids);
    }


}
