package com.osn.dbservice;


import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

/*@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
@EntityScan("com.osn.dbservice.entity")
public class DBConfiguration {


    @Primary
    @Bean(name = "db1DataSource")
    @ConfigurationProperties("app.datasource.db1")
    public DataSource db1DataSource() {

     return DataSourceBuilder.create().build();

    }


    //connection objects for the remaining 2 databases
    @Bean(name = "db2DataSource")
    @ConfigurationProperties("app.datasource.db2")
    public DataSource db2DataSource() {
        return DataSourceBuilder.create().build();
    }
}*/

