package com.qf.wyg;

import com.qf.wyg.config.SpringConfig;
import com.qf.wyg.seller.entity.E_Seller;
import com.qf.wyg.seller.service.ISellerService;
import com.qf.wyg.test.dao.IPeopDao;
import com.qf.wyg.test.entity.E_Peop;
import com.qf.wyg.test.entity.E_Text;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// 使用Spring整合Junit的专用类加载器
@SpringJUnitConfig(SpringConfig.class)
public class AppConfigurationTest {
    // 自动装配
    @Autowired
    private IPeopDao peopDao;
    @Test
    public void test01(){
        E_Text peop = peopDao.selectPeopById(2);
        System.out.println(peop);
    }
}
