package com.qf.wyg.seller.dao;

import com.qf.wyg.seller.entity.E_Seller;

public interface ISellerDao {
    // 卖家商户要入驻
    boolean sellerSettled(E_Seller seller);
    // 查找该商户在表中是否存在
    E_Seller findSellerByid(int tid);
    // 更改商户信息
    boolean updateSellerByid(E_Seller seller);
    // 删除商户信息
    boolean delectSellerByid(E_Seller seller);
    // 判断当前用户的用户名、手机号、邮箱是否存在
    boolean findSellerByUsername(String all);
    // 判断当前用户的用户名、手机号、邮箱和密码是否存在与表中
    E_Seller findSellerByAll(String username,String password);
}
