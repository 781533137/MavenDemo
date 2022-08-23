package com.qf.wyg.test.dao;

import com.qf.wyg.test.entity.E_Text;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentDao {
    @Select("select * from t_text where sid = #{sid}")
    E_Text selectStu(@Param("sid") Integer sid);

    List<E_Text> selectStuAll();

    Integer deleteStuBySid(@Param("sids") Integer[]sids);
}
