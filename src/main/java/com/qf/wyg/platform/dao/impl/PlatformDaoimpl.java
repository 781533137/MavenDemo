package com.qf.wyg.platform.dao.impl;

import com.qf.wyg.db.DruidUtils;
import com.qf.wyg.platform.dao.IPlatformDao;
import com.qf.wyg.platform.entity.E_Department;
import com.qf.wyg.platform.entity.E_Platform;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlatformDaoimpl implements IPlatformDao {
    // 声明成员变量jdbctemplate
    static JdbcTemplate template;
    static {
        template = new JdbcTemplate(DruidUtils.getDataSource());
    }

    @Override
    public boolean delete(int pfid) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(E_Platform platform) {
        E_Platform pm = getPlatform(platform.getPfid());
        if (pm == null){
            // 如果查询结果为空证明此数据可以插入
            String sql = "insert into t_platform values(null,?,?,?,?,?,?)";
            template.update(sql,platform.getPfno(),platform.getPfname(),
                    platform.getPfaddress(),platform.getPfcontacts(),
                    platform.getPftelForContacts(),platform.getPfstatus());
            return true;
        }else {
            //TODO 如果查询结果不为空说明此数据可以修改
            //TODO 开启批处理指令添加在URL下：rewriteBatchedStatements=true
        }
        return false;
    }

    @Override
    public E_Platform getPlatform(String pfno) {
        return null;
    }

    @Override
    public E_Platform getPlatform(int pfid) {
        E_Platform platform = new E_Platform();
        String sql = "select * from t_platform where pfid = ?";
        try {
            Map<String, Object> map = template.queryForMap(sql,pfid);
            BeanUtils.populate(platform,map);
        } catch (DataAccessException | IllegalAccessException | InvocationTargetException e) {
            return platform;
        }
        return platform;
    }

    @Override
    public E_Department getDepartment(E_Department e_department) {
        // 传入的参数是根部门
        List<Map<String, Object>> list = new ArrayList();
        // 这两个问号肯定都是随时改变的
        String sql = "select * from t_department where ? = pno";
        Map<String, Object> map = null;
        E_Department e_department1 = null;
        try {
            e_department1 = new E_Department();
            map = template.queryForMap(sql, e_department.getDno());
            BeanUtils.populate(e_department1,map);
        } catch (DataAccessException e) {
            return e_department;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        list.add(map);
        e_department.setDepList(list);
        return getDepartment(e_department1);
    }


    @Override
    public E_Department getDepartment(String dno) {
        String sql = "select * from t_department where dno = ?";
        Map<String, Object> map = null;
        E_Department e_department = new E_Department();
        try {
            // 先将跟部门的对象从数据库中找出然后关联
            map = template.queryForMap(sql,dno);
            BeanUtils.populate(e_department,map);
        } catch (DataAccessException | IllegalAccessException | InvocationTargetException e) {
            return  e_department;
        }
        return e_department;
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("五子棋");
        jFrame.setSize(600,800);
        jFrame.setVisible(true);
    }
}
