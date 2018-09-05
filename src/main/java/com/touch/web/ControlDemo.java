package com.touch.web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.touch.combine.User;
import com.touch.web.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.web
 * @Author: yangshuai
 * @CreateTime: 2018-09-05 16:18
 * @Description: ${Description}
 */
@Controller
public class ControlDemo {
    @Autowired
    private Userservice userservice;
    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("list");
        List<User> list;
        list=userservice.findall();
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
