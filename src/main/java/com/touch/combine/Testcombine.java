package com.touch.combine;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.combine
 * @Author: yangshuai
 * @CreateTime: 2018-09-04 21:28
 * @Description: ${Description}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class Testcombine {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Autowired
    private ServiceUser servicei;
    @Test
    public void test1(){
        User u=new User();
        u.setName("杨帅");
        u.setPassword("123asas");
        servicei.saveuser(u);
    }
}
