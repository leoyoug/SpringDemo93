package com.touch.test;

import java.util.Date;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.test
 * @Author: yangshuai
 * @CreateTime: 2018-09-03 18:58
 * @Description: ${Description}
 */
public class User {
    private int id;
    private String name;
    private String password;
    private Date birthday;

    public User() {
    }

    public User(int id, String name, String password, Date birthday) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
