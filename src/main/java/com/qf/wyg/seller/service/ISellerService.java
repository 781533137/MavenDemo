package com.qf.wyg.seller.service;

import com.qf.wyg.seller.entity.E_Seller;
import org.springframework.stereotype.Service;

@Service
public interface ISellerService {
    // 注册
    boolean sellerRegister(E_Seller seller);
    // 登录
    E_Seller sellerLogin(String username,String password);
}
