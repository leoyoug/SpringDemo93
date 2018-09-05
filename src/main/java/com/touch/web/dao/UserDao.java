package com.touch.web.dao;

import com.touch.combine.User;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: SpringDemo93
 * @BelongsPackage: com.touch.web.dao
 * @Author: yangshuai
 * @CreateTime: 2018-09-05 20:48
 * @Description: ${Description}
 */
@Repository
public class UserDao extends HibernateDaoSupport {

    public List<User> findall(){
        List<User> u= (List<User>) this.getHibernateTemplate().find("from User");
        return u;
    }
}
