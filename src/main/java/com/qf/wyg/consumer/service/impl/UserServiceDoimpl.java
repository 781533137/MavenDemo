package com.qf.wyg.consumer.service.impl;

import com.qf.wyg.consumer.dao.impl.UserDaoImpl;
import com.qf.wyg.consumer.entity.E_User;
import com.qf.wyg.consumer.service.IUserServiceDo;

import java.util.Scanner;

public class UserServiceDoimpl implements IUserServiceDo {
    @Override
    public void userRegisterDo(E_User user) {
        if (new UserDaoImpl().findUser(user)){
            System.out.println("可以注册");
            new UserDaoImpl().register(user);
        }else {
            System.out.println("该用户已存在");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入用户名");
        String username = input.next();
        System.out.println("请输入密码");
        String password = input.next();
        E_User user = new E_User(username,password);
        new UserServiceDoimpl().userRegisterDo(user);

    }
}
