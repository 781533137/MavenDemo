package com.qf.wyg.dao;

import com.qf.wyg.config.SpringConfig;
import com.qf.wyg.seller.dao.ISellerDao;
import com.qf.wyg.seller.dao.impl.SellerDaoimpl;
import com.qf.wyg.test.entity.E_Peop;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyTest03 implements InvocationHandler {
    Object o;
    public MyTest03(Object o){
        this.o = o;
    }

    public Object test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        Object stu = context.getBean("text");
        System.out.println(stu);
        Object o1 = Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
        return o1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(o);
        return invoke;
    }
    @Test
    public void test02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ISellerDao datasource = ctx.getBean(SellerDaoimpl.class);
        System.out.println(datasource);
    }
}
