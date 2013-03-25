/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itopia.dryves.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataConfig {
	
	@Autowired
	private Environment env;
	
	@Bean(name="dataSource")
	public DataSource dataSource(){
	   DriverManagerDataSource dataSource = new DriverManagerDataSource();
	   dataSource.setDriverClassName( env.getRequiredProperty("hibernate.connection.driver_class") );
	   dataSource.setUrl( env.getRequiredProperty("hibernate.connection.url") );
	   dataSource.setUsername( env.getRequiredProperty("hibernate.connection.username") );
	   dataSource.setPassword( env.getRequiredProperty("hibernate.connection.password") );

	   return dataSource;
	}
	
}
