package com.touch.test;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Date;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.test
 * @Author: yangshuai
 * @CreateTime: 2018-09-03 19:01
 * @Description: ${Description}
 */
public class AdviseUser {
    public void log(){
        System.out.println("记录了日志");
    }
    public void around(ProceedingJoinPoint joinPoint){
        Date d=new Date();
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        Date date=new Date();
        System.out.println(date.getTime()-d.getTime());

    }
}
