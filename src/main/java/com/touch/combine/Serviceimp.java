package com.touch.combine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.combine
 * @Author: yangshuai
 * @CreateTime: 2018-09-05 15:16
 * @Description: ${Description}
 */
@Service
public class Serviceimp implements ServiceUser{
    @Autowired
    private HibernateTemplate template;
    public void saveuser(User user){
        template.save(user);
    }
}
