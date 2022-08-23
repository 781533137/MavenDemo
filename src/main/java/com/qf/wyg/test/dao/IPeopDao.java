package com.qf.wyg.test.dao;

import com.qf.wyg.test.entity.E_Peop;
import com.qf.wyg.test.entity.E_Text;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPeopDao {
    /*
    找到所有的信息
     */
    E_Text selectPeopById(Integer sid);
    /*
    向数据库中插入一个学生
     */
    int insertStudent(E_Peop peop);
}
