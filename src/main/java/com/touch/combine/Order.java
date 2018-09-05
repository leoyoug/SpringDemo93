package com.touch.combine;

/**
 * @BelongsProject: HbDemo2
 * @BelongsPackage: com.touch.test
 * @Author: yangshuai
 * @CreateTime: 2018-08-30 14:06
 * @Description: ${Description}
 */
public class Order {
    private Integer id;
    private String name;
    private Person person;

    public Order() {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
