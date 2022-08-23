package com.qf.wyg.test.service;

import com.qf.wyg.config.SpringConfig;
import com.qf.wyg.test.dao.IPeopDao;
import com.qf.wyg.test.dao.IStudentDao;
import com.qf.wyg.test.entity.E_Peop;
import com.qf.wyg.test.entity.E_Text;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Test01 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        IStudentDao bean = ctx.getBean(IStudentDao.class);
        E_Text text = bean.selectStu(1);
        System.out.println(text);

    }
}
