package com.forum.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.Interceptor;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.forum.config" })
@PropertySource(value = { "classpath:application.properties" })
public class HibenateConfig {

	@Autowired
	private Environment environment;
//	@Autowired
//	private Interceptor interceptor;

	
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.forum.entity"});
		sessionFactory.setHibernateProperties(hibernateProperties());
//		sessionFactory.setEntityInterceptor(interceptor);
		return sessionFactory;
	}

	private Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect",environment.getRequiredProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql",environment.getRequiredProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql",environment.getRequiredProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto",environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}

	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		ds.setUrl(environment.getRequiredProperty("jdbc.url"));
		ds.setUsername(environment.getRequiredProperty("jdbc.username"));
		ds.setPassword(environment.getRequiredProperty("jdbc.password"));
		return ds;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory s) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(s);
		return txManager;
	}

}
