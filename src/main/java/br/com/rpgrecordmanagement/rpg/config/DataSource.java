package br.com.rpgrecordmanagement.rpg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSource {
    public static DriverManagerDataSource createDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@//hostname:port/servicename");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        return dataSource;
    }
}
