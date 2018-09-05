package com.touch.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.test
 * @Author: yangshuai
 * @CreateTime: 2018-09-03 19:01
 * @Description: ${Description}
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("bean.xml");
        Service service= (Service) app.getBean("service");
        service.finduser();
    }


}
