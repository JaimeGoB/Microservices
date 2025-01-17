package com.appsdeveloperblog.photoapp.api.users.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

	private Environment environment;
	
	@Autowired
	public WebSecurity(Environment environment)
	{
		this.environment = environment;
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception
	{
		http.csrf().disable();
		//We are permiting all requests made on this path.
		http.authorizeRequests().antMatchers("/**").hasIpAddress(environment.getProperty("gateway.ip"));
		//enable security for database
		http.headers().frameOptions().disable();
	}
}
