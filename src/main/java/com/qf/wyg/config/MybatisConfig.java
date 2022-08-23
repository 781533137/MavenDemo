package com.qf.wyg.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    /*
    创建基础配置工厂
     */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        // 设置结果集实体类型的别名
//        ssfb.setTypeAliasesPackage("com.qf.wyg.test.entity");
        ssfb.setTypeAliasesPackage("com.qf.wyg");
        // 配置数据源
        ssfb.setDataSource(dataSource);
        return ssfb;
    }
    /*
    创建映射扫描配置,确认接口使用其接口下方法
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        // 扫描映射包--该包中的xml文件配置在源文件下
//        msc.setBasePackage("com.qf.wyg.test.dao");
        msc.setBasePackage("com.qf.wyg");
        return msc;
    }
}
