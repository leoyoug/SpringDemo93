package com.touch.combine;

import java.util.HashSet;
import java.util.Set;

/**
 * @BelongsProject: HbDemo2
 * @BelongsPackage: com.touch.test
 * @Author: yangshuai
 * @CreateTime: 2018-08-30 14:05
 * @Description: ${Description}
 */
public class Person {
    private Integer id;
    private String name;
    private Set<Order> orderSet=new HashSet<Order>();
    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }

    public Person() {
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
