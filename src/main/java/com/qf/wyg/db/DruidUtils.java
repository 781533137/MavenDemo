package com.qf.wyg.db;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 获得数据库连接池源，通过JdbcTemple达到简化SQL语句的目的
 */
public class DruidUtils {
    //1.定义成员变量DataSource
    private static DataSource ds ;
    static {
        Properties pro = new Properties();
        InputStream is = DruidUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        // 4.获取连接池对象
        try {
            pro.load(is);
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
     * 获取连接
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    /*
     * 释放资源
     */
    public static void close(Statement stmt, Connection conn) {
        // 简化代码
        close(null, stmt, conn);
    }
    /*
     * 重载
     */
    public static void close(ResultSet rs, Statement stmt, Connection conn) {

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close(); // 归还连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /*
     * 获取连接池的方法
     */
    public static DataSource getDataSource() {
        return ds;
    }
}
