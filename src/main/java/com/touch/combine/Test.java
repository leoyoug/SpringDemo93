package com.touch.combine;

import com.touch.test.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;

/**
 * @BelongsProject: HbDemo2
 * @BelongsPackage: com.touch.test
 * @Author: yangshuai
 * @CreateTime: 2018-08-28 18:56
 * @Description: ${Description}
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ApplicationContext app=new ClassPathXmlApplicationContext("bean.xml");
        SessionFactory sessionFactory= (SessionFactory) app.getBean("sessionFactory");
        Session session=sessionFactory.openSession();
        User user=new User();
        user.setName("杨帅");
        user.setPassword("123445431");
        session.save(user);
    }

    public void test1(){
        File file=new File("1.txt");
//        if (!file.exists()){
//            file.createNewFile();
//        }
        Configuration cn=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cn.buildSessionFactory();
        Session session=factory.openSession();
        Transaction ts= session.beginTransaction();
        User user=new User();
        user.setName("tom");
        user.setPassword("12345");
        session.save(user);
        ts.commit();
    }
    public static void test2(){
        Configuration cn=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cn.buildSessionFactory();
        Session session=factory.openSession();
        Transaction ts= session.beginTransaction();
        Person p=new Person();
        p.setName("tomcat");

        Order or=new Order();
        or.setName("肥皂");
        Order or1=new Order();
        or1.setName("手机");
        p.getOrderSet().add(or);
        p.getOrderSet().add(or1);
        session.save(p);
        session.save(or);
        session.save(or1) ;
        ts.commit();
    }

}
