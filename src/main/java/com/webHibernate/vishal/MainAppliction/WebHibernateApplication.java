package com.webHibernate.vishal.MainAppliction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(exclude =  HibernateJpaAutoConfiguration.class)
@SpringBootApplication
@ComponentScan("com.webHibernate.vishal")
@EntityScan(basePackages = "nate.com.webHibernate.vishal.model")
public class WebHibernateApplication 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext cfg=SpringApplication.run(WebHibernateApplication.class, args);
		
				
	}

}
