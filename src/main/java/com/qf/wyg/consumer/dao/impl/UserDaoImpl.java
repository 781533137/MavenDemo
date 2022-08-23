package com.qf.wyg.consumer.dao.impl;

import com.qf.wyg.consumer.dao.IUserDao;
import com.qf.wyg.consumer.entity.E_User;
import com.qf.wyg.db.DruidUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class UserDaoImpl implements IUserDao {
    // 声明成员变量jdbctemplate
    static JdbcTemplate template;
    static {
        template = new JdbcTemplate(DruidUtils.getDataSource());
    }
    @Override
    public boolean register(E_User user) {
        String sql = "insert into t_userx values(null,?,?,?)";
        int update = template.update(sql, user.getUsername(), user.getPassword(),100000);
        if (update != 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean findUser(E_User user) {
        try {
            String sql = "select * from t_userx where username = ?";
            Map<String, Object> map = template.queryForMap(sql,user.getUsername());
        } catch (DataAccessException e) {
            return true;
        }
        return false;
    }
}
