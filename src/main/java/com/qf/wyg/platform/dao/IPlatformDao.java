package com.qf.wyg.platform.dao;

import com.qf.wyg.platform.entity.E_Department;
import com.qf.wyg.platform.entity.E_Platform;

public interface IPlatformDao {

    public boolean delete(int pfid);

    //新增或更新《没有的话就新增,有的话就更新》
    public boolean saveOrUpdate(E_Platform platform);

    public E_Platform getPlatform(String pfno);

    public E_Platform getPlatform(int pfid);

    E_Department getDepartment(E_Department e_department);

    E_Department getDepartment(String dno);

}
