package com.touch.web.service;

import com.touch.combine.User;
import com.touch.web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.web.service
 * @Author: yangshuai
 * @CreateTime: 2018-09-05 20:52
 * @Description: ${Description}
 */
@Service
public class Userservice {
    @Autowired
    private UserDao userDao;
    public List<User> findall(){
       return userDao.findall();
    }

}
