package com.em.eddieweb.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.em.eddieweb.common.config.druid.BaseDruid;
import com.em.eddieweb.common.config.druid.EddieDruid;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * MybatisConfig class
 *
 * @author Administrator
 * @date
 */
@Configuration
@MapperScan("com.em.eddieweb.dao")
public class MybatisConfig {

    @Autowired
    private EddieDruid eddieDruid;

    @Bean
    public DataSource webDataSource(){
        return getDataSource(eddieDruid);
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(webDataSource());
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.em.eddieweb.domain");
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return sqlSessionFactoryBean;
    }

    private DataSource getDataSource(BaseDruid baseDruid){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setUrl(baseDruid.getUrl());
        dataSource.setUsername(baseDruid.getUsername());//用户名
        dataSource.setPassword(baseDruid.getPassword());//密码
        dataSource.setDriverClassName(baseDruid.getDrivername());
        dataSource.setInitialSize(baseDruid.getInitMaxConn());//初始化时建立物理连接的个数
        dataSource.setMaxActive(baseDruid.getMaxPoolConn());//最大连接池数量
        dataSource.setMinIdle(baseDruid.getMinPoolConn());//最小连接池数量
        dataSource.setMaxWait(baseDruid.getWaitTimeOut());//获取连接时最大等待时间，单位毫秒。
        dataSource.setValidationQuery(baseDruid.getValidSql());//用来检测连接是否有效的sql
        dataSource.setTestOnBorrow(baseDruid.getTestOnBorrow());//申请连接时执行validationQuery检测连接是否有效
        dataSource.setTestWhileIdle(baseDruid.getTestWhileIdle());//建议配置为true，不影响性能，并且保证安全性。
        dataSource.setPoolPreparedStatements(baseDruid.getPoolPreparedStatements());//是否缓存preparedStatement，也就是PSCache
        return dataSource;
    }

}
