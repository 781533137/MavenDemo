package com.qf.wyg.seller.service.impl;

import com.qf.wyg.seller.dao.impl.SellerDaoimpl;
import com.qf.wyg.seller.entity.E_Seller;
import com.qf.wyg.seller.service.ISellerService;
import com.qf.wyg.db.DruidUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class SellerService implements ISellerService {
    // 声明成员变量jdbctemplate
    static JdbcTemplate template;
    static {
        template = new JdbcTemplate(DruidUtils.getDataSource());
    }

    @Override
    public boolean sellerRegister(E_Seller seller) {
        // 如果该用户在中存在的话，则注册失败
        E_Seller sele = new SellerDaoimpl().findSellerByid(seller.getTid());
        return (sele.getTname()!=null)?false:new SellerDaoimpl().sellerSettled(seller);
    }

    @Override
    public E_Seller sellerLogin(String username,String password) {
        // 如果该用户在表中存在，则登录成功
        E_Seller sele = new SellerDaoimpl().findSellerByAll(username,password);
        // 不管空不空直接给servlet传过去在servlet中进行判断
        return sele;
    }
}
