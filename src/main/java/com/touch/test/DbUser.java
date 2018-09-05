package com.touch.test;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.test
 * @Author: yangshuai
 * @CreateTime: 2018-09-04 20:34
 * @Description: ${Description}
 */
public class DbUser {
    private JdbcTemplate jdbcTemplate;
    public void save(){
        jdbcTemplate.update("insert into ");
    }
}
