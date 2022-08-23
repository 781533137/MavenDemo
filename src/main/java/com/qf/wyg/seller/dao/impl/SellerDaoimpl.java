package com.qf.wyg.seller.dao.impl;

import com.qf.wyg.seller.dao.ISellerDao;
import com.qf.wyg.seller.entity.E_Seller;
import com.qf.wyg.db.DruidUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
@Repository
public class SellerDaoimpl implements ISellerDao {
    // 声明成员变量jdbctemplate
    // 自动装配注解，不需要setter方法
    @Autowired
    static JdbcTemplate template;
    static {
        template = new JdbcTemplate(DruidUtils.getDataSource());
    }

    @Override
    public boolean sellerSettled(E_Seller seller) {
        String sql = "insert into t_seller values(null,?,?,?,?,?,?,?,?,?,'2',null)";
        // 卖方与卖方类型关联1对1
        int update = template.update(sql, seller.getTname(), seller.getSeller_type().getStno(),
                seller.getTmobile(), seller.getTaccount(),
                seller.getTaddress(), seller.getTcontacts(),
                seller.getTtel(), seller.getTpassword());
        if (1 == update){
            // 商家入驻成功
            return true;
        }
        return false;
    }

    @Override
    public E_Seller findSellerByid(int tid) {
        E_Seller seller = new E_Seller();
        String sql = "select * from t_seller where tid = ?";
        try {
            Map<String, Object> map = template.queryForMap(sql,tid);
            BeanUtils.populate(seller,map);
        } catch (DataAccessException e) {
            // 表示表中没有该用户
            return seller;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        // 表示该用户在表中存在
        return seller;
    }

    @Override
    public boolean updateSellerByid(E_Seller seller) {
        String sql = "update t_seller set tstaus = ? where tid = ?";
        int update = template.update(sql, seller.getTstatus(), seller.getTid());
        if (1 == update){
            return true;
        }
        return false;
    }

    @Override
    public boolean delectSellerByid(E_Seller seller) {
        String sql = "delete from t_seller where tid = ？";
        int update = template.update(sql, seller.getTid());
        if (1 == update){
            return true;
        }
        return false;
    }

    @Override
    public boolean findSellerByUsername(String username) {
        String sql = "select * from t_seller where ? in (t_seller.taccount,t_seller.temail,t_seller.tmobile)";
        try {
            Map<String, Object> map = template.queryForMap(sql,username);
        } catch (DataAccessException e) {
            return false;
        }

        return true;
    }

    @Override
    public E_Seller findSellerByAll(String username,String password) {
        String sql = "select * from t_seller where ? and ? in (t_seller.taccount,t_seller.temail,t_seller.tmobile,t_seller.tpassword)";
        E_Seller seller = new E_Seller();
        try {
            Map<String, Object> map = template.queryForMap(sql, username, password);
            BeanUtils.populate(seller,map);
        } catch (DataAccessException | IllegalAccessException | InvocationTargetException e) {
            return seller;
        }
        return seller;
    }
}
